package com.news.keep.fragment;


import android.content.Context;
import android.graphics.Bitmap;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.news.keep.R;
import com.news.keep.utils.ToolBarUtils;
import com.news.keep.view.PoritionView;
import com.news.keep.view.StarLinearLayout;
import com.news.keep.view.TopBar;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class TrainFragment extends Fragment {
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
    private TopBar topBar;
    private Context context;
    private StarLinearLayout starsLayout;

    //图片截取
    Bitmap picRes;
    Bitmap showPic;
    //获取原图片的宽和高
    int picWidth;
    int picHeight;
    private PoritionView poritonView = null;
    // 屏幕的长和宽
    int screenWidth, screenHeight;

    private List<Fragment> mFragments = new ArrayList<Fragment>();
    private ToolBarUtils mToolBarUtil;
    private String[] mToolBarTitleArr;
    public int currentpositon = 0;
    public int oldpositon = 0;

    public TrainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_train, container, false);

        ButterKnife.inject(this, view);
        context = getActivity();
        initView();
        initData();
        initListener();


        return view;
    }

    private void initView() {
        // 添加fragment到集合中
        mFragments.add(new Train_dataFragment());
        mFragments.add(new Train_dayFragment());
        mFragments.add(new Train_addFragment());
        trainViewpageThree.setAdapter(new MyPagerAdapter(getActivity().getSupportFragmentManager()));
        addPointView();
    }

    private void initData() {
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
   /*     mToolBarUtil.setOnToolBarClickListener(new ToolBarUtils.OnToolBarClickListener() {
            @Override
            public void onToolBarClick(int position) {
                trainViewpageThree.setCurrentItem(position);
            }
        });*/
      /*  StarLayoutParams params = new StarLayoutParams();
        params.setNormalStar(getResources().getDrawable(R.mipmap.star_normal))
                .setSelectedStar(getResources().getDrawable(R.mipmap.star_selected))
                .setSelectable(false)
                .setSelectedStarNum(1)
                .setTotalStarNum(5)
                .setStarHorizontalSpace(5);
        starsLayout.setStarParams(params);
        topBar.setTopBarClickListener(new TopBarClickListener() {
            @Override
            public void rightBtnClick() {
                //处理右边按钮所对应的逻辑
                Toast.makeText(context, "你点击的是右边的按钮", Toast.LENGTH_LONG).show();
            }

            @Override
            public void leftBtnClick() {
                //处理左边按钮所对应的逻辑
                Toast.makeText(context, "你点击的是左边的按钮", Toast.LENGTH_LONG).show();
            }
        });*/

    }

    /*
    * 先运行
    * */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //获取网络数据
        RequestQueue mQueue = Volley.newRequestQueue(getActivity());
        StringRequest stringRequest = new StringRequest("http://api.gotokeep.com/v1.1/home/recommend",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("TAG", response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("TAG", error.getMessage(), error);
            }
        });
        mQueue.add(stringRequest);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    @OnClick({R.id.train_city, R.id.train_location, R.id.train_plan, R.id.train_add})
    public void onClick(View view) {
        switch (view.getId()) {
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

}
