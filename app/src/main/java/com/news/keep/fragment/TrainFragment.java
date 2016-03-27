package com.news.keep.fragment;


import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.news.keep.R;
import com.news.keep.view.PoritionView;
import com.news.keep.view.StarLinearLayout;
import com.news.keep.view.TopBar;
import com.news.keep.view.interfaces.TopBarClickListener;
import com.news.keep.view.model.StarLayoutParams;

import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class TrainFragment extends Fragment {

  /*  @InjectView(R.id.main_tration_frist)
    RelativeLayout mainTrationFrist;*/
    private TopBar topBar;
    private Context context;
    private StarLinearLayout starsLayout;

    //图片截取
    Bitmap picRes;
    Bitmap showPic;
    //获取原图片的宽和高
    int picWidth;
    int picHeight;
    private PoritionView poritonView = null;
    // 屏幕的长和宽
    int screenWidth, screenHeight;

    public TrainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_train, container, false);
        context = getContext();

        ButterKnife.inject(this, view);

        initView(view);
        initListener();


        return view;
    }

    private void initView(View view) {
       // mainTrationFrist.setBackgroundResource(R.mipmap.main_train_first);
        topBar = (TopBar) view.findViewById(R.id.train_topBar);

        starsLayout = (StarLinearLayout) view.findViewById(R.id.train_real1_first1_ratingbar_lin2);


    }


    private void initListener() {
        StarLayoutParams params = new StarLayoutParams();
        params.setNormalStar(getResources().getDrawable(R.mipmap.star_normal))
                .setSelectedStar(getResources().getDrawable(R.mipmap.star_selected))
                .setSelectable(false)
                .setSelectedStarNum(1)
                .setTotalStarNum(5)
                .setStarHorizontalSpace(5);
        starsLayout.setStarParams(params);
        topBar.setTopBarClickListener(new TopBarClickListener() {
            @Override
            public void rightBtnClick() {
                //处理右边按钮所对应的逻辑
                Toast.makeText(context, "你点击的是右边的按钮", Toast.LENGTH_LONG).show();
            }

            @Override
            public void leftBtnClick() {
                //处理左边按钮所对应的逻辑
                Toast.makeText(context, "你点击的是左边的按钮", Toast.LENGTH_LONG).show();
            }
        });

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
