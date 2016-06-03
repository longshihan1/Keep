package com.news.keep.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.news.keep.R;
import com.news.keep.activity.TrainItemDisplay;
import com.news.keep.bean.Train_Display;
import com.news.keep.utils.Cache.ImageLoader;
import com.news.keep.utils.http.AsyncImageLoader3;
import com.news.keep.view.StarLinearLayout;

import java.util.List;

/**
 * Created by Administrator on 2016/4/4.
 * 项目名称：Keep
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2016/4/4 10:12
 * 修改人：Administrator
 * 修改时间：2016/4/4 10:12
 * 修改备注：
 */
public class TrainPageAdapter extends BaseAdapter {
    private String TAG="TrainMainAdapter";
    private Context context;
    private ListView listview;
    public static final int VALUE_TIME_TIP = 0;// 2种不同的布局
    public static final int buju_1 = 0;//workouts
    public static final int buju_2 = 1;//plans
    private List<Train_Display.CategoriesBean> lists;
    private LayoutInflater inflater;
    private ViewHolder holder;
    private Train_Display.CategoriesBean list;
    private AsyncImageLoader3 asyncImageLoader3 = new AsyncImageLoader3();
    private ImageLoader imageLoader;
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

    public TrainPageAdapter(Context context, ListView listview, List<Train_Display.CategoriesBean> lists) {
        this.context = context;
        this.lists = lists;
        this.listview = listview;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        imageLoader = new ImageLoader(context);

    }

    public void setData(List<Train_Display.CategoriesBean> lists) {
        // this.houseList.clear();
        this.lists = lists;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Train_Display.CategoriesBean list = lists.get(position);
        holder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_train_main_1, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        name = list.getName();
        equipment = list.getEquipment();
        lesson_count = list.getLesson_count();//课程名称
        bodypart = list.getBodypart();//部位
        trainee_count = Integer.toString(list.getTrainee_count());//人数
        icon = list.getIcon();//小图片
        calorie_count = list.getCalorie_count();//卡路里
        background_image = list.getBackground_image();//大图片
        description = list.getDescription();//描述
        instruction = list.getInstruction();//建议
        effect_name = list.getEffect_name();//功效
        english_name = list.getEnglish_name();//英文名

        holder.trainmaintxt11.setText(name);//名称
        holder.trainmaintext23.setText(equipment);//器械
        holder.trainmaintxt31.setText(lesson_count);//训练天数
        holder.trainmaintxt33.setText(bodypart);//部位
        holder.trainmaintext41.setText(trainee_count);//参加人数
        imageLoader.DisplayImage(icon, holder.trainmainrea1);
        holder.trainmainrea1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"点击");

                Intent intent=new Intent(context,TrainItemDisplay.class);
                //传递数据
                Bundle bundle=new Bundle();
                bundle.putSerializable("map", list);
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
        return convertView;
    }

    public static void setListViewHeightBasedOnChildren(ListView listView) {
        if(listView == null) return;
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return;
        }
        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }

    public class ViewHolder {
        public final TextView trainmaintxt11;
        public final TextView trainmaintext21;
        public final StarLinearLayout trainmaintext22;
        public final TextView trainmaintext23;
        public final TextView trainmaintxt31;
        public final TextView trainmaintxt32;
        public final TextView trainmaintxt33;
        public final TextView trainmaintext41;
        public final TextView trainmaintext42;
        public final RelativeLayout trainmainrea1;
        public final View root;

        public ViewHolder(View root) {
            trainmaintxt11 = (TextView) root.findViewById(R.id.train_main_txt1_1);
            trainmaintext21 = (TextView) root.findViewById(R.id.train_main_text2_1);
            trainmaintext22 = (StarLinearLayout) root.findViewById(R.id.train_main_text2_2);
            trainmaintext23 = (TextView) root.findViewById(R.id.train_main_text2_3);
            trainmaintxt31 = (TextView) root.findViewById(R.id.train_main_txt3_1);
            trainmaintxt32 = (TextView) root.findViewById(R.id.train_main_txt3_2);
            trainmaintxt33 = (TextView) root.findViewById(R.id.train_main_txt3_3);
            trainmaintext41 = (TextView) root.findViewById(R.id.train_main_text_use);
            trainmaintext42 = (TextView) root.findViewById(R.id.train_main_text4_2);
            trainmainrea1 = (RelativeLayout) root.findViewById(R.id.train_main_rea1);
            this.root = root;
        }
    }
}
