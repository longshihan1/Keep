package com.news.keep.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.news.keep.R;
import com.news.keep.activity.Train_add;
import com.news.keep.adapter.TrainPageAdapter;
import com.news.keep.bean.People;
import com.news.keep.bean.Train_Display;
import com.news.keep.utils.ToolBarUtils;
import com.news.keep.view.PoritionView;
import com.news.keep.view.StarLinearLayout;
import com.news.keep.view.TopBar;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobPointer;
import cn.bmob.v3.listener.FindListener;

/**
 * A simple {@link Fragment} subclass.
 */
public class TrainFragment extends Fragment {
    private String TAG = "TrainFragment";
    @InjectView(R.id.train_zaixian_time)
    TextView trainZaixianTime;
    @InjectView(R.id.train_city)
    TextView trainCity;
    @InjectView(R.id.train_location)
    ImageView trainLocation;
    @InjectView(R.id.train_plan)
    ImageView trainPlan;
    @InjectView(R.id.train_add)
    ImageView trainAdd;
    @InjectView(R.id.train_viewpage_three)
    ViewPager trainViewpageThree;
    @InjectView(R.id.train_viewpage_three_round)
    LinearLayout trainViewpageThreeRound;
    @InjectView(R.id.train_main_scroll)
    ScrollView trainMainScroll;
    @InjectView(R.id.train_add_lesson)
    Button trainAddLesson;
    @InjectView(R.id.train_main_lv)
    ListView trainMainLv;
    private TopBar topBar;
    private Context context;
    private StarLinearLayout starsLayout;

    private PoritionView poritonView = null;
    // 屏幕的长和宽
    int screenWidth, screenHeight;
    private List<Train_Display.CategoriesBean> lists;
    private TrainPageAdapter adapter;


    private List<Fragment> mFragments = new ArrayList<Fragment>();
    private ToolBarUtils mToolBarUtil;
    private String[] mToolBarTitleArr;
    public int currentpositon = 0;
    public int oldpositon = 0;

    //viewpage的几张图
    private Train_addFragment train_addFragment;
    private Train_dataFragment train_dataFragment;
    private Train_dayFragment train_dayFragment;

    public TrainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_train, container, false);
        ButterKnife.inject(this, view);

        lists = new ArrayList<Train_Display.CategoriesBean>();
        adapter = new TrainPageAdapter(context, trainMainLv, lists);

        initView();
        initData();
        initListener();
        return view;
    }

    private void initView() {
        BmobUser bmobUser = BmobUser.getCurrentUser(getActivity());
        String user_id = bmobUser.getObjectId();
        BmobQuery<Train_Display.CategoriesBean> query = new BmobQuery<Train_Display.CategoriesBean>();
        People post = new People();
        post.setObjectId(user_id);
        query.addWhereRelatedTo("UserAtt", new BmobPointer(post));
        query.findObjects(getActivity(), new FindListener<Train_Display.CategoriesBean>() {

            @Override
            public void onSuccess(List<Train_Display.CategoriesBean> list) {
                System.out.println(list.size()+"----lllllllllll");
                adapter.setData(list);
                trainMainLv.setAdapter(adapter);
                setListViewHeightBasedOnChildren(trainMainLv);
            }

            @Override
            public void onError(int code, String msg) {
                Log.i("life", "查询失败：" + code + "-" + msg);
            }
        });

        // 添加fragment到集合中
        mFragments.add(train_dataFragment);
        mFragments.add(train_dayFragment);
        mFragments.add(train_addFragment);
        trainViewpageThree.setAdapter(new MyPagerAdapter(getActivity().getSupportFragmentManager()));
        addPointView();
    }

    private void initData() {

    }

    @OnClick({R.id.train_add_lesson, R.id.train_city, R.id.train_location, R.id.train_plan, R.id.train_add})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.train_add_lesson:
                Intent intent = new Intent(getActivity(), Train_add.class);
                startActivity(intent);
                break;
            case R.id.train_city:
                break;
            case R.id.train_location:
                break;
            case R.id.train_plan:
                break;
            case R.id.train_add:
                break;
        }
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
            return 3;
        }
    }

    private void initListener() {
        trainViewpageThree.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                int currentP = position % mFragments.size();
                // 更新小点点颜色
                changePointView2(oldpositon, currentP);
                oldpositon = currentP;
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    /**
     * 先运行
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();

        train_addFragment = new Train_addFragment();
        train_dataFragment = new Train_dataFragment();
        train_dayFragment = new Train_dayFragment();

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    /**
     * 添加小点
     *
     * @throws
     * @since 1.0.0
     */
    public void addPointView() {
        trainViewpageThreeRound.setBackgroundColor(getResources().getColor(
                android.R.color.transparent));// Color.argb(200, 135, 135, 152)
        for (int i = 0; i < mFragments.size(); i++) {
            ImageView pointView = new ImageView(context);
            if (i == 0) {
                pointView.setBackgroundResource(R.drawable.train_kong_pressed);
            } else
                pointView.setBackgroundResource(R.drawable.train_kong_normal);
            trainViewpageThreeRound.addView(pointView);
        }
    }

    /**
     * 改变小点
     *
     * @throws
     * @since 1.0.0
     */
    public void changePointView2(int oldposition, int currposition) {
        View oldview = trainViewpageThreeRound.getChildAt(oldposition);
        View currview = trainViewpageThreeRound.getChildAt(currposition);
        if (oldview != null && currview != null) {
            ImageView pointView = (ImageView) oldview;
            ImageView currView = (ImageView) currview;
            pointView.setBackgroundResource(R.drawable.train_kong_normal);
            currView.setBackgroundResource(R.drawable.train_kong_pressed);
        }
    }

    public void setListViewHeightBasedOnChildren(ListView listView) {
        // 获取ListView对应的Adapter
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return;
        }
        int totalHeight = 0;
        System.out.println(listAdapter.getCount()+"不会有两遍吧");
        for (int i = 0, len = listAdapter.getCount(); i < len; i++) {
            // listAdapter.getCount()返回数据项的数目
            View listItem = listAdapter.getView(i, null, listView);
            // 计算子项View 的宽高
            listItem.measure(0, 0);
            // 统计所有子项的总高度
            totalHeight +=500;
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight+20;
        listView.setLayoutParams(params);
    }
}
