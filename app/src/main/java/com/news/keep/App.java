package com.news.keep;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;

import com.bmob.BmobConfiguration;
import com.bmob.BmobPro;
import com.news.keep.utils.Constans;
import com.news.keep.utils.SharePreferenceUtils;

import java.util.Iterator;
import java.util.List;

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
    public static Context applicationContext;
    private  static App application;
    private static final String WELCOME_GUIDE = "welcome_guide";
    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        initConfig(getApplicationContext());
        _instance = this;
        applicationContext=this;

        // 初始化 Bmob SDK
        Bmob.initialize(getApplicationContext(), Constans.Bmob_APPID);
        //初始化sharedSDK的短信SDK
        SMSSDK.initSDK(this, Constans.Mob_SMS_ID, Constans.MOb_SMS_SCRECT);
        SharePreferenceUtils.init(this);
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

    public static App getApplication(){
        return application;
    }
    public static App instance() {
        return _instance;
    }


    /**
     * 判断程序是否是第一次启动，如果是第一次启动，需要显示引导页面
     *
     * @return
     */
    public boolean getIsNeedWelcomeGuide() {

        int currentVersion = App.instance().getVersionCode();

        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);

        final int lastVersion = sharedPreferences.getInt(WELCOME_GUIDE, -1);
        if (currentVersion > lastVersion) {
            sharedPreferences.edit().putInt(WELCOME_GUIDE, currentVersion).commit();
            return true;
        }
        return false;
    }

    /**
     * 获取版本号标示
     *
     * @return
     */
    public int getVersionCode() {
        String packageName = getPackageName();
        try {
            return getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            // Log.e(TAG, e.getMessage());
        }
        return 0;
    }

    private String getAppName(int pID) {
        String processName = null;
        ActivityManager am = (ActivityManager) this
                .getSystemService(ACTIVITY_SERVICE);
        List l = am.getRunningAppProcesses();
        Iterator i = l.iterator();
        PackageManager pm = this.getPackageManager();
        while (i.hasNext()) {
            ActivityManager.RunningAppProcessInfo info = (ActivityManager.RunningAppProcessInfo) (i
                    .next());
            try {
                if (info.pid == pID) {
                    CharSequence c = pm.getApplicationLabel(pm
                            .getApplicationInfo(info.processName,
                                    PackageManager.GET_META_DATA));
                    processName = info.processName;
                    return processName;
                }
            } catch (Exception e) {
            }
        }
        return processName;
    }
}
