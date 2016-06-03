package com.news.keep.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.news.keep.R;
import com.news.keep.activity.MainActivity;
import com.news.keep.activity.Splash1Activity;
import com.news.keep.bean.People;
import com.news.keep.utils.Design;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.LogInListener;

public class Login_Dialog extends DialogFragment {

    private static final String TAG = "Login_Dialog";
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
    @InjectView(R.id.login_edit_username_txtin)
    TextInputLayout loginEditUsernameTxtin;
    @InjectView(R.id.login_edit_psd_txtin)
    TextInputLayout loginEditPsdTxtin;

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
    String username1;
    String password1;


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
        loginEditUsernameTxtin.setHint("MobilePhone");
        loginEditPsdTxtin.setHint("Password");


        //用.getEditText()拿到TextInputLayout里的EditText，因为TextInputLayout中有getEditText()方法，所以我们不需要findViewById，用get就行。
        loginEditPsdTxtin.getEditText().addTextChangedListener(new Design(loginEditPsdTxtin, "密码长度不能小于6位或大于10"));
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //如果setCancelable()中参数为true，若点击dialog覆盖不到的activity的空白或者按返回键，则进行cancel，状态检测依次onCancel()和onDismiss()。如参数为false，则按空白处或返回键无反应。缺省为true
        setCancelable(true);
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

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            int what = msg.what;
            if (what == 1) {
                Log.e(TAG, "跳转");
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }

        }
    };

    private void login() {
     //   hideKeyboard();
        username1 = loginEditUsername.getText().toString();
        password1 = loginEditPsd.getText().toString();
        Log.e("login",username1+"::::"+password1);
      /*  Pattern p = Pattern.compile("^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,10}$");
        Matcher m = p.matcher(password1);
        if (!m.matches()) {
            loginEditPsd.setText("");
            loginEditPsdTxtin.setError("密码格式不正确");
        }*/

        BmobUser.loginByAccount(getActivity(), username1, password1, new LogInListener<People>() {

            @Override
            public void done(People user, BmobException e) {
                // TODO Auto-generated method stub
                if(user!=null){
                    Log.i("smile","用户登陆成功");
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);
                 //   TLUtil.showToast(getActivity(), bu2.getUsername() + "登陆成功");
                    testGetCurrentUser();
                }
            }
        });
    /*    final BmobUser bu2 = new BmobUser();
        bu2.setMobilePhoneNumber(username1);
        //bu2.setUsername(username1);
        bu2.setPassword(password1);
        System.out.println(username1+":"+password1);
        bu2.login(getActivity(), new SaveListener() {
            @Override
            public void onSuccess() {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
                TLUtil.showToast(getActivity(), bu2.getUsername() + "登陆成功");
                testGetCurrentUser();
            }

            @Override
            public void onFailure(int code, String msg) {
                // TODO Auto-generated method stub
                TLUtil.showToast(getActivity(), "登陆失败:" + msg);
            }
        });*/

    }

    private void testGetCurrentUser() {
        People myUser = BmobUser.getCurrentUser(getContext(), People.class);
        String username = (String) BmobUser.getObjectByKey(getActivity(), "username");
        String mobilePhoneNumber = (String) BmobUser.getObjectByKey(getActivity(), "mobilePhoneNumber");
        String objectId = (String) BmobUser.getObjectByKey(getActivity(), "objectId");
        String createdAt = (String) BmobUser.getObjectByKey(getActivity(), "createdAt");
        String sessionToken = (String) BmobUser.getObjectByKey(getActivity(), "sessionToken");
        Integer age = (Integer) BmobUser.getObjectByKey(getActivity(), "age");
        Boolean gender = (Boolean) BmobUser.getObjectByKey(getActivity(), "gender");
        Log.i("bmob", "" + ">>>" + myUser.getUsername() + username + ",\n" + mobilePhoneNumber + ",\n" + objectId + ",\n" + createdAt + ",\n" + sessionToken + ",\n" + age + ",\n" + gender);
    }


    @OnClick(R.id.login_btn_login)
    public void onClick() {
        login();
    }

    private void hideKeyboard() {
        View view = getActivity().getCurrentFocus();
        if (view != null) {
            ((InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE)).
                    hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }
}
