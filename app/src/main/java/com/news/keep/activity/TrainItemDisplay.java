package com.news.keep.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.news.keep.R;
import com.news.keep.bean.People;
import com.news.keep.bean.Train_Display;
import com.news.keep.utils.Cache.ImageLoader;
import com.news.keep.utils.http.AsyncImageLoader3;

import java.util.List;
import java.util.Map;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobPointer;
import cn.bmob.v3.datatype.BmobRelation;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;

public class TrainItemDisplay extends AppCompatActivity {
    @InjectView(R.id.include_jion)
    TextView includeJion;
    private String TAG = "TrainItemDisplay";
    @InjectView(R.id.item_display_img)
    ImageView itemDisplayImg;
    @InjectView(R.id.train_display_nickname)
    TextView trainDisplayNickname;
    @InjectView(R.id.train_display_use_lin2_2)
    TextView trainDisplayUseLin22;
    @InjectView(R.id.train_display_use_lin2_4)
    TextView trainDisplayUseLin24;
    @InjectView(R.id.train_display_use_lin2_6)
    TextView trainDisplayUseLin26;
    @InjectView(R.id.train_display_linear_four)
    LinearLayout trainDisplayLinearFour;
    @InjectView(R.id.train_display_descrtion)
    TextView trainDisplayDescrtion;
    @InjectView(R.id.item_display_background)
    RelativeLayout itemDisplayBackground;
    @InjectView(R.id.include_lin1)
    TextView includeLin1;
    @InjectView(R.id.include_lin2)
    TextView includeLin2;
    @InjectView(R.id.include_lin3)
    TextView includeLin3;
    @InjectView(R.id.item_display_add_lesson)
    LinearLayout itemDisplayAddLesson;
    @InjectView(R.id.train_display_info)
    TextView trainDisplayInfo;
    @InjectView(R.id.train_display_peocount)
    TextView trainDisplayPeocount;
    @InjectView(R.id.item_display_lv)
    ListView itemDisplayLv;
    private Map map;
    private Train_Display.CategoriesBean list;
    private String name;//活动名称
    private String equipment;//器械
    private String lesson_count;//课程名称
    private String bodypart;//部位
    private String trainee_count;//人数
    private String icon;//小图片
    private String calorie_count;//卡路里
    private String background_image;//大图片
    private String description;//描述
    private String instruction;//建议
    private String effect_name;//功效
    private String english_name;//英文名
    private ImageLoader imageLoader;

    private AsyncImageLoader3 asyncImageLoader3 = new AsyncImageLoader3();

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            int what = msg.what;
            if (what == 1) {
                Log.e(TAG, "3");

                itemDisplayAddLesson.setBackgroundResource(R.drawable.add_lesson);
                itemDisplayAddLesson.setClickable(false);
                includeJion.setText("已添加");
                includeJion.setTextColor(Color.BLACK);

                BmobUser bmobUser = BmobUser.getCurrentUser(getApplicationContext());
                String user_id = bmobUser.getObjectId();//我的id
                Train_Display.CategoriesBean bean_i = (Train_Display.CategoriesBean) msg.obj;//项目的id

                People user = BmobUser.getCurrentUser(getApplicationContext(), People.class);
                Train_Display.CategoriesBean bean = new Train_Display.CategoriesBean();
                People people = new People();

                bean.setObjectId(bean_i.getObjectId());
                BmobRelation relation_bean = new BmobRelation();
                people.setObjectId(user_id);
                relation_bean.add(people);
                bean.setLikes(relation_bean);

                bean.update(getApplicationContext(), new UpdateListener() {

                    @Override
                    public void onSuccess() {
                        //关注课程的用户
                        Log.e(TAG, "关注课程的用户");
                    }

                    @Override
                    public void onFailure(int arg0, String arg1) {

                    }
                });
                People people1 = new People();
                people1.setObjectId(user_id);
                BmobRelation relation_user = new BmobRelation();
                Train_Display.CategoriesBean bean1 = new Train_Display.CategoriesBean();
                bean1.setObjectId(bean_i.getObjectId());
                relation_user.add(bean_i);
                people1.setUserAtt(relation_user);
                people1.update(getApplicationContext(), new UpdateListener() {
                    @Override
                    public void onSuccess() {
                        //用户关注的课程
                        Log.e(TAG, "用户关注的课程");
                    }

                    @Override
                    public void onFailure(int arg0, String arg1) {

                    }
                });
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_train_item_display);
        ButterKnife.inject(this);
        imageLoader = new ImageLoader(this);
        initData();
        initView();
        initListener();
    }

    private void initData() {
        list = (Train_Display.CategoriesBean) getIntent().getSerializableExtra("map");
        final String id=list.getId();

        BmobUser bmobUser = BmobUser.getCurrentUser(this);
        String user_id = bmobUser.getObjectId();
        BmobQuery<Train_Display.CategoriesBean> query = new BmobQuery<Train_Display.CategoriesBean>();
        People post = new People();
        post.setObjectId(user_id);
        query.addWhereRelatedTo("UserAtt", new BmobPointer(post));
        query.findObjects(this, new FindListener<Train_Display.CategoriesBean>() {

            @Override
            public void onSuccess(List<Train_Display.CategoriesBean> list1) {
                for (int i = 0; i <list1.size() ; i++) {
                    Log.e(TAG,list1.get(i).getId());
                    if (list1.get(i).getId().equals(id)){
                        itemDisplayAddLesson.setClickable(false);
                        itemDisplayAddLesson.setBackgroundResource(R.drawable.add_lesson);
                        itemDisplayAddLesson.setClickable(false);
                        includeJion.setText("已添加");
                        includeJion.setTextColor(Color.BLACK);

                    }
                }
            }

            @Override
            public void onError(int code, String msg) {
                Log.i("life", "查询失败：" + code + "-" + msg);
            }
        });



    }

    private void initView() {
        imageLoader.DisplayImage(list.getBackground_image(), itemDisplayBackground);//背景
        trainDisplayNickname.setText(list.getName());//名称
        trainDisplayUseLin22.setText(list.getEffect_name());//功效
        trainDisplayUseLin24.setText(list.getEquipment());//器材
        trainDisplayUseLin26.setText(list.getBodypart());//部位
        trainDisplayDescrtion.setText(list.getDescription());//描述
        includeLin1.setText(list.getLesson_count());//课程
        includeLin2.setText(list.getCalorie_count());//卡路里
        includeLin3.setText(Integer.toString(list.getBonus()));//活力值
        trainDisplayInfo.setText(list.getInstruction());//建议
        trainDisplayPeocount.setText(Integer.toString(list.getTrainee_count()));



    }

    private void initListener() {
    }


    @OnClick({R.id.item_display_img, R.id.item_display_add_lesson})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.item_display_img:
                finish();
                break;
            case R.id.item_display_add_lesson:
                BmobQuery<Train_Display.CategoriesBean> query = new BmobQuery<Train_Display.CategoriesBean>();
                query.addWhereEqualTo("id", list.getId());
                //执行查询方法
                query.findObjects(getApplicationContext(), new FindListener<Train_Display.CategoriesBean>() {
                    @Override
                    public void onSuccess(List<Train_Display.CategoriesBean> been1) {
                        Log.e(TAG, "Success" + been1.get(0).getId() + been1.get(0).getName());
                        for (Train_Display.CategoriesBean bean : been1) {
                            //说明有这条信息，不用添加，直接跳入喜欢
                            Message message = Message.obtain();
                            message.what = 1;
                            message.obj = bean;
                            Log.e(TAG, "Success" + bean.getObjectId());
                            handler.sendMessage(message);
                        }
                    }

                    @Override
                    public void onError(int code, String msg) {
                        Log.e(TAG, "Error");
                        //在表中插入这条信息
                        final Train_Display.CategoriesBean bean1 = new Train_Display.CategoriesBean();
                        bean1.setId(list.getId());
                        bean1.setName(list.getName());
                        bean1.setIcon(list.getIcon());
                        bean1.setEquipment(list.getEquipment());
                        bean1.setLesson_count(list.getLesson_count());
                        bean1.setBodypart(list.getBodypart());
                        bean1.setTrainee_count(list.getTrainee_count());
                        bean1.setCalorie_count(list.getCalorie_count());//卡路里
                        bean1.setBackground_image(list.getBackground_image());//大背景图片
                        bean1.setDescription(list.getDescription());//描述
                        bean1.setInstruction(list.getInstruction());//建议
                        bean1.setEffect_name(list.getEffect_name());//功效
                        bean1.setBonus(list.getBonus());//活力值
                        bean1.setEnglish_name(list.getEnglish_name());//英文名
                        bean1.save(getApplicationContext(), new SaveListener() {
                            @Override
                            public void onSuccess() {
                                Message message = Message.obtain();
                                message.what = 1;
                                message.obj = bean1;
                                handler.sendMessage(message);
                            }
                            @Override
                            public void onFailure(int code, String arg0) {

                            }
                        });


                    }
                });

                break;
        }
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}
