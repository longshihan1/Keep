package com.news.keep.activity;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.ILoadingLayout;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.news.keep.App;
import com.news.keep.R;
import com.news.keep.adapter.TrainMainAdapter;
import com.news.keep.bean.Train_Display;
import com.news.keep.utils.Constans;
import com.news.keep.utils.TLUtil;
import com.news.keep.utils.http.Net;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class Train_add extends AppCompatActivity {


    @InjectView(R.id.train_add_lv)
    PullToRefreshListView trainAddLv;

    private List<Train_Display.CategoriesBean> lists;
    TrainMainAdapter adapter;

    private Context context;
    private int i = 0;

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (Net.SUCCESS == msg.what) {
                // JSONObject object = (JSONObject) msg.obj;

                Gson gson = null;
                Train_Display list = null;
                Train_Display.CategoriesBean bean = null;
                JSONArray jsonArray = JSON.parseArray(msg.obj.toString());

                for (int j = 0; j < jsonArray.size(); j++) {
                    list = new Train_Display();

                    bean = new Train_Display.CategoriesBean();
                    gson = new Gson();
                    list = gson.fromJson(jsonArray.get(j).toString(), Train_Display.class);
                    bean.setId(list.getCategories().get(0).getId());//ID
                    bean.setName(list.getCategories().get(0).getName());//活动名称
                    bean.setIcon(list.getCategories().get(0).getIcon());//小背景图片
                    bean.setBodypart(list.getCategories().get(0).getBodypart());//锻炼位置
                    bean.setEquipment(list.getCategories().get(0).getEquipment());//器械
                    bean.setLesson_count(list.getCategories().get(0).getLesson_count());//训练天数
                    bean.setTrainee_count(list.getCategories().get(0).getTrainee_count());//训练人数
                    bean.setCalorie_count(list.getCategories().get(0).getCalorie_count());//卡路里
                    bean.setBackground_image(list.getCategories().get(0).getBackground_image());//大背景图片
                    bean.setDescription(list.getCategories().get(0).getDescription());//描述
                    bean.setInstruction(list.getCategories().get(0).getInstruction());//建议
                    bean.setEffect_name(list.getCategories().get(0).getEffect_name());//功效
                    bean.setBonus(list.getCategories().get(0).getBonus());//活力值
                    bean.setEnglish_name(list.getCategories().get(0).getEnglish_name());//英文名

                    lists.add(bean);
                }
                adapter.setData(lists);
                trainAddLv.setAdapter(adapter);
            } else {
                TLUtil.showToast(getApplicationContext(), "错误");
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_train_add);
        ButterKnife.inject(this);
        initView();
        initListener();
    }

    private void initListener() {
        Net.sendHttp(context, handler, "加载中...", Constans.TRAIN_MAIN_2, "0", "0");
        /**
         * setOnRefreshListener(OnRefreshListener listener):设置刷新监听器；
         * setOnLastItemVisibleListener(OnLastItemVisibleListener listener):设置是否到底部监听器；
         * setOnPullEventListener(OnPullEventListener listener);设置事件监听器；
         * onRefreshComplete()：设置刷新完成
         * pulltorefresh.setOnScrollListener()
         // SCROLL_STATE_TOUCH_SCROLL(1) 正在滚动
         // SCROLL_STATE_FLING(2) 手指做了抛的动作（手指离开屏幕前，用力滑了一下）
         // SCROLL_STATE_IDLE(0) 停止滚动
         * setOnLastItemVisibleListener
         * 当用户拉到底时调用
         * setOnTouchListener是监控从点下鼠标 （可能拖动鼠标）到放开鼠标（鼠标可以换成手指）的整个过程 ，他的回调函数是onTouchEvent（MotionEvent event）,
         * 然后通过判断event.getAction()是MotionEvent.ACTION_UP还是ACTION_DOWN还是ACTION_MOVE分别作不同行为。
         * setOnClickListener的监控时间只监控到手指ACTION_DOWN时发生的行为
         */
        trainAddLv.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                if (i == 1) {
                    new FinishRefresh().execute("下拉刷新");
                    adapter.notifyDataSetChanged();
                } else {
                    new FinishRefresh().execute("无");
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                if (i == 0) {
                    new FinishRefresh().execute("上拉加载");
                    adapter.notifyDataSetChanged();
                } else {
                    new FinishRefresh().execute("无");
                    adapter.notifyDataSetChanged();
                }
            }
        });

     /*   trainAddLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }
        });*/

    }


    private void initView() {
        context = getApplicationContext();

        lists = new ArrayList<Train_Display.CategoriesBean>();
        adapter = new TrainMainAdapter(this, trainAddLv, lists);

        ILoadingLayout startLabels = trainAddLv.getLoadingLayoutProxy(true, false);
        startLabels.setPullLabel("下拉刷新...");// 刚下拉时，显示的提示
        startLabels.setRefreshingLabel("正在载入...");// 刷新时
        startLabels.setReleaseLabel("放开刷新...");// 下来达到一定距离时，显示的提示

        ILoadingLayout endLabels = trainAddLv.getLoadingLayoutProxy(false, true);
        endLabels.setPullLabel("上拉刷新...");// 刚下拉时，显示的提示
        endLabels.setRefreshingLabel("正在载入...");// 刷新时
        endLabels.setReleaseLabel("放开刷新...");// 下来达到一定距离时，显示的提示
    }

    private class FinishRefresh extends AsyncTask<String, Void, Void> {
        boolean is_exit = true;

        @Override
        protected Void doInBackground(String... params) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
            if (params[0].equals("下拉刷新")) {
                i--;
                Net.sendHttp(context, handler, "加载中...", Constans.TRAIN_MAIN_2, "0", "0");
                return null;
            } else if (params[0].equals("上拉加载")) {
                i++;
                Net.sendHttp(context, handler, "加载中...", Constans.TRAIN_MAIN_2, "0", "20");
                return null;
            } else {
                return null;
            }
        }

        @Override
        protected void onPostExecute(Void result) {
//          adapter.notifyDataSetChanged();
            trainAddLv.onRefreshComplete();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        App.getHttpQueues().cancelAll("trainpost");
    }
}
