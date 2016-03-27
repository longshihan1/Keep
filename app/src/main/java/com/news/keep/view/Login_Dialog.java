package com.news.keep.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.news.keep.R;
import com.news.keep.activity.Splash1Activity;
import com.news.keep.utils.TLUtil;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.listener.SaveListener;

public class Login_Dialog extends DialogFragment{

    @InjectView(R.id.login_edit_username)
    EditText loginEditUsername;
    @InjectView(R.id.login_edit_psd)
    EditText loginEditPsd;
    @InjectView(R.id.login_check_session)
    CheckBox loginCheckSession;

    @InjectView(R.id.login_btn_login)
    Button loginBtnLogin;
    @InjectView(R.id.login_user_image)
    ImageView loginUserImage;
    private Splash1Activity mActivity;
    private EditText username, password;
    private Button login, qq_login, wechat_login, weibo_login;
    private String str_username, str_psd;
    private Button btn_login, btn_qq, btn_wechat, btn_weixin;
    private CheckBox re_me;
    private View view;
    private LinearLayout ll_login;
    private boolean isPage;
    private boolean isClick;
    private boolean isLogin;



    public static Login_Dialog newInstance() {

        Bundle b = new Bundle();
        Login_Dialog fragment = new Login_Dialog();
        fragment.setArguments(b);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        mActivity = (Splash1Activity) getActivity();
        view = inflater.inflate(R.layout.activity_login, container, false);
        ButterKnife.inject(this, view);
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
    public void onResume() {
        super.onResume();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }


    private void login() {
        String username1 = loginEditUsername.getText().toString();
        String password1 = loginEditPsd.getText().toString();
        final BmobUser bu2 = new BmobUser();
        bu2.setUsername(username1);
        bu2.setPassword(password1);
        bu2.login(getActivity(), new SaveListener() {

            @Override
            public void onSuccess() {
                TLUtil.showToast(getActivity(), bu2.getUsername() + "登陆成功");
                testGetCurrentUser();
            }

            @Override
            public void onFailure(int code, String msg) {
                // TODO Auto-generated method stub
                TLUtil.showToast(getActivity(), "登陆失败:" + msg);
            }
        });

    }

    private void testGetCurrentUser() {
//		MyUser myUser = BmobUser.getCurrentUser(this, MyUser.class);
//		if (myUser != null) {
//			Log.i("life","本地用户信息:objectId = " + myUser.getObjectId() + ",name = " + myUser.getUsername()
//					+ ",age = "+ myUser.getAge());
//		} else {
//			toast("本地用户为null,请登录。");
//		}
        //V3.4.5版本新增加getObjectByKey方法获取本地用户对象中某一列的值
        String username = (String) BmobUser.getObjectByKey(getActivity(), "username");
        String mobilePhoneNumber = (String) BmobUser.getObjectByKey(getActivity(), "mobilePhoneNumber");
        String objectId = (String) BmobUser.getObjectByKey(getActivity(), "objectId");
        String createdAt = (String) BmobUser.getObjectByKey(getActivity(), "createdAt");
        String sessionToken = (String) BmobUser.getObjectByKey(getActivity(), "sessionToken");
        Integer age = (Integer) BmobUser.getObjectByKey(getActivity(), "age");
        Boolean gender = (Boolean) BmobUser.getObjectByKey(getActivity(), "gender");
        Log.i("bmob", "" + username + ",\n" + mobilePhoneNumber + ",\n" + objectId + ",\n" + createdAt + ",\n" + sessionToken + ",\n" + age + ",\n" + gender);
    }



    @OnClick(R.id.login_btn_login)
    public void onClick() {
        login();
    }
}
