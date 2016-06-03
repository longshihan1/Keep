package com.news.keep.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.news.keep.R;
import com.news.keep.bean.Train_maintitle;
import com.news.keep.utils.Cache.ImageLoader;

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
public class RecyclerView2Adapter extends RecyclerView.Adapter<RecyclerView2Adapter.MyViewHolder> {

    private LayoutInflater mInflater;
    private List<Train_maintitle.DataBean> mDatas;
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

    public RecyclerView2Adapter(Context context, List<Train_maintitle.DataBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
        mInflater = LayoutInflater.from(context);
        imageLoader = new ImageLoader(context);

    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    //创建ViewHolder
    @Override
    public RecyclerView2Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.main_title, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    //绑定viewHolder
    @Override
    public void onBindViewHolder(final RecyclerView2Adapter.MyViewHolder holder, final int position) {
        Train_maintitle.DataBean msg = mDatas.get(position);
        holder.mMaintitleTitle.setText(msg.getName());
        holder.mMiantitleNumber.setText(Integer.toString(msg.getCount())+"篇内容");
        imageLoader.DisplayImage(msg.getPhoto(), holder.mMaintitlePhoto);

        if (mOnItemClickLitener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = holder.getLayoutPosition();
                    mOnItemClickLitener.onItemClick(holder.itemView, pos);
                }
            });
            //longClick
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    int pos = holder.getLayoutPosition();
                    mOnItemClickLitener.onItemLongClick(holder.itemView, pos);
                    //removeData(pos);
                    return false;
                }
            });
        }
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout mMaintitlePhoto;//头像
        TextView mMaintitleTitle;//标题
        TextView mMiantitleNumber;//评论

        public MyViewHolder(View view) {
            super(view);
            mMiantitleNumber = (TextView) view.findViewById(R.id.miantitle_number);
            mMaintitleTitle = (TextView) view.findViewById(R.id.maintitle_title);
            mMaintitlePhoto = (RelativeLayout) view.findViewById(R.id.maintitle_photo);
        }
    }
}
