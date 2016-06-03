package com.news.keep.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.news.keep.R;
import com.news.keep.bean.ItemMsg;
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
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private LayoutInflater mInflater;
    private List<ItemMsg> mDatas;
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

    public RecyclerViewAdapter(Context context, List<ItemMsg> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
        mInflater = LayoutInflater.from(context);
        imageLoader = new ImageLoader(context);
      /*  mHeights = new ArrayList<Integer>();
        for (int i = 0; i < mDatas.size(); i++) {
            mHeights.add((int) (100 + Math.random() * 300));
        }*/

    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    //创建ViewHolder
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_simple, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    //绑定viewHolder
    @Override
    public void onBindViewHolder(final RecyclerViewAdapter.MyViewHolder holder, final int position) {
      /*  ViewGroup.LayoutParams layoutParams = holder.textView.getLayoutParams();
        layoutParams.height = mHeights.get(position);
        holder.textView.setLayoutParams(layoutParams);
        holder.textView.setText(mDatas.get(position));*/
        ItemMsg msg=mDatas.get(position);
        holder.itemtitle.setText(msg.getAuthor().getUsername());
        imageLoader.DisplayImage(msg.getAuthor().getAvatar(), holder.itemphoto);
        imageLoader.DisplayImage(msg.getPhoto(), holder.itembackground);
        holder.itemdecrsition.setText(msg.getContent());
        holder.itemtxtzancount.setText(Integer.toString(msg.getLikes()));
        holder.itemtxtpingcount.setText(Integer.toString(msg.getComments()));
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

    public void addData(List<ItemMsg> list) {
        for (int i = 0; i <list.size(); i++) {
            mDatas.add(0,list.get(i));
        }
        notifyItemInserted(0);
    }

    public void removeData(int pos) {
        mDatas.remove(pos);
        notifyItemRemoved(pos);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        RoundImageView itemphoto;//头像
        TextView itemtitle;//标题
        ImageView itembackground;//大图
        TextView itemdecrsition;//内容
        TextView itemtxtzancount;//点赞
        TextView itemtxtpingcount;//评论

        public MyViewHolder(View view) {
            super(view);
            itemtxtpingcount = (TextView) view.findViewById(R.id.item_txt_ping_count);
            itemtxtzancount = (TextView) view.findViewById(R.id.item_txt_zan_count);
            itemdecrsition = (TextView) view.findViewById(R.id.item_decrsition);
            itembackground = (ImageView) view.findViewById(R.id.item_background);
            itemtitle = (TextView) view.findViewById(R.id.item_title);
            itemphoto = (RoundImageView) view.findViewById(R.id.item_photo);
        }
    }
}
