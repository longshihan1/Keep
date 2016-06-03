package com.news.keep.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.news.keep.R;
import com.news.keep.activity.MessageActivity;
import com.news.keep.adapter.RecyclerViewAdapter;
import com.news.keep.bean.ItemMsg;
import com.news.keep.utils.Constans;
import com.news.keep.utils.http.Net;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * A simple {@link Fragment} subclass.
 *
 * @author 龙逝寒
 */
public class FindFragment extends Fragment {


    @InjectView(R.id.find_recyclerView)
    RecyclerView mFindRecyclerView;
    @InjectView(R.id.find_wiperefreshlayout)
    SwipeRefreshLayout mFindWiperefreshlayout;

    private Context context;
    private RecyclerViewAdapter adapter;
    private String TAG = "FindFragment";
    private List<ItemMsg> lists;
    private GridLayoutManager layoutParams;
    private int lastVisibleItem;
    boolean isrefreshing = true;
    boolean isLoading;
    String id;


    public FindFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_find, container, false);
        ButterKnife.inject(this, view);
        context = getActivity();
        initViews();
        initEvents();
        return view;
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (Net.SUCCESS == msg.what) {
                // JSONObject object = (JSONObject) msg.obj;
                ItemMsg itemMsg = null;
                JSONObject jsonObject = JSON.parseObject(msg.obj.toString());
                JSONArray jsonArray = JSON.parseArray(jsonObject.getString("data"));
                id = jsonObject.getString("lastId");
                for (int i = 0; i < jsonArray.size(); i++) {
                    itemMsg = JSON.parseObject(jsonArray.get(i).toString(), ItemMsg.class);
                    lists.add(itemMsg);
                }

                adapter = new RecyclerViewAdapter(context, lists);
                mFindRecyclerView.setAdapter(adapter);
                //3列的gridview-->竖直
                mFindRecyclerView.setLayoutManager(layoutParams);
                mFindRecyclerView.scrollToPosition(lists.size() / 2);

                initListener();
            }

        }

        private void initListener() {
            adapter.setOnItemClickLitener(new RecyclerViewAdapter.OnItemClickLitener() {
                @Override
                public void onItemClick(View view, int position) {
                    Intent intent = new Intent(context, MessageActivity.class);
                    intent.putExtra("id", lists.get(position).get_id());
                    startActivity(intent);
                }

                @Override
                public void onItemLongClick(View view, int position) {

                }
            });
        }
    };


    /**
     * 初始化View
     */

    private void initViews() {
        lists = new ArrayList<>();
        layoutParams = new GridLayoutManager(context, 2);
        Net.sendHttpGet(context, handler, "findfragment", "加载中...", Constans.TRAIN_find_1, "0",
                "0");
        //设置SwipeRefreshLayout
        mFindWiperefreshlayout.setColorSchemeResources(android.R.color.holo_blue_bright, android
                        .R.color.holo_green_light,
                android.R.color.holo_orange_light, android.R.color.holo_red_light);

        mFindWiperefreshlayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {

            @Override
            public void onRefresh() {
                //下拉刷新
                handler.postDelayed(new Runnable() {
                                        public void run() {
                                            initEvents();
                                            //关闭刷新
                                            mFindWiperefreshlayout.setRefreshing(false);
                                        }
                                    }
                        , 2000);


            }
        });

        mFindRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mFindRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            private int currentStatus = RecyclerView.SCROLL_STATE_IDLE;

            private int lastdy = 0;

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {


                lastVisibleItem = layoutParams
                        .findFirstCompletelyVisibleItemPosition();
                if (lastVisibleItem == 0 && (dy > lastdy)) {//第一个可见,并且向下滑动列表
                    lastdy = dy;
                } else {

                }

                super.onScrolled(recyclerView, dx, dy);
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {

                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_STATE_IDLE && lastVisibleItem + 1 == adapter
                        .getItemCount()) {
                    mFindWiperefreshlayout.setRefreshing(true);
                   /*
                    initEvents();
                    handler.sendEmptyMessageDelayed(0, 3000);*/
                    handler.postDelayed(new Runnable() {
                                            public void run() {

                                                //id=lists.get(lists.size()-1).get_id();
                                                Log.e(TAG, id);
                                                Net.sendHttpGet(context, handler, "findfragment",
                                                        "加载中...",
                                                        Constans.TRAIN_find_1 + "?lastId=" + id,
                                                        "0",
                                                        "0");
                                                //关闭刷新
                                                mFindWiperefreshlayout.setRefreshing(false);

                                            }
                                        }
                            , 2000);
                } else {
                    currentStatus = newState;
                }
            }
        });


    }


    private void initEvents() {


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }


}
