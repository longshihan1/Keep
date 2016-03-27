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
import com.news.keep.utils.Constans;
import com.news.keep.view.Login_Dialog;
import com.news.keep.view.RoundImageView;
import com.news.keep.view.model.BitmapDraw;

import java.util.HashMap;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;
import cn.smssdk.gui.RegisterPage;

public class Splash1Activity extends AppCompatActivity {
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //取消标题栏
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash1);
        ButterKnife.inject(this);
        //初始化sharedSDK的短信SDK
        SMSSDK.initSDK(this, Constans.Mob_SMS_ID, Constans.MOb_SMS_SCRECT);


        //暂时不加高斯模糊
        //   bitmap = bitmapDraw.blurBitmap(getApplicationContext(),splash1Linear.getDrawingCache());


    }


    @OnClick({R.id.login_img_qq, R.id.login_img_wechat, R.id.login_img_weibo, R.id.splash1_register, R.id.splash1_login})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_img_qq:
                break;
            case R.id.login_img_wechat:
                break;
            case R.id.login_img_weibo:
                break;
            case R.id.splash1_register:
                RegisterPage registerPage = new RegisterPage();
                registerPage.setRegisterCallback(new EventHandler() {
                    public void afterEvent(int event, int result, Object data) {
                        // 解析注册结果
                        if (result == SMSSDK.RESULT_COMPLETE) {
                            @SuppressWarnings("unchecked")
                            HashMap<String, Object> phoneMap = (HashMap<String, Object>) data;
                            String country = (String) phoneMap.get("country");
                            String phone = (String) phoneMap.get("phone");
                            System.out.println(country + ":" + phone);
                            Intent intent = new Intent(Splash1Activity.this, Register1Activity.class);
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
}
