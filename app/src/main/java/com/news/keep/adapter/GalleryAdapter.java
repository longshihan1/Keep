package com.news.keep.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.news.keep.R;
import com.news.keep.bean.MessageBean;
import com.news.keep.utils.Cache.ImageLoader;

import java.util.List;

/**
 * @author Administrator
 * @time 2016/5/20 0020 下午 7:39
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class GalleryAdapter extends
        RecyclerView.Adapter<GalleryAdapter.ViewHolder> {

    private LayoutInflater mInflater;
    private List<MessageBean.DataBean.LikersBean> mDatas;
    private ImageLoader imageLoader;

    public GalleryAdapter(Context context, List<MessageBean.DataBean.LikersBean> datats) {
        mInflater = LayoutInflater.from(context);
        mDatas = datats;
        imageLoader = new ImageLoader(context);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View arg0) {
            super(arg0);
        }

        ImageView mImg;
    }

    @Override
    public int getItemCount() {
        return 7>mDatas.size()?mDatas.size():7;
    }

    /**
     * 创建ViewHolder
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.message_likes, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.mImg = (ImageView) view.findViewById(R.id.message_likes);
        return viewHolder;
    }

    /**
     * 设置值
     */
    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int i) {
        imageLoader.DisplayImage(mDatas.get(i).getAvatar(),viewHolder.mImg);
    }
}
