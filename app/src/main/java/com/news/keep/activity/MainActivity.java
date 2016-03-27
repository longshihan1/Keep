package com.news.keep.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.news.keep.R;
import com.news.keep.fragment.AttentionFragment;
import com.news.keep.fragment.FindFragment;
import com.news.keep.fragment.PersonFragment;
import com.news.keep.fragment.TrainFragment;
import com.news.keep.utils.ToolBarUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

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
    private String[] mToolBarTitleArr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        initdata();

        initListener();

    }

    private void initListener() {
        mainViewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                // 修改颜色
                mToolBarUtil.changeColor(position);


            }

            @Override
            public void onPageScrollStateChanged(int state) {


            }
        });
        mToolBarUtil.setOnToolBarClickListener(new ToolBarUtils.OnToolBarClickListener() {
            @Override
            public void onToolBarClick(int position) {
                mainViewpager.setCurrentItem(position);
            }
        });
    }

    private void initdata() {
        // 添加fragment到集合中
        mFragments.add(new TrainFragment());
        mFragments.add(new FindFragment());
        mFragments.add(new AttentionFragment());
        mFragments.add(new PersonFragment());
        mainViewpager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        //底部按钮
        mToolBarUtil = new ToolBarUtils();
        //文字内容
        mToolBarTitleArr = new String[]{"健身", "发现", "关注", "我"};
        // 图标内容
        int[] iconArr = {R.drawable.png_train, R.drawable.png_find, R.drawable.png_activity, R.drawable.png_me};
        mToolBarUtil.createToolBar(mainBottom, mToolBarTitleArr, iconArr);
        // 设置默认选中会话
        mToolBarUtil.changeColor(0);
    }

    class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
         * Return the Fragment associated with a specified position.
         *
         * @param position
         */
        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        /**
         * Return the number of views available.
         */
        @Override
        public int getCount() {
            return 4;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitBy2Click(); // 调用双击退出函数
        }
        return false;
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

}