package com.news.keep;

import android.app.Application;
import android.content.Context;

import com.bmob.BmobConfiguration;
import com.bmob.BmobPro;
import com.news.keep.utils.Constans;

import cn.bmob.v3.Bmob;
import cn.smssdk.SMSSDK;

/**
 * Created by Administrator on 2016/3/22.
 * 项目名称：Keep
 * 类描述：Application
 * 创建人：Administrator
 * 创建时间：2016/3/22 18:04
 * 修改人：Administrator
 * 修改时间：2016/3/22 18:04
 * 修改备注：
 */
public class App extends Application {
    private static App _instance;
    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        initConfig(getApplicationContext());
        _instance = this;

        // 初始化 Bmob SDK
        Bmob.initialize(getApplicationContext(), Constans.Bmob_APPID);
        //初始化sharedSDK的短信SDK
        SMSSDK.initSDK(this, Constans.Mob_SMS_ID, Constans.MOb_SMS_SCRECT);
    }

    /**
     * 初始化文件配置
     *
     * @param context
     */
    public static void initConfig(Context context) {
        BmobConfiguration config = new BmobConfiguration.Builder(context).customExternalCacheDir("Smile").build();
        BmobPro.getInstance(context).initConfig(config);
    }
    public static App instance() {
        return _instance;
    }


}
