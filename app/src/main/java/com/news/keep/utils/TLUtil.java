package com.news.keep.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TLUtil {
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }

    public static void printLog(Object obj) {
        Log.i("OUTPUT", obj.toString());
    }

    public String Time_to_Date(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        String fanhui = null;
        try {
            long diff = System.currentTimeMillis() - sdf.parse(date).getTime();
            int times = (int) (diff / (1000 * 60)) - 8 * 60;
            if (times < 1) {
                fanhui = "刚刚";
            } else if (times < 60) {
                fanhui = "发表于" + Integer.toString(times) + "分钟前";
            } else if (times < 1440) {
                fanhui = "发表于" + Integer.toString(times / 60) + "小时前";
            } else {
                fanhui = "发表于" + Integer.toString(times / 1440) + "天前";
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fanhui;

    }

}
