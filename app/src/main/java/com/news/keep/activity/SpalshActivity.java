package com.news.keep.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.news.keep.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class SpalshActivity extends AppCompatActivity implements Animation.AnimationListener {
    public final static String PROMPT_DIALOG_TAG = "PROMPT_DIALOG_TAG";
    @InjectView(R.id.splash_img)
    ImageView splashImg;

    private Animation alphaAnimation = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //取消标题栏
        getSupportActionBar().hide();
        setContentView(R.layout.activity_spalsh);
        ButterKnife.inject(this);


        initView();
    }

    private void initView() {
        alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.splash_alpha);
        alphaAnimation.setFillEnabled(true);//启动Fill保持
        alphaAnimation.setFillAfter(true);//设置动画的最后一帧是保留在view上的
        splashImg.setAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(this);


    }


    @Override
    public void onAnimationStart(Animation animation) {


    }

    @Override
    public void onAnimationEnd(Animation animation) {
        if (true) {
            //动画结束时结束欢迎页面并跳转到主页面
            Intent intent = new Intent(this, Splash1Activity.class);
            startActivity(intent);
            this.finish();
        } else {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            this.finish();
        }
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    public boolean onKeyDown(int KeyCode, KeyEvent event) {
        //在欢迎页面屏蔽BACK键
        if (KeyCode == KeyEvent.KEYCODE_BACK) {
            return false;
        }
        return false;

    }
}
