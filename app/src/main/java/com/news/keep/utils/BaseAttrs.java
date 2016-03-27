package com.news.keep.utils;

import android.content.Context;

import com.news.keep.App;


public class BaseAttrs {
	public static final int INVAILD_VALUE = -1;
	
	protected Context mContext;
	
	protected BaseAttrs() {
		mContext = App.instance();
	}

}
