package com.news.keep.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.news.keep.R;
import com.news.keep.bean.People;
import com.news.keep.fragment.Login_Dialog;
import com.news.keep.utils.Constans;
import com.news.keep.view.RoundImageView;
import com.news.keep.view.model.BitmapDraw;

import java.util.HashMap;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import cn.bmob.v3.listener.SaveListener;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.PlatformDb;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.wechat.friends.Wechat;
import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;
import cn.smssdk.gui.RegisterPage;

public class Splash1Activity extends AppCompatActivity implements PlatformActionListener {
    private static final int REQUEST_CODE = 0; // 请求码


    @InjectView(R.id.login_img_qq)
    RoundImageView loginImgQq;
    @InjectView(R.id.login_img_wechat)
    RoundImageView loginImgWechat;
    @InjectView(R.id.login_img_weibo)
    RoundImageView loginImgWeibo;
    @InjectView(R.id.splash1_register)
    Button splash1Register;
    @InjectView(R.id.splash1_login)
    Button splash1Login;
    @InjectView(R.id.splash1_linear)
    LinearLayout splash1Linear;
    @InjectView(R.id.splash1_reat)
    RelativeLayout splash1Reat;
    private Bitmap bitmap;
    private BitmapDraw bitmapDraw;
    RegisterPage registerPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //取消标题栏
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash1);
        ButterKnife.inject(this);
        //初始化sharedSDK的短信SDK
        SMSSDK.initSDK(this, Constans.Mob_SMS_ID, Constans.MOb_SMS_SCRECT);
        registerPage = new RegisterPage();


        //暂时不加高斯模糊
        //   bitmap = bitmapDraw.blurBitmap(getApplicationContext(),splash1Linear.getDrawingCache
        // ());


    }


    @OnClick({R.id.login_img_qq, R.id.login_img_wechat, R.id.login_img_weibo, R.id
            .splash1_register, R.id.splash1_login})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_img_qq:
                Platform qq = ShareSDK.getPlatform(QQ.NAME);
                authorize(qq);
                break;
            case R.id.login_img_wechat:
                //微信登录
                //测试时，需要打包签名；sample测试时，用项目里面的demokey.keystore
                //打包签名apk,然后才能产生微信的登录
                Platform wechat = ShareSDK.getPlatform(Wechat.NAME);
                authorize(wechat);
                break;
            case R.id.login_img_weibo:
                Platform weibo = ShareSDK.getPlatform(SinaWeibo.NAME);
                authorize(weibo);
     /*           weibo.SSOSetting(false);  //设置false表示使用SSO授权方式
                weibo.setPlatformActionListener(this); // 设置分享事件回调
                weibo.showUser(null);//执行登录，登录后在回调里面获取用户资料
                weibo.authorize();*/
                break;
            case R.id.splash1_register:
                registerPage.setRegisterCallback(new EventHandler() {
                    public void afterEvent(int event, int result, Object data) {
                        // 解析注册结果
                        if (result == SMSSDK.RESULT_COMPLETE) {
                            @SuppressWarnings("unchecked")
                            HashMap<String, Object> phoneMap = (HashMap<String, Object>) data;
                            String country = (String) phoneMap.get("country");
                            String phone = (String) phoneMap.get("phone");
                            System.out.println(country + ":" + phone);
                            Intent intent = new Intent(Splash1Activity.this, Register1Activity
                                    .class);
                            intent.putExtra("phone", phone);
                            startActivity(intent);
                            // 提交用户信息
                            //  registerUser(country, phone);
                        }
                    }
                });
                registerPage.show(this);


                break;
            case R.id.splash1_login:
                Login_Dialog newFragment = Login_Dialog.newInstance();
                newFragment.show(getSupportFragmentManager(), "dialog");
                break;
        }
    }

    private void authorize(Platform plat) {
        plat.setPlatformActionListener(this);
        // true不使用SSO授权，false使用SSO授权
        plat.SSOSetting(true);
        //获取用户资料
        plat.showUser(null);
    }

    public void onComplete(Platform platform, int action, HashMap<String, Object> res) {
        final String name,icon;
        //获取用户数据
        if (action == Platform.ACTION_USER_INFOR) {
            PlatformDb platDB = platform.getDb();//获取数平台数据DB
            //通过DB获取各种数据
            name=platDB.getUserName();
            icon=platDB.getUserIcon();


        registerPage.setRegisterCallback(new EventHandler() {
            public void afterEvent(int event, int result, Object data) {
                // 解析注册结果
                if (result == SMSSDK.RESULT_COMPLETE) {
                    @SuppressWarnings("unchecked")
                    HashMap<String, Object> phoneMap = (HashMap<String, Object>) data;
                    String country = (String) phoneMap.get("country");
                    String phone = (String) phoneMap.get("phone");
                    System.out.println(country + ":" + phone);
                    final People user = new People();
                    user.setUsername(phone);
                    user.setPeoimg(icon);
                    user.setNickname(name);
                    user.signUp(Splash1Activity.this, new SaveListener() {
                        @Override
                        public void onSuccess() {
                            Intent intent = new Intent(Splash1Activity.this, MainActivity.class);
                            startActivity(intent);
                            Splash1Activity.this.finish();
                        }
                        @Override
                        public void onFailure(int code, String arg0) {
                            // 添加失败
                            System.out.println(arg0 + ":" + code);
                        }
                    });

                    Intent intent = new Intent(Splash1Activity.this, MainActivity.class);
                    startActivity(intent);
                    // 提交用户信息
                    //  registerUser(country, phone);
                }
            }
        });
        registerPage.show(this);
        }
    }

    public void onError(Platform platform, int action, Throwable t) {

        t.printStackTrace();
    }

    public void onCancel(Platform platform, int action) {

    }

}
