package com.news.keep.utils.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager;

import com.news.keep.R;

/**
 * Created by Administrator on 2016/4/3.
 * 项目名称：Keep
 * 类描述：弹窗
 * 创建人：Administrator
 * 创建时间：2016/4/3 15:39
 * 修改人：Administrator
 * 修改时间：2016/4/3 15:39
 * 修改备注：
 */
public class LoadingDialog extends Dialog{
    public LoadingDialog(Context context) {
        super(context, R.style.alertThrem);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setCancelable(false);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //View v = inflater.inflate(, null);
        setContentView(R.layout.dialog_layout);
        WindowManager.LayoutParams params = getWindow().getAttributes();
        getWindow().setAttributes((android.view.WindowManager.LayoutParams) params);
    }
}
