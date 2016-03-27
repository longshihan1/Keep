package com.news.keep.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.news.keep.R;
import com.news.keep.view.interfaces.TopBarClickListener;

/**
 * Created by Administrator on 2016/3/18.
 * 项目名称：Keep
 * 类描述：首页三张图
 * 创建人：Administrator
 * 创建时间：2016/3/18 21:18
 * 修改人：Administrator
 * 修改时间：2016/3/18 21:18
 * 修改备注：
 */
public class Trans_main_rela extends RelativeLayout {
    private TextView view_main_txt, view_k1_txt, view_tools_txt, view_num_txt, view_Place_txt, view_people_txt, view_yicanjia;//字体
    private String title, main_txt, k1_txt, tools_txt, num_txt, Place_txt, people_txt, yicanjia;//字体
    private float titleTextSize, lin1_size, lin2_size, lin3_size, lin4_size;//字体大小
    private int titleTextColor;//字体颜色
    private Drawable leftBackground;//背景
    // private StarLinearLayout starLinearLayout;//评分组件

    private TopBarClickListener topBarClickListener;
    private String titleStr;

    private RelativeLayout.LayoutParams main_1, lin2_1, lin2_2, lin2_3, lin3_1, lin3_2, lin4_1, lin4_2;

    private static int int_main_txt = 1;
    private static int int_k1_txt = 2;
    private static int int_tools_txt = 3;
    private static int int_num_txt = 4;
    private static int int_Place_txt = 5;
    private static int int_people_txt = 6;
    private static int int_starLinearLayout = 7;
    private static int int_yicanjia = 8;

    @SuppressWarnings("ResourceType")
    public Trans_main_rela(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.main_linear);

        main_txt = ta.getString(R.styleable.main_linear_main_txt);
        k1_txt = ta.getString(R.styleable.main_linear_k1_txt);
        tools_txt = ta.getString(R.styleable.main_linear_tools_txt);
        num_txt = ta.getString(R.styleable.main_linear_num_txt);
        Place_txt = ta.getString(R.styleable.main_linear_Place_txt);
        people_txt = ta.getString(R.styleable.main_linear_people_txt);
        yicanjia = ta.getString(R.styleable.main_linear_yicanjia);

        lin1_size = ta.getDimension(R.styleable.main_linear_lin1_size, 20);
        lin2_size = ta.getDimension(R.styleable.main_linear_lin2_size, 10);
        lin3_size = ta.getDimension(R.styleable.main_linear_lin3_size, 10);
        lin4_size = ta.getDimension(R.styleable.main_linear_lin4_size, 10);

        titleTextColor = ta.getColor(R.styleable.main_linear_main_TextColor, 0);

        //  this.leftBackground = ta.getDrawable(R.styleable.main_linear_main_txt);

        ta.recycle();

        view_main_txt = new TextView(context);
        view_k1_txt = new TextView(context);
        view_tools_txt = new TextView(context);
        view_num_txt = new TextView(context);
        view_Place_txt = new TextView(context);
        view_people_txt = new TextView(context);
        //   starLinearLayout = new StarLinearLayout(context);
        view_yicanjia = new TextView(context);

        view_main_txt.setId(int_main_txt);
        view_k1_txt.setId(int_k1_txt);
        view_tools_txt.setId(int_tools_txt);
        view_num_txt.setId(int_num_txt);
        view_Place_txt.setId(int_Place_txt);
        view_people_txt.setId(int_people_txt);
        //    starLinearLayout.setId(int_starLinearLayout);
        view_yicanjia.setId(int_yicanjia);

        // main_1,lin2_1,lin2_2,lin2_3,lin3_1,lin3_2,lin4_1
        //主Text
        main_1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        main_1.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        main_1.setMargins(20, 5, 0, 5);//左上右下
        //K1零基础--第二行
        lin2_1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lin2_1.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        lin2_1.setMargins(20, 3, 3, 5);//左上右下
        lin2_1.addRule(RelativeLayout.BELOW, int_main_txt);
      /*  //星星控件
        lin2_2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        // lin2_2.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        lin2_2.setMargins(2, 5, 3, 5);//左上右下
        lin2_1.addRule(RelativeLayout.ALIGN_BOTTOM, int_main_txt);
        lin2_1.addRule(RelativeLayout.ALIGN_RIGHT, int_k1_txt);*/
        //无器械
        lin2_3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        //  lin2_3.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        lin2_3.setMargins(5, 5, 0, 5);//左上右下
        lin2_3.addRule(RelativeLayout.BELOW, int_main_txt);
        lin2_3.addRule(RelativeLayout.RIGHT_OF, int_k1_txt);
        //    lin2_3.addRule(RelativeLayout.ALIGN_RIGHT, int_starLinearLayout);
        //8节
        lin3_1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lin3_1.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        lin3_1.setMargins(20, 5, 0, 5);//左上右下
        lin3_1.addRule(RelativeLayout.BELOW, int_k1_txt);
        //全身
        lin3_2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        // lin3_2.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        lin3_2.setMargins(5, 5, 0, 5);//左上右下
        lin3_2.addRule(RelativeLayout.BELOW, int_k1_txt);
        lin3_2.addRule(RelativeLayout.RIGHT_OF, int_num_txt);
        //57777777555
        lin4_1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
         lin4_1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        lin4_1.setMargins(0, 5, 10, 5);//左上右下
        lin4_1.addRule(RelativeLayout.LEFT_OF, int_yicanjia);
        //人已参加
        lin4_2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lin4_2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        lin4_2.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        lin4_2.setMargins(0, 5, 10, 5);//左上右下

        // main_1,lin2_1,lin2_2,lin2_3,lin3_1,lin3_2,lin4_1
        //view_main_txt, view_k1_txt, view_tools_txt, view_num_txt, view_Place_txt, view_people_txt
        addView(view_main_txt, main_1);
        addView(view_k1_txt, lin2_1);
        addView(view_tools_txt, lin2_3);
        addView(view_num_txt, lin3_1);
        addView(view_Place_txt, lin3_2);
        addView(view_people_txt, lin4_1);
        addView(view_yicanjia, lin4_2);

        view_main_txt.setTextColor(titleTextColor);
        view_k1_txt.setTextColor(titleTextColor);
        view_tools_txt.setTextColor(titleTextColor);
        view_num_txt.setTextColor(titleTextColor);
        view_Place_txt.setTextColor(titleTextColor);
        view_people_txt.setTextColor(titleTextColor);
        view_yicanjia.setTextColor(titleTextColor);

        view_main_txt.setText(main_txt);
        view_k1_txt.setText(k1_txt);
        view_tools_txt.setText(tools_txt);
        view_num_txt.setText(num_txt);
        view_Place_txt.setText(Place_txt);
        view_people_txt.setText(people_txt);
        view_yicanjia.setText(yicanjia);

        view_main_txt.setTextSize(lin1_size);
        view_k1_txt.setTextSize(lin2_size);
        view_tools_txt.setTextSize(lin2_size);
        view_num_txt.setTextSize(lin3_size);
        view_Place_txt.setTextSize(lin3_size);
        view_people_txt.setTextSize(lin4_size);
        view_yicanjia.setTextSize(lin4_size);

    }

}
