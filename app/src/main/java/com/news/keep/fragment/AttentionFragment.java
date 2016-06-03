package com.news.keep.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.news.keep.R;
import com.news.keep.activity.Web1Activity;
import com.news.keep.activity.WebActivity;
import com.news.keep.adapter.FullyLinearLayoutManager;
import com.news.keep.adapter.RecyclerView2Adapter;
import com.news.keep.bean.BarBean;
import com.news.keep.bean.Train_maintitle;
import com.news.keep.utils.Cache.ImageLoader;
import com.news.keep.utils.Constans;
import com.news.keep.utils.http.Net;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttentionFragment extends Fragment {

    @InjectView(R.id.tuijian_pager)
    ViewPager pager;
    @InjectView(R.id.radio0)
    RadioButton mRadio0;
    @InjectView(R.id.radio1)
    RadioButton mRadio1;
    @InjectView(R.id.radio2)
    RadioButton mRadio2;
    @InjectView(R.id.radio3)
    RadioButton mRadio3;
    @InjectView(R.id.radio4)
    RadioButton mRadio4;
    @InjectView(R.id.radioGroup1)
    RadioGroup mGroup;
    @InjectView(R.id.attion_recy)
    RecyclerView mAttionRecy;

    private int[] imgResIDs = new int[]{R.drawable.a, R.drawable.b, R.drawable.c,
            R.drawable.d, R.drawable.e};
    private int[] radioButtonID = new int[]{R.id.radio0, R.id.radio1, R.id.radio2,
            R.id.radio3, R.id.radio4};
    private ArrayList<View> items = new ArrayList<View>();
    private Runnable runnable;
    private int mCurrentItem = 0;
    private Runnable mPagerAction;
    private boolean isFrist = true;
    private ImageLoader image;
    private Context mContext;
    private BarBean barbean;
    private Train_maintitle train_mainBean;
    private List<String> urls;
    private List<Train_maintitle.DataBean> lists;
    private FullyLinearLayoutManager mFullyLinearLayoutManager;
    private RecyclerView2Adapter mRecyclerView2Adapter;
    private Gson mGson;


    public AttentionFragment() {
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (Net.SUCCESS == msg.what) {

                barbean = JSON.parseObject(msg.obj.toString(), BarBean.class);
                Log.e("sw", msg.obj.toString());
                for (int i = 0; i < barbean.getData().size(); i++) {
                    urls.add(barbean.getData().get(i).getPhoto());
                }
                if (urls.size() > 0) {
                    initAllItems(urls);
                }

            }

        }
    };

    private Handler handler1 = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            mGson = new Gson();
            if (Net.SUCCESS == msg.what) {
                System.out.println("1" + msg.obj.toString());
                train_mainBean = mGson.fromJson(msg.obj.toString(), Train_maintitle.class);
                //  train_mainBean = JSON.parseObject(msg.obj.toString(), Train_maintitle.class);
                if (train_mainBean.getData().size() > 0) {
                    mFullyLinearLayoutManager = new FullyLinearLayoutManager(mContext);
                    mFullyLinearLayoutManager.setOrientation(FullyLinearLayoutManager.VERTICAL);
                    //垂直布局
                    mAttionRecy.setLayoutManager(mFullyLinearLayoutManager);
                    //设置适配器
                    mRecyclerView2Adapter = new RecyclerView2Adapter(mContext, train_mainBean
                            .getData());
                    mAttionRecy.setAdapter(mRecyclerView2Adapter);

                    initData();
                }
            }

        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_attention, container, false);
        ButterKnife.inject(this, view);
        mContext = getActivity();
        Log.e("这个是", "ddd");
        initView();

        return view;
    }

    private void initView() {
        image = new ImageLoader(mContext);
        barbean = new BarBean();
        train_mainBean = new Train_maintitle();
        urls = new ArrayList<>();

        Net.sendHttp_Auth(mContext, handler, "attionfragment", Constans.TRAIN_BAR, "0", "0");
        Net.sendHttpGet(mContext, handler1, "attionfragment", "加载中。。。", Constans
                .TRAIN_Main_TITLE, "0", "0");


    }

    public void initData() {

        mRecyclerView2Adapter.setOnItemClickLitener(new RecyclerView2Adapter.OnItemClickLitener() {
            @Override
            public void onItemClick(View view, int position) {
                String user_id = train_mainBean.getData().get(position).getUser().getId();
                String id = train_mainBean.getData().get(position).get_id();
                Log.e("de", Constans.TRAIN_SHOW + user_id + "/" + id);
                Intent intent = new Intent(mContext, WebActivity.class);
                intent.putExtra("url", Constans.TRAIN_SHOW + user_id + "/" + id);
                startActivity(intent);
            }

            @Override
            public void onItemLongClick(View view, int position) {

            }
        });
    }

    private void initAllItems(final List<String> urls) {
        // 初始化Viewpager的所有item
        for (int i = 0; i < urls.size(); i++) {
            items.add(initPagerItemNet(urls.get(i)));
        }

        pager.setAdapter(new MyPageAdapter());
        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(final int arg0) {
                mCurrentItem = arg0 % urls.size();
                pager.setCurrentItem(mCurrentItem);
                mGroup.check(radioButtonID[mCurrentItem]);
                items.get(arg0).findViewById(R.id.tuijian_header_img).setOnClickListener(new View
                        .OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String spilt = barbean.getData().get(arg0).getUrl();
                        String[] names = spilt.split("//");
                        String[] namess = names[1].split("/");
                        if ("articles".equals(namess[0])) {
                            String url1 = Constans.TRAIN_WEB2 + namess[1];//网址
                            Intent intent = new Intent(mContext, Web1Activity.class);
                            intent.putExtra("url", url1);
                            getActivity().finish();
                            startActivity(intent);
                        } else {
                            String url2 = Constans.TRAIN_WEB1 + namess[1];//网址
                            Intent intent = new Intent(mContext, WebActivity.class);
                            intent.putExtra("url", url2);
                            getActivity().finish();
                            startActivity(intent);
                        }

                    }
                });
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
                // TODO Auto-generated method stub

            }
        });
/*        mPagerAction = new Runnable() {
            @Override
            public void run() {
                if (urls.size() != 0) {
                    if (isFrist == true) {
                        mCurrentItem = 0;
                        isFrist = false;
                    } else {
                        if (mCurrentItem == urls.size() - 1) {
                            mCurrentItem = 0;
                        } else {
                            mCurrentItem++;
                        }
                    }
                    pager.setCurrentItem(mCurrentItem);
                    mGroup.check(radioButtonID[mCurrentItem]);

                }
                pager.postDelayed(mPagerAction, 2500);
            }
        };
        pager.postDelayed(mPagerAction, 1000);*/

    }


    //在线
    private View initPagerItemNet(String url) {
        View layout1 = getActivity().getLayoutInflater().inflate(R.layout.tuijian_header, null);
        ImageView imageView1 = (ImageView) layout1.findViewById(R.id.tuijian_header_img);
        image.DisplayImage(url, imageView1);
        // Glide.with(mContext).load(url).into(imageView1);
        return layout1;
    }

    class MyPageAdapter extends PagerAdapter {
        // 创建
        @Override
        public Object instantiateItem(View container, int position) {
            View layout = items.get(position % items.size());
            pager.addView(layout);
            return layout;
        }

        // 销毁
        @Override
        public void destroyItem(View container, int position, Object object) {
            View layout = items.get(position % items.size());
            pager.removeView(layout);
        }

        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            return arg0 == arg1;
        }

        @Override
        public int getCount() {
            return urls.size();
        }

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }


}
