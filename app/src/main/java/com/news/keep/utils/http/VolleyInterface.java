package com.news.keep.utils.http;

import android.content.Context;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/**
 * Created by Administrator on 2016/4/10.
 * 项目名称：Keep
 * 类描述：Volley的成功和失败的监听事件
 * 创建人：longshihan
 * 创建时间：2016/4/10 12:32
 * 修改人：Administrator
 * 修改时间：2016/4/10 12:32
 * 修改备注：
 * 邮箱： longshihan@163.com
 */
public abstract class VolleyInterface {
    public Context context;
    public static Response.Listener<String> listener;
    public static Response.ErrorListener errorListener;

    public VolleyInterface(Context context, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        this.context = context;
        this.listener = listener;
        this.errorListener = errorListener;
    }

    //成功
    public Response.Listener<String> loadingListener() {
        listener = new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                onMySuccess(s);

            }
        };
        return listener;
    }

    //失败
    public Response.ErrorListener errorListener() {
        errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                onMyError(volleyError);
            }

        };
        return errorListener;
    }

    public abstract void onMySuccess(String result);

    public abstract void onMyError(VolleyError error);
}
