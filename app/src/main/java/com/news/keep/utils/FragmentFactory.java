package com.news.keep.utils;


import android.support.v4.app.Fragment;

import com.news.keep.fragment.AttentionFragment;
import com.news.keep.fragment.FindFragment;
import com.news.keep.fragment.PersonFragment;
import com.news.keep.fragment.TrainFragment;

/**
 * Created by Administrator on 2016/3/31.
 * 项目名称：Keep
 * 类描述：Fragment工厂
 * 创建人：Administrator
 * 创建时间：2016/3/31 14:55
 * 修改人：Administrator
 * 修改时间：2016/3/31 14:55
 * 修改备注：
 */
public class FragmentFactory {
    public static Fragment getInstanceByIndex(int index) {
        Fragment fragment = null;
        switch (index) {
            case 1:// 健身
                fragment = new TrainFragment();
                break;
            case 2:// 发现
                fragment = new FindFragment();
                break;
            case 3:// 关注
                fragment = new AttentionFragment();
                break;
            case 4:// 我
                fragment = new PersonFragment();
                break;
        }
        return fragment;
    }
}
