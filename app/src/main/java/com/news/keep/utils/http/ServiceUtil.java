package com.news.keep.utils.http;

/**
 * Created by Administrator on 2016/4/3.
 * 项目名称：Keep
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2016/4/3 15:44
 * 修改人：Administrator
 * 修改时间：2016/4/3 15:44
 * 修改备注：
 */
public class ServiceUtil {
    public interface HttpListener {
        void onError();

        void onResult(Object msg);
    }

    /**
     * 数据交互入口
     */
  /*  public static void service(final String urlName,
                               final HttpListener listener) {
        new Thread() {
            public void run() {
                try {
                    toService(urlName, listener);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }*/
   /* public static boolean toService(String urlName,HttpListener listener) {
        try {
            String result = Net.doPost(Constans.BASE_URL + urlName, map);

            if (result != null) {
                if (listener != null) {
                    listener.onResult(result);
                }
                return true;
            } else {
                doError(listener);
            }
        } catch (Exception e) {
            doError(listener);
        }
        return false;
    }

    public static void doError(HttpListener listener) {
        if (listener != null) {
            listener.onError();
        }
    }
*/
}
