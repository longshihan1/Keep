package com.news.keep.utils.http;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.news.keep.App;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/3.
 * 项目名称：Keep
 * 类描述：处理网络请求，使用volley
 * 创建人：Administrator
 * 创建时间：2016/4/3 14:25
 * 修改人：Administrator
 * 修改时间：2016/4/3 14:25
 * 修改备注：
 */
public class Net {
    public static final String tag = "NET";
    public static final int SUCCESS = 1000000;
    public static final int ERROR = 1000001;
    private static RequestQueue mRequestQueue = null;

    public static RequestQueue getRequestQueue(Context context) {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(context);
            return mRequestQueue;
        }
        return mRequestQueue;
    }

    public static synchronized void sendHttp(Context context, final Handler handler, String msg, String url, final String effect, final String offset) {
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {

            @Override
            public void onResponse(String msg) {
                // parseString(msg.toString(), handler);
                Message msg1 = handler.obtainMessage();
                msg1.what = SUCCESS;
                msg1.obj = msg;
                handler.sendMessage(msg1);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Message message = handler.obtainMessage(ERROR);
                handler.sendMessage(message);
            }
        }) {

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap<String, String>();
                map.put("apparatus", "0");
                map.put("body_part", "0");
                map.put("effect", effect);
                map.put("offset", offset);
                return map;
            }

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> header = new HashMap<String, String>();
                header.put("Cookie", "PHPSESSID=ape9dhjq3ti42t0r91fahuglm2;user_token=cbe8c107-da1d-40cf-a3ca-f7cf3777fc97");
                return header;
            }


        };

        /*StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String msg) {
        //                DialogUtil.dismiss();
           //             TLUtil.printLog(msg);
              //          Log.i(tag, msg.toString());
                        parseString(msg.toString(), handler);
                       // Log.d("TAG", response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //DialogUtil.dismiss();
                Message message = handler.obtainMessage(ERROR);
                handler.sendMessage(message);
                //TLUtil.showToast(App.getApplication().getApplicationContext(), "网络异常!");
               // Log.e("TAG", error.getMessage(), error);
            }
        });*/
        stringRequest.setTag("trainpost");
        App.getHttpQueues().add(stringRequest);
        //mQueue.add(stringRequest);
    }
//context上下文，handler将数据抛出去，tag标记，msg弹出文字，
    public static synchronized void sendHttpGet(Context context, final Handler handler, String tag, String msg, String url, final String effect, final String offset) {
        VolleyRequest.RequestGet(context, url, tag, new VolleyInterface(context, VolleyInterface.listener, VolleyInterface.errorListener) {
            @Override
            public void onMySuccess(String result) {
                Message msg1 = handler.obtainMessage();
                msg1.what = SUCCESS;
                msg1.obj = result;
                handler.sendMessage(msg1);

            }

            @Override
            public void onMyError(VolleyError error) {
                Message message = handler.obtainMessage(ERROR);
                handler.sendMessage(message);
            }
        });

    }

    private static void parseString(String responseContent, Handler handler) {
        // DialogUtil.dismiss();
        try {
            //  JSONObject json = JSON.parseObject(responseContent);


            Message msg = handler.obtainMessage();
            msg.what = SUCCESS;
            msg.obj = responseContent;
            handler.sendMessage(msg);
        } catch (Exception e) {
            //  DialogUtil.dismiss();
            Message msg = handler.obtainMessage();
            msg.what = ERROR;
            handler.sendMessage(msg);
        }

    }

    public static String readUnicodeStr(String unicodeStr) {
        StringBuilder buf = new StringBuilder();
        //因为java转义和正则转义，所以u要这么写
        String[] cc = unicodeStr.split("\\\\u");
        for (String c : cc) {
            if (c.equals(""))
                continue;
            int cInt = Integer.parseInt(c, 16);
            char cChar = (char) cInt;
            buf.append(cChar);
        }
        return buf.toString();
    }
}
