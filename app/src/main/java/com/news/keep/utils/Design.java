package com.news.keep.utils;

import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;

/**
 * Created by Administrator on 2016/4/12.
 * 项目名称：Keep
 * 类描述：Material Design的相关
 * 创建人：longshihan
 * 创建时间：2016/4/12 15:23
 * 修改人：Administrator
 * 修改时间：2016/4/12 15:23
 * 修改备注：
 * 邮箱： longshihan@163.com
 */
public class Design implements TextWatcher {
    private TextInputLayout mti;
    private String errorinfo;

    public Design(TextInputLayout mtextInputLayout, String errorinfo) {
        this.mti = mtextInputLayout;
        this.errorinfo = errorinfo;
    }
    //编辑之前
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }
    //编辑时
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (s.length() < 6 || s.length() > 10) {
            mti.setErrorEnabled(true);      //是否设置提示错误
            mti.setError(errorinfo);        //错误提示信息
        } else {
            mti.setErrorEnabled(false);     //不设置错误提示信息
        }
    }
    //编辑之后
    @Override
    public void afterTextChanged(Editable s) {

    }
}
