package com.news.keep.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.handmark.pulltorefresh.library.LoadingLayoutBase;
import com.news.keep.R;
import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.view.ViewHelper;


/**
 * 作者：Administrator on 2016/2/24 21:48
 * 邮箱：longshihan@163.com
 */
public class JingDongHeaderLayout1 extends LoadingLayoutBase {
    static final String LOG_TAG = "PullToRefresh-JingDongHeaderLayout";

    private FrameLayout mInnerLayout;
    private TextView mHeaderText;
    private TextView mSubHeaderText;
    private ImageView mGoodsImage;
    private ImageView mPersonImage;

    private CharSequence mPullLabel;
    private CharSequence mRefreshingLabel;
    private CharSequence mReleaseLabel;

    private AnimationDrawable animP;

    public JingDongHeaderLayout1(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.jingdong_header_loadinglayout, this);

        mInnerLayout = (FrameLayout) findViewById(R.id.fl_inner);
        mHeaderText = (TextView) mInnerLayout.findViewById(R.id.pull_to_refresh_text);
        mSubHeaderText = (TextView) mInnerLayout.findViewById(R.id.pull_to_refresh_sub_text);
        mGoodsImage = (ImageView) mInnerLayout.findViewById(R.id.pull_to_refresh_goods);
        mPersonImage = (ImageView) mInnerLayout.findViewById(R.id.pull_to_refresh_people);

        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) mInnerLayout.getLayoutParams();
        lp.gravity = Gravity.BOTTOM;

        // Load in labels
        mPullLabel = context.getString(R.string.jingdong_pull_label);
        mRefreshingLabel = context.getString(R.string.jingdong_refreshing_label);
        mReleaseLabel = context.getString(R.string.jingdong_release_label);

        reset();
    }

    /**
     * get the LoadingLayout height or width
     *
     * @return size
     * 获取加载的头部高度
     */
    @Override
    public int getContentSize() {
        return mInnerLayout.getHeight();
    }

    /**
     * Call when the widget begins to slide
     * 开始下拉时的回掉
     */
    @Override
    public void pullToRefresh() {
        mSubHeaderText.setText(mPullLabel);

    }

    /**
     * Call when the LoadingLayout is fully displayed
     * 加载头部完全显示时的回掉
     */
    @Override
    public void releaseToRefresh() {
        mSubHeaderText.setText(mReleaseLabel);

    }

    /**
     * Call when the LoadingLayout is sliding
     *
     * @param scaleOfLayout scaleOfLayout
     *                      拖动时回掉。参数拖动距离与加载高度之比
     *                      下拉拖动时的回调
     */
    @Override
    public void onPull(float scaleOfLayout) {
        scaleOfLayout = scaleOfLayout > 1.0f ? 1.0f : scaleOfLayout;

        if (mGoodsImage.getVisibility() != View.VISIBLE) {
            mGoodsImage.setVisibility(View.VISIBLE);
        }

        //透明度动画
        ObjectAnimator animAlphaP = ObjectAnimator.ofFloat(mPersonImage, "alpha", -1, 1).setDuration(300);
        animAlphaP.setCurrentPlayTime((long) (scaleOfLayout * 300));
        ObjectAnimator animAlphaG = ObjectAnimator.ofFloat(mGoodsImage, "alpha", -1, 1).setDuration(300);
        animAlphaG.setCurrentPlayTime((long) (scaleOfLayout * 300));

        //缩放动画
        ViewHelper.setPivotX(mPersonImage, 0);  // 设置中心点
        ViewHelper.setPivotY(mPersonImage, 0);
        ObjectAnimator animPX = ObjectAnimator.ofFloat(mPersonImage, "scaleX", 0, 1).setDuration(300);
        animPX.setCurrentPlayTime((long) (scaleOfLayout * 300));
        ObjectAnimator animPY = ObjectAnimator.ofFloat(mPersonImage, "scaleY", 0, 1).setDuration(300);
        animPY.setCurrentPlayTime((long) (scaleOfLayout * 300));

        ViewHelper.setPivotX(mGoodsImage, mGoodsImage.getMeasuredWidth());
        ObjectAnimator animGX = ObjectAnimator.ofFloat(mGoodsImage, "scaleX", 0, 1).setDuration(300);
        animGX.setCurrentPlayTime((long) (scaleOfLayout * 300));
        ObjectAnimator animGY = ObjectAnimator.ofFloat(mGoodsImage, "scaleY", 0, 1).setDuration(300);
        animGY.setCurrentPlayTime((long) (scaleOfLayout * 300));

    }

    /**
     * Call when the LoadingLayout is fully displayed and the widget has released.
     * Used to prompt the user loading data
     * 释放后刷新回掉
     */
    @Override
    public void refreshing() {
        mSubHeaderText.setText(mRefreshingLabel);

        if (animP == null) {
            mPersonImage.setImageResource(R.drawable.refreshing_anim);
            animP = (AnimationDrawable) mPersonImage.getDrawable();
        }
        animP.start();
        if (mGoodsImage.getVisibility() == View.VISIBLE) {
            mGoodsImage.setVisibility(View.INVISIBLE);
        }

    }

    /**
     * Call when the data has loaded
     * 初始化到未刷新状态
     */
    @Override
    public void reset() {
        if (animP != null) {
            animP.stop();
            animP = null;
        }
        mPersonImage.setImageResource(R.mipmap.app_refresh_goods_0);
        if (mGoodsImage.getVisibility() == View.VISIBLE) {
            mGoodsImage.setVisibility(View.INVISIBLE);
        }

    }

    /**
     * Set Text to show when the Widget is being Pulled
     * <code>setPullLabel(releaseLabel, Mode.BOTH)</code>
     * 设置下拉标题（提示用户正在下拉）
     *
     * @param pullLabel - CharSequence to display
     */
    @Override
    public void setPullLabel(CharSequence pullLabel) {
        mPullLabel = pullLabel;

    }

    /**
     * Set Text to show when the Widget is refreshing
     * <code>setRefreshingLabel(releaseLabel, Mode.BOTH)</code>
     * 设置释放标题，（提示用户正在加载数据）
     *
     * @param refreshingLabel - CharSequence to display
     */
    @Override
    public void setRefreshingLabel(CharSequence refreshingLabel) {
        mRefreshingLabel = refreshingLabel;
    }


    /**
     * Set Text to show when the Widget is being pulled, and will refresh when
     * released. This is the same as calling
     * <code>setReleaseLabel(releaseLabel, Mode.BOTH)</code>
     * 设置头部完全显示标题，提示用户可以释放
     *
     * @param releaseLabel - CharSequence to display
     */
    @Override
    public void setReleaseLabel(CharSequence releaseLabel) {
        mReleaseLabel = releaseLabel;

    }
}
