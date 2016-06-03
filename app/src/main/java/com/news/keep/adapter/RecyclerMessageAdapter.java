package com.news.keep.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.news.keep.R;
import com.news.keep.utils.Cache.ImageLoader;
import com.news.keep.view.RoundImageView;

import java.util.List;


/**
 * Created by Administrator on 2016/4/11.
 * 项目名称：AsFrame
 * 类描述：
 * 创建人：longshihan
 * 创建时间：2016/4/11 15:42
 * 修改人：Administrator
 * 修改时间：2016/4/11 15:42
 * 修改备注：
 * 邮箱： longshihan@163.com
 */
public class RecyclerMessageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public final static int TYPE_ONE = 0;
    public final static int TYPE_TWO = 1;
    public final static int TYPE_THREE = 2;
    private int type;
    private LayoutInflater mInflater;
    private List mDatas;
    private Context context;
    private ImageLoader imageLoader;


    public interface OnItemClickLitener {
        void onItemClick(View view, int position);

        void onItemLongClick(View view, int position);
    }

    private OnItemClickLitener mOnItemClickLitener;

    public void setOnItemClickLitener(OnItemClickLitener mOnItemClickLitener) {
        this.mOnItemClickLitener = mOnItemClickLitener;
    }

    public RecyclerMessageAdapter(Context context, List mDatas) {
        this.context = context;
        this.mDatas = mDatas;
        mInflater = LayoutInflater.from(context);
        imageLoader = new ImageLoader(context);
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {//显示用户头像和名称，日期，内容，图片，四个按钮
            return 0;
        } else if (position == 1) {//水平方向的recyclerview
            return 1;
        } else {//垂直方向的recyclerview
            return 2;
        }
    }


    //创建ViewHolder
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        RecyclerView.ViewHolder holder = null;
        switch (viewType) {
            case TYPE_ONE:
                view = LayoutInflater.from(context).inflate(R.layout.message_type_1, parent, false);
                holder = new MyViewHolder1(view);
                break;
            case TYPE_TWO:
                view = LayoutInflater.from(context).inflate(R.layout.message_type_2, parent, false);
                holder = new MyViewHolder2(view);
                break;
            case TYPE_THREE:
                view = LayoutInflater.from(context).inflate(R.layout.message_type_3, parent, false);
                holder = new MyViewHolder2(view);
                break;
        }
        return holder;
    }

    //绑定viewHolder
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case TYPE_ONE:
                 MyViewHolder1 holderOne = (MyViewHolder1) holder;
                //imageLoader.DisplayImage(mDatas.get());
                //onItemEventClick(holderOne);
                break;
            case TYPE_TWO:
                MyViewHolder2 holderTwo = (MyViewHolder2) holder;
               // holderTwo.text1.setText(beans.get(position));
                break;
            case TYPE_THREE:
                MyViewHolder3 holdthree = (MyViewHolder3) holder;
                //holderTwo.text1.setText(beans.get(position));
                break;
        }
    }


    class MyViewHolder1 extends RecyclerView.ViewHolder {
        RoundImageView user_avatar;
        TextView name;
        TextView derction;
        ImageView background;
        ImageView mImageView1;
        ImageView mImageView2;
        ImageView mImageView3;

        public MyViewHolder1(View view) {
            super(view);
            user_avatar = (RoundImageView) view.findViewById(R.id.detail_useravatar);
            name = (TextView) view.findViewById(R.id.detail_username);
            derction = (TextView) view.findViewById(R.id.detail_userderction);
            background = (ImageView) view.findViewById(R.id.detail_image);
            mImageView1 = (ImageView) view.findViewById(R.id.detail_icon_1);
            mImageView2 = (ImageView) view.findViewById(R.id.detail_icon_2);
            mImageView3 = (ImageView) view.findViewById(R.id.detail_icon_3);


        }
    }

    class MyViewHolder2 extends RecyclerView.ViewHolder {
        TextView likes;
        RecyclerView mRecyclerView;
        ImageView mImageView;

        public MyViewHolder2(View view) {
            super(view);
            likes = (TextView) view.findViewById(R.id.detail_likes);
            mRecyclerView= (RecyclerView) view.findViewById(R.id.detail_recy_lin1);
            mImageView= (ImageView) view.findViewById(R.id.detail_more);

        }
    }

    class MyViewHolder3 extends RecyclerView.ViewHolder {
        TextView mTextView;
        RecyclerView mRecyclerView;

        public MyViewHolder3(View view) {
            super(view);
            mTextView = (TextView) view.findViewById(R.id.detail_comments);
            mRecyclerView= (RecyclerView) view.findViewById(R.id.detail_recy_lin2);

        }
    }

}
