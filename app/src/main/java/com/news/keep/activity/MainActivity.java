package com.news.keep.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.news.keep.R;
import com.news.keep.utils.FragmentFactory;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    @InjectView(R.id.cgt_fl_content)
    FrameLayout cgtFlContent;
    @InjectView(R.id.middle)
    View middle;
    @InjectView(R.id.cgt_rb_weixin)
    RadioButton cgtRbWeixin;
    @InjectView(R.id.cgt_rb_addressbook)
    RadioButton cgtRbAddressbook;
    @InjectView(R.id.cgt_rb_find)
    RadioButton cgtRbFind;
    @InjectView(R.id.cgt_rb_me)
    RadioButton cgtRbMe;
    @InjectView(R.id.cgt_rg_tab)
    RadioGroup cgtRgTab;
/*
    @InjectView(R.id.main_viewpager)
    ViewPager mainViewpager;
    @InjectView(R.id.main_bottom)
    LinearLayout mainBottom;
    private boolean isFound = false;
    private Timer timer = new Timer();
    public static final int TIME = 900000;
    public static final int HAN = 1000;

    private List<Fragment> mFragments = new ArrayList<Fragment>();
    private ToolBarUtils mToolBarUtil;
    private String[] mToolBarTitleArr;*/

    private FragmentManager mFragmentManager;
    private RadioGroup mRg_tab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        initView();
        initdata();

        initListener();

    }

    private void initView() {
        mFragmentManager = getSupportFragmentManager();
        cgtRgTab.setOnCheckedChangeListener(this);
    }

    private void initListener() {

    }

    private void initdata() {
        int id =1;

        showPreviousPage(id);

    }

    /**
     * 双击退出函数
     */
    private static Boolean isExit = false;

    private void exitBy2Click() {
        Timer tExit = null;
        if (isExit == false) {
            isExit = true; // 准备退出
            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
            tExit = new Timer();
            tExit.schedule(new TimerTask() {
                @Override
                public void run() {
                    isExit = false; // 取消退出
                }
            }, 2000); // 如果2秒钟内没有按下返回键，则启动定时器取消掉刚才执行的任务

        } else {
            finish();
            System.exit(0);
        }
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
    }
    /**
     * 显示上次退出时的页面
     *
     * @param id
     */
    private void showPreviousPage(int id) {
        RadioButton mRb_show = null;
        switch (id) {
            case 1:
                mRb_show = (RadioButton) findViewById(R.id.cgt_rb_weixin);
                break;
            case 2:
                mRb_show = (RadioButton) findViewById(R.id.cgt_rb_addressbook);
                break;
            case 3:
                mRb_show = (RadioButton) findViewById(R.id.cgt_rb_find);
                break;
            case 4:
                mRb_show = (RadioButton) findViewById(R.id.cgt_rb_me);
                break;
            default:
                mRb_show = (RadioButton) findViewById(R.id.cgt_rb_weixin);
                break;
        }
        mRb_show.setChecked(true);
        ShowFragmen(id);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int id = 1;
        switch (checkedId) {
            case R.id.cgt_rb_weixin:
                id = 1;
                break;
            case R.id.cgt_rb_addressbook:
                id = 2;
                break;
            case R.id.cgt_rb_find:
                id = 3;
                break;
            case R.id.cgt_rb_me:
                id = 4;
                break;
            default:
                id = 1;
                break;
        }
        ShowFragmen(id);
    }
    /**
     * 显示Fragment页面
     *
     * @param id
     */
    private void ShowFragmen(int id) {
        FragmentTransaction transaction = mFragmentManager.beginTransaction();
        Fragment fragment = FragmentFactory.getInstanceByIndex(id);
        transaction.replace(R.id.cgt_fl_content, fragment);
        transaction.commit();
    }
}