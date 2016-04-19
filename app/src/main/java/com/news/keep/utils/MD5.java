package com.news.keep.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2016/4/12.
 * 项目名称：Keep
 * 类描述：使用MD5算法对传入的key进行加密并返回。
 * 创建人：longshihan
 * 创建时间：2016/4/12 10:53
 * 修改人：Administrator
 * 修改时间：2016/4/12 10:53
 * 修改备注：
 * 邮箱： longshihan@163.com
 */
public class MD5 {
    public void MD5() {

    }

    public static String hashKeyForDisk(String key) {
        String cacheKey;
        try {
            final MessageDigest mDigest = MessageDigest.getInstance("MD5");
            mDigest.update(key.getBytes());
            cacheKey = bytesToHexString(mDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            cacheKey = String.valueOf(key.hashCode());
        }
        return cacheKey;
    }

    private static String bytesToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(0xFF & bytes[i]);
            if (hex.length() == 1) {
                sb.append('0');
            }
            sb.append(hex);
        }
        return sb.toString();
    }
}
