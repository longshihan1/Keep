package com.news.keep.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.news.keep.R;
import com.news.keep.activity.Splash1Activity;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2016/3/23.
 * 项目名称：Keep
 * 类描述：手机注册界面
 * 创建人：Administrator
 * 创建时间：2016/3/23 16:31
 * 修改人：Administrator
 * 修改时间：2016/3/23 16:31
 * 修改备注：
 */
public class Register_dialog extends DialogFragment {
    @InjectView(R.id.redister_edit_username)
    EditText redisterEditUsername;
    @InjectView(R.id.register_codes)
    EditText registerCodes;
    @InjectView(R.id.register_btn)
    Button registerBtn;
    @InjectView(R.id.register_agree)
    Button registerAgree;
    private Splash1Activity mActivity;
    private View view;

    public static Register_dialog newInstance() {

        Bundle args = new Bundle();

        Register_dialog fragment = new Register_dialog();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mActivity = (Splash1Activity) getActivity();
        view = inflater.inflate(R.layout.activity_register, container, false);
        ButterKnife.inject(this, super.onCreateView(inflater, container, savedInstanceState));
        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //如果setCancelable()中参数为true，若点击dialog覆盖不到的activity的空白或者按返回键，则进行cancel，状态检测依次onCancel()和onDismiss()。如参数为false，则按空白处或返回键无反应。缺省为true
        setCancelable(true);
        //可以设置dialog的显示风格，如style为STYLE_NO_TITLE，将被显示title。遗憾的是，我没有在DialogFragment中找到设置title内容的方法。theme为0，表示由系统选择合适的theme。
        //  int style = DialogFragment.STYLE_NO_NORMAL, theme = 0;
        //  setStyle(style,theme);
        int style = DialogFragment.STYLE_NO_TITLE, theme = R.style.DialogStyle;
        setStyle(style, theme);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    @OnClick({R.id.register_btn, R.id.register_agree})
    public void onClick(View view) {
        switch (view.getId()) {
            //获取验证码
            case R.id.register_btn:

                break;
            case R.id.register_agree:
                break;
        }
    }
}
