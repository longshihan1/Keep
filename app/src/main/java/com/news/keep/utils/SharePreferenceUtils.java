package com.news.keep.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

import com.news.keep.bean.People;

import java.util.Set;

/**
 * SharePreference工具类 使用之前应先inital 将inital放到application中， 程序中直接使用即可
 *
 * @author
 */
public class SharePreferenceUtils {
    public static final int DEFAULT_VALUE = 1001;
    public static final String USER_INFO_KEY = "user";
    private static SharePreferenceUtils sharePreferenceUtils;
    private SharedPreferences mSharedPreferences;
    private SharePreferenceUtils() {
    }

    public static void init(Context context) {
        if (context == null) {
            return;
        }
        if (sharePreferenceUtils == null) {
            sharePreferenceUtils = new SharePreferenceUtils();
            sharePreferenceUtils.mSharedPreferences = context
                    .getSharedPreferences(context.getPackageName(),
                            Context.MODE_PRIVATE);
        }

    }

    public static void putString(String key, String value) {
        SharedPreferences.Editor editor = sharePreferenceUtils.mSharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static void putInt(String key, int value) {
        SharedPreferences.Editor editor = sharePreferenceUtils.mSharedPreferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public static void putFloat(String key, float value) {
        SharedPreferences.Editor editor = sharePreferenceUtils.mSharedPreferences.edit();
        editor.putFloat(key, value);
        editor.commit();
    }

    public static void putBoolean(String key, boolean value) {
        SharedPreferences.Editor editor = sharePreferenceUtils.mSharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    public static void putLong(String key, long value) {
        SharedPreferences.Editor editor = sharePreferenceUtils.mSharedPreferences.edit();
        editor.putLong(key, value);
        editor.commit();
    }

    @SuppressLint("NewApi")
    public static void putStringSet(String key, Set value) {
        SharedPreferences.Editor editor = sharePreferenceUtils.mSharedPreferences.edit();
        editor.putStringSet(key, value);
        editor.commit();
    }

    public static void putObject(String key, Object value) {
        if (value == null) {
            return;
        }
        SharedPreferences.Editor editor = sharePreferenceUtils.mSharedPreferences.edit();
        editor.putString(key, JsonUtil.objetcToJson(value));
        editor.commit();
    }

    public static int getInt(String key) {
        return sharePreferenceUtils.mSharedPreferences.getInt(key,
                DEFAULT_VALUE);
    }

    public static String getString(String key) {
        return sharePreferenceUtils.mSharedPreferences.getString(key, null);
    }

    public static long getLong(String key) {
        return sharePreferenceUtils.mSharedPreferences.getLong(key,
                DEFAULT_VALUE);
    }

    public static float getFloat(String key) {
        return sharePreferenceUtils.mSharedPreferences.getFloat(key,
                DEFAULT_VALUE);
    }

    @SuppressLint("NewApi")
    public static Set<String> getStringSet(String key) {
        return sharePreferenceUtils.mSharedPreferences.getStringSet(key, null);
    }

    public static <T> T getObject(String key, Class<T> clazz) {
        String jsonValue = sharePreferenceUtils.mSharedPreferences.getString(
                key, null);
        if (jsonValue == null || "".equals(jsonValue)) {
            return null;
        }
        return (T) JsonUtil.jsonToObject(jsonValue, clazz);
    }

    public static void remove(String key) {
        SharedPreferences.Editor editor = sharePreferenceUtils.mSharedPreferences.edit();
        editor.remove(key);
        editor.commit();
    }

    public static void logout() {
        remove(USER_INFO_KEY);
    }

    public static SharedPreferences getSharePreference() {
        return sharePreferenceUtils.mSharedPreferences;
    }

    private static void checkInit() throws Exception {
        if (sharePreferenceUtils == null
                || sharePreferenceUtils.mSharedPreferences == null) {
            throw new Exception("SharePreferenceUtils未初始化，请先初始化！");
        }
    }

    public static void saveSharePerfence(String key, Object object) {
        putObject(key, object);
    }

    public static <T> Object getSharePerfence(String key, Class<T> clazz) {
        return getObject(key, clazz);
    }

    // example 存值
    public static void saveUserInformation(People user) {
        putObject(USER_INFO_KEY, user);
    }

    // example 取值
  /*  public static User getUserInfo() {
        return getObject(USER_INFO_KEY, User.class);
    }*/


}
