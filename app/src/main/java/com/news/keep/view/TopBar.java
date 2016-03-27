package com.news.keep.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.news.keep.R;
import com.news.keep.view.interfaces.TopBarClickListener;

/**
 * Created by Administrator on 2016/3/18.
 * 项目名称：Keep
 * 类描述：头标题
 * 创建人：Administrator
 * 创建时间：2016/3/18 21:14
 * 修改人：Administrator
 * 修改时间：2016/3/18 21:14
 * 修改备注：
 */
@SuppressWarnings("ResourceType")
public class TopBar extends RelativeLayout {
    private ImageView leftBtn, rightBtn;
    private TextView title;
    private TopBarClickListener topBarClickListener;
    private String titleStr;

    private RelativeLayout.LayoutParams leftBtnLayoutParams, rightBtnLayoutParams, titleLayoutParams;
    private static int LEFT_BTN_ID = 1;
    private static int TITLE_ID = 2;
    private static int RIGHT_BTN_ID = 3;
    private int titleTextColor;

    private Drawable leftBackground, rightBackground;
    private float titleTextSize;

    public TopBar(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.TopBar);

        this.titleStr = ta.getString(R.styleable.TopBar_mtitle);
        this.leftBackground = ta.getDrawable(R.styleable.TopBar_leftBackground);
        this.rightBackground = ta.getDrawable(R.styleable.TopBar_rightBackground);
        this.titleTextSize = ta.getDimension(R.styleable.TopBar_titleTextSize, 14);
        this.titleTextColor = ta.getColor(R.styleable.TopBar_mtitleTextColor, 0);

        ta.recycle();

        leftBtn = new ImageView(context);
        rightBtn = new ImageView(context);
        title = new TextView(context);

        leftBtn.setId(LEFT_BTN_ID);
        rightBtn.setId(RIGHT_BTN_ID);
        title.setId(TITLE_ID);


        leftBtnLayoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        leftBtnLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        leftBtnLayoutParams.setMargins(10, 5, 0, 5);//左上右下
        leftBtnLayoutParams.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE);

        rightBtnLayoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        rightBtnLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        rightBtnLayoutParams.setMargins(0, 5, 10, 5);//左上右下
        rightBtnLayoutParams.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE);

        titleLayoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        titleLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        titleLayoutParams.setMargins(0, 5, 12, 5);//左上右下
        titleLayoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
        //设置放在的位置
        titleLayoutParams.addRule(RelativeLayout.LEFT_OF, RIGHT_BTN_ID);
        titleLayoutParams.addRule(RelativeLayout.RIGHT_OF, LEFT_BTN_ID);
        titleLayoutParams.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);

        addView(leftBtn, leftBtnLayoutParams);
        addView(rightBtn, rightBtnLayoutParams);
        addView(title, titleLayoutParams);

        leftBtn.setBackgroundDrawable(leftBackground);
        rightBtn.setBackgroundDrawable(rightBackground);

        title.setTextSize(22.0f);
        title.setTextColor(Color.BLUE);
        title.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        title.setGravity(Gravity.CENTER_HORIZONTAL);
        title.setSingleLine(true);
        title.setText(titleStr);
        title.setTextSize(titleTextSize);
        title.setTextColor(titleTextColor);

        leftBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (topBarClickListener != null) {
                    topBarClickListener.leftBtnClick();
                }
            }
        });

        rightBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (topBarClickListener != null) {
                    topBarClickListener.rightBtnClick();
                }
            }
        });
    }

    public void setTopBarClickListener(TopBarClickListener topBarClickListener) {
        this.topBarClickListener = topBarClickListener;
    }
}
