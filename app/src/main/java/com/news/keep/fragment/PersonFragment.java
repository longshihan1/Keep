package com.news.keep.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.news.keep.R;
import com.news.keep.bean.People;

import butterknife.ButterKnife;
import butterknife.InjectView;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.listener.GetListener;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class PersonFragment extends Fragment {


    @InjectView(R.id.textView)
    TextView mTextView;
    @InjectView(R.id.people_setting)
    ImageView mPeopleSetting;
    @InjectView(R.id.people_avatar)
    CircleImageView mPeopleAvatar;
    @InjectView(R.id.people_setting_lin1_1)
    ImageView mPeopleSettingLin11;
    @InjectView(R.id.people_setting_lin1_2)
    TextView mPeopleSettingLin12;
    @InjectView(R.id.people_setting_lin1_3)
    ImageView mPeopleSettingLin13;
    @InjectView(R.id.people_setting_lin2_1)
    ImageView mPeopleSettingLin21;
    @InjectView(R.id.people_setting_lin2_2)
    TextView mPeopleSettingLin22;
    @InjectView(R.id.people_setting_lin2_3)
    ImageView mPeopleSettingLin23;
    @InjectView(R.id.people_setting_lin3_1)
    ImageView mPeopleSettingLin31;
    @InjectView(R.id.people_setting_lin3_2)
    TextView mPeopleSettingLin32;
    @InjectView(R.id.people_setting_lin3_3)
    ImageView mPeopleSettingLin33;
    @InjectView(R.id.people_setting_lin4_1)
    ImageView mPeopleSettingLin41;
    @InjectView(R.id.people_setting_lin4_2)
    TextView mPeopleSettingLin42;
    @InjectView(R.id.people_setting_lin4_3)
    ImageView mPeopleSettingLin43;
    @InjectView(R.id.people_setting_lin5_1)
    ImageView mPeopleSettingLin51;
    @InjectView(R.id.people_setting_lin5_2)
    TextView mPeopleSettingLin52;
    @InjectView(R.id.people_setting_lin5_3)
    ImageView mPeopleSettingLin53;
    @InjectView(R.id.peo_nickname)
    TextView mPeoNickname;

    public PersonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person, container, false);
        ButterKnife.inject(this, view);
        initView();
        return view;
    }

    private void initView() {
        BmobUser bmobUser = BmobUser.getCurrentUser(getActivity());
        String user_id = bmobUser.getObjectId();
        BmobQuery<People> bmobQuery = new BmobQuery<People>();
        bmobQuery.getObject(getActivity(), user_id, new GetListener<People>() {
            @Override
            public void onSuccess(People people) {
                String name = people.getNickname();
                mPeoNickname.setText(name);
                // String url=people.getPeoimg();


            }

            @Override
            public void onFailure(int code, String msg) {
                // TODO Auto-generated method stub
                // toast("查询失败：" + msg);
            }
        });


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
