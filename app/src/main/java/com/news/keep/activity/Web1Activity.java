package com.news.keep.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.news.keep.R;
import com.news.keep.adapter.FullyLinearLayoutManager;
import com.news.keep.adapter.RecyclerView3Adapter;
import com.news.keep.bean.WebBean;
import com.news.keep.utils.http.Net;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.SimpleImageLoadingListener;

import butterknife.InjectView;

public class Web1Activity extends BaseActivity {

    @InjectView(R.id.web_textview)
    TextView mWebTextview;
    @InjectView(R.id.web_recy)
    RecyclerView mWebRecy;
    @InjectView(R.id.web_title)
    TextView mWebTitle;

    private WebBean bean;
    private RecyclerView3Adapter mRecyclerView1Adapter;
    private FullyLinearLayoutManager mFullyLinearLayoutManager;
    private Context mContext;
    private RequestQueue mQueue;
    int screenWidth, screenHeight;

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (Net.SUCCESS == msg.what) {
                bean = JSON.parseObject(msg.obj.toString(), WebBean.class);
                mWebTitle.setText(bean.getData().getContent());
                String html = bean.getData().getHtml();
                mWebTextview.setMovementMethod(ScrollingMovementMethod.getInstance());//滚动
                mWebTextview.setText(Html.fromHtml(html, new URLImageParser(mWebTextview), null));


                if (bean.getData().getCommentsList().size() > 0) {
                    mFullyLinearLayoutManager = new FullyLinearLayoutManager(mContext);
                    mFullyLinearLayoutManager.setOrientation(FullyLinearLayoutManager.VERTICAL);
                    //垂直布局
                    mWebRecy.setLayoutManager(mFullyLinearLayoutManager);
                    //设置适配器
                    mRecyclerView1Adapter = new RecyclerView3Adapter(mContext, bean.getData()
                            .getCommentsList());
                    mWebRecy.setAdapter(mRecyclerView1Adapter);
                } else {
                    mWebRecy.setVisibility(View.GONE);
                }


            }

        }
    };


    public class URLImageParser implements Html.ImageGetter {
        TextView mTextView;

        public URLImageParser(TextView textView) {
            this.mTextView = textView;
        }

        @Override
        public Drawable getDrawable(String source) {
            final URLDrawable urlDrawable = new URLDrawable();
            Log.e("web1Activity", source);
            ImageLoader.getInstance().loadImage(source,
                    new SimpleImageLoadingListener() {
                        @Override
                        public void onLoadingComplete(String imageUri, View view, Bitmap
                                loadedImage) {
                            urlDrawable.bitmap = loadedImage;
                            urlDrawable.setBounds(0, 0, screenWidth, screenWidth / 3);
                            mTextView.invalidate();
                            mTextView.setText(mTextView.getText()); // 解决图文重叠
                        }
                    });
            return urlDrawable;
        }
    }

    class URLDrawable extends BitmapDrawable {
        Bitmap bitmap;

        @Override
        public void draw(Canvas canvas) {
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0, 0, getPaint());
            }
        }
    }

    @Override
    public void initView() {
        bean = new WebBean();
        mContext = this;
        mQueue = Volley.newRequestQueue(mContext);
        WindowManager wm = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);

        screenWidth = wm.getDefaultDisplay().getWidth();
        screenHeight = wm.getDefaultDisplay().getHeight();

        String url = getIntent().getStringExtra("url");
        Net.sendHttpGet(this, handler, "web1Activity", "加载中...", url, "0", "0");

    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_web1;
    }


  /*  public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getRepeatCount() == 0) {
            Intent intent=new Intent(this,MainActivity.class);
            finish();
            startActivity(intent);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }*/
}
