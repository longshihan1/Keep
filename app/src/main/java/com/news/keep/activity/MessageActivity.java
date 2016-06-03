package com.news.keep.activity;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.news.keep.R;
import com.news.keep.adapter.FullyLinearLayoutManager;
import com.news.keep.adapter.GalleryAdapter;
import com.news.keep.adapter.RecyclerMessageAdapter;
import com.news.keep.adapter.RecyclerView1Adapter;
import com.news.keep.bean.MessageBean;
import com.news.keep.utils.Cache.ImageLoader;
import com.news.keep.utils.Constans;
import com.news.keep.utils.TLUtil;
import com.news.keep.utils.http.Net;

import java.util.ArrayList;
import java.util.List;

import butterknife.InjectView;
import butterknife.OnClick;
import cn.sharesdk.onekeyshare.OnekeyShare;
import de.hdodenhof.circleimageview.CircleImageView;

public class MessageActivity extends BaseActivity {


    @InjectView(R.id.detail_title)
    ImageView mDetailTitle;
    @InjectView(R.id.detail_first_line1)
    LinearLayout mDetailFirstLine1;
    @InjectView(R.id.detail_useravatar)
    CircleImageView mDetailUseravatar;
    @InjectView(R.id.detail_username)
    TextView mDetailUsername;
    @InjectView(R.id.detail_userderction)
    TextView mDetailUserderction;
    @InjectView(R.id.detail_image)
    ImageView mDetailImage;
    @InjectView(R.id.detail_icon_1)
    ImageView mDetailIcon1;
    @InjectView(R.id.detail_icon_2)
    ImageView mDetailIcon2;
    @InjectView(R.id.detail_icon_3)
    ImageView mDetailIcon3;
    @InjectView(R.id.detail_icon_4)
    ImageView mDetailIcon4;
    @InjectView(R.id.detail_sercond_line)
    LinearLayout mDetailSercondLine;
    @InjectView(R.id.detail_likes)
    TextView mDetailLikes;
    @InjectView(R.id.detail_recy_lin1)
    RecyclerView mDetailRecyLin1;
    @InjectView(R.id.detail_three_line)
    LinearLayout mDetailThreeLine;
    @InjectView(R.id.detail_comments)
    TextView mDetailComments;
    @InjectView(R.id.detail_free_line)
    LinearLayout mDetailFreeLine;
    @InjectView(R.id.detail_recy_lin2)
    RecyclerView mDetailRecyLin2;
    @InjectView(R.id.detail_txt_1)
    TextView mDetailTxt1;
    @InjectView(R.id.detail_txt_2)
    TextView mDetailTxt2;
    @InjectView(R.id.detail_edtt)
    EditText mDetailEdtt;
    @InjectView(R.id.detail_sendtime)
    TextView mDetailSendtime;
    @InjectView(R.id.detail_sercond_line_1)
    LinearLayout mDetailSercondLine1;
    @InjectView(R.id.detail_main_btn)
    Button mDetailMainBtn;

    private RecyclerMessageAdapter mAdapter;
    private List<String> mList1;
    private List<MessageBean.DataBean.LikersBean> mList2;
    private List<MessageBean.DataBean.CommentsListBean> mList3;
    private ImageLoader imageLoader;
    private MessageBean bean;
    private String TAG = "MessageActivity";
    private LinearLayoutManager linearLayoutManager;
    private FullyLinearLayoutManager mFullyLinearLayoutManager;
    private Context mContext;
    private GalleryAdapter mGalleryAdapter;
    private RecyclerView1Adapter mRecyclerView1Adapter;



    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (Net.SUCCESS == msg.what) {
                JSONObject jsonObject = JSON.parseObject(msg.obj.toString());
                bean = JSON.parseObject(jsonObject.toString(), MessageBean.class);
                imageLoader.DisplayImage(bean.getData().getAuthor().getAvatar(), mDetailUseravatar);
                mDetailUsername.setText(bean.getData().getAuthor().getUsername());
                mDetailUserderction.setText(bean.getData().getContent());
                imageLoader.DisplayImage(bean.getData().getPhoto(), mDetailImage);

                mDetailLikes.setText(Integer.toString(bean.getData().getLikers().size()));
                mDetailComments.setText(Integer.toString(bean.getData().getCommentsList().size()));

                mDetailTxt1.setText(bean.getData().getMeta().getName());
                mDetailTxt2.setText(Integer.toString(bean.getData().getMeta().getCount()));

                TLUtil tlUtil = new TLUtil();
                mDetailSendtime.setText(tlUtil.Time_to_Date(bean.getData().getCreated()));

                //水平布局
                mDetailRecyLin1.setLayoutManager(linearLayoutManager);
                //设置适配器
                mGalleryAdapter = new GalleryAdapter(mContext,
                        bean.getData().getLikers());
                mDetailRecyLin1.setAdapter(mGalleryAdapter);

                //垂直布局
                mDetailRecyLin2.setLayoutManager(mFullyLinearLayoutManager);
                //设置适配器
                mRecyclerView1Adapter = new RecyclerView1Adapter(mContext,
                        bean.getData().getCommentsList());
                mDetailRecyLin2.setAdapter(mRecyclerView1Adapter);

            }

        }
    };


    @Override
    public void initView() {

        //设置水平布局的管理器
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        mFullyLinearLayoutManager = new FullyLinearLayoutManager(this);
        mFullyLinearLayoutManager.setOrientation(FullyLinearLayoutManager.VERTICAL);

        mContext = this;

        String id = getIntent().getStringExtra("id");
        bean = new MessageBean();
        mList1 = new ArrayList<>();
        mList2 = new ArrayList<>();
        mList3 = new ArrayList<>();
        imageLoader = new ImageLoader(this);
        String url = Constans.TRAIN_message_1 + id + Constans.TRAIN_message_APPEND;
        Log.e(TAG, id + ":" + url);
        Net.sendHttpGet(this, handler, "messageActivity", "加载中...", url, "0", "0");

    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_message;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getRepeatCount() == 0) {
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    @OnClick({R.id.detail_icon_1, R.id.detail_icon_2, R.id.detail_icon_3, R.id.detail_icon_4, R
            .id.detail_main_btn})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.detail_icon_1://喜欢
                break;
            case R.id.detail_icon_2://回复
                break;
            case R.id.detail_icon_3://分享
                showShare();
                break;
            case R.id.detail_icon_4://举报
                break;
            case R.id.detail_main_btn://回复
                break;
        }
    }

    private void showShare() {
        OnekeyShare oks = new OnekeyShare();
        oks.disableSSOWhenAuthorize();
        oks.setText(bean.getData().getContent());
        //网络图片的url：所有平台
        oks.setImageUrl(bean.getData().getPhoto());//网络图片rul
        // 启动分享GUI
        oks.show(this);
    }
}
