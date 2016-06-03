package com.news.keep.utils.http;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.news.keep.App;

import java.util.Map;

/**
 * Created by Administrator on 2016/4/10.
 * 项目名称：Keep
 * 类描述：封装Volley请求
 * 创建人：longshihan
 * 创建时间：2016/4/10 12:26
 * 修改人：Administrator
 * 修改时间：2016/4/10 12:26
 * 修改备注：
 * 邮箱： longshihan@163.com
 */
public class VolleyRequest {
    public static StringRequest stringRequest;
    public static Context context;

    public static void RequestGet(Context context, String url, String tag, VolleyInterface volleyInterface) {
        App.getHttpQueues().cancelAll(tag);
        stringRequest = new StringRequest(Request.Method.GET, url, volleyInterface.loadingListener(),
                volleyInterface.errorListener());
        stringRequest.setTag(tag);
        App.getHttpQueues().add(stringRequest);
        //App.getHttpQueues().start();
    }

    public static void RequestPost(Context context, String url, String tag, final Map<String, String> params, VolleyInterface volleyInterface) {
        App.getHttpQueues().cancelAll(tag);
        stringRequest = new StringRequest(url, volleyInterface.loadingListener(), volleyInterface.errorListener()) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return params;
            }
        };
        stringRequest.setTag(tag);
        App.getHttpQueues().add(stringRequest);
      // App.getHttpQueues().start();
    }

}
