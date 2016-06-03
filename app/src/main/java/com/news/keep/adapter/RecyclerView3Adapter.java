package com.news.keep.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.news.keep.R;
import com.news.keep.bean.WebBean;
import com.news.keep.utils.Cache.ImageLoader;
import com.news.keep.utils.TLUtil;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

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
public class RecyclerView3Adapter extends RecyclerView.Adapter<RecyclerView3Adapter.MyViewHolder> {

    private LayoutInflater mInflater;
    private List<WebBean.DataBean.CommentsListBean> mDatas;
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

    public RecyclerView3Adapter(Context context, List<WebBean.DataBean.CommentsListBean> mDatas) {
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
    public RecyclerView3Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.detail_item_comments, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    //绑定viewHolder
    @Override
    public void onBindViewHolder(final RecyclerView3Adapter.MyViewHolder holder, final int position) {
        WebBean.DataBean.CommentsListBean msg=mDatas.get(position);
        holder.itemname.setText(msg.getAuthor().getUsername());
        imageLoader.DisplayImage(msg.getAuthor().getAvatar(), holder.itemphoto);
        if (msg.getReplyComment()!=null){
            Log.e("adapter","没有回复");
            holder.itemtxtbieren.setVisibility(View.VISIBLE);
            String bie_name=msg.getReplyComment().getAuthor().getUsername();
            String bie_neirong=msg.getReplyComment().getContent();
            holder.itemtxtbieren.setText(bie_name+":"+bie_neirong);
        }else {
            holder.itemtxtbieren.setVisibility(View.GONE);
        }

        TLUtil tlUtil = new TLUtil();
        holder.time.setText(tlUtil.Time_to_Date(msg.getCreated()));
      /*  String time1=msg.getCreated();
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        String date =msg.getCreated();
        try {
            long diff = System.currentTimeMillis() - sdf.parse(date).getTime();
            int times = (int) (diff / (1000 * 60))-8*60;
            if (times<1){
                holder.time.setText("刚刚");
            }else if (times<60){
                holder.time.setText("回复于"+Integer.toString(times)+"分钟前");
            }else if (times<1440){
                holder.time.setText("回复于"+Integer.toString(times/60)+"小时前");
            }else{
                holder.time.setText("回复于"+Integer.toString(times/1440)+"天前");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
*/
        holder.itemtxtuser.setText(msg.getContent());
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
        CircleImageView itemphoto;//头像
        TextView itemname;//姓名
        TextView time;//时间
        TextView itemtxtbieren;//别人内容
        TextView itemtxtuser;//我的内容

        public MyViewHolder(View view) {
            super(view);
            itemtxtuser = (TextView) view.findViewById(R.id.detail_item_user);
            itemtxtbieren = (TextView) view.findViewById(R.id.detail_item_msg);
            time = (TextView) view.findViewById(R.id.detail_item_time);
            itemname = (TextView) view.findViewById(R.id.detail_item_username);
            itemphoto = (CircleImageView) view.findViewById(R.id.detail_item_useravatar1);
        }
    }
}
