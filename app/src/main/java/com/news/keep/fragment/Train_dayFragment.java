package com.news.keep.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.news.keep.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Train_dayFragment extends Fragment {


    public Train_dayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_train_day, container, false);
        return view;
    }

}
