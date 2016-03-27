package com.news.keep.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/3/22.
 * 项目名称：Keep
 * 类描述：Activity的baseActivity
 * 创建人：Administrator
 * 创建时间：2016/3/22 18:07
 * 修改人：Administrator
 * 修改时间：2016/3/22 18:07
 * 修改备注：
 */
public class Base_Activity extends Activity {
    public static String TAG = "bmob";

    protected ListView mListview;
    protected BaseAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    public void toast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        Log.d(TAG, msg);
    }

    Toast mToast;

    public void showToast(String text) {
        if (!TextUtils.isEmpty(text)) {
            if (mToast == null) {
                mToast = Toast.makeText(getApplicationContext(), text,
                        Toast.LENGTH_SHORT);
            } else {
                mToast.setText(text);
            }
            mToast.show();
        }
    }

    public void showToast(int resId) {
        if (mToast == null) {
            mToast = Toast.makeText(getApplicationContext(), resId,
                    Toast.LENGTH_SHORT);
        } else {
            mToast.setText(resId);
        }
        mToast.show();
    }

    public static void showLog(String msg) {
        Log.i("smile", msg);
    }

}
