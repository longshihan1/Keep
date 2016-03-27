package com.news.keep.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.news.keep.R;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;

public class ImageLoaderDisplay {

	private static ImageLoader imageLoader;
	private static DisplayImageOptions options;

	public static void displayImage(Context context, String url,
			ImageView imageView) {
		initImageLoader(context);
		imageLoader.displayImage(url, imageView, options);
	}

	private static void initImageLoader(Context context) {
		ImageLoaderConfiguration.Builder builder = new ImageLoaderConfiguration.Builder(
				context).threadPriority(Thread.NORM_PRIORITY - 2)
				.denyCacheImageMultipleSizesInMemory()
				.discCacheFileNameGenerator(new Md5FileNameGenerator())
				.tasksProcessingOrder(QueueProcessingType.LIFO);
		if (BuildConfig.DEBUG) {
			builder.writeDebugLogs();
		}
		options = new DisplayImageOptions.Builder()
				.showStubImage(R.mipmap.ic_launcher)
				.showImageForEmptyUri(R.mipmap.ic_launcher)
				.showImageOnFail(R.mipmap.ic_launcher).cacheInMemory(true)
				.cacheOnDisc(true).bitmapConfig(Bitmap.Config.ARGB_8888)
				.build();
		if(imageLoader==null)
		imageLoader.getInstance().init(builder.build());
		imageLoader = ImageLoader.getInstance();
	}
	
	public static void clear(){
		imageLoader.clearDiscCache();
		imageLoader.clearMemoryCache();
	}
	
}
