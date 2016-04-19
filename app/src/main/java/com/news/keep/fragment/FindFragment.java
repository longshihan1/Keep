package com.news.keep.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.handmark.pulltorefresh.library.extras.recyclerview.PullToRefreshRecyclerView;
import com.news.keep.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * A simple {@link Fragment} subclass.
 *
 * @author 龙逝寒
 */
public class FindFragment extends Fragment {

    @InjectView(R.id.main_act_recyclerview)
    PullToRefreshRecyclerView mainActRecyclerview;

    private Context context;



    public FindFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_find, container, false);
        ButterKnife.inject(this, view);
        context=getActivity();



        initViews();
        initEvents();

        return view;
    }

    /**
     * 初始化View
     */
    private void initViews() {

    }

    private void initEvents() {

    }



}
