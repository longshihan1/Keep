package com.news.keep.utils;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;

public class ShareInfo {
	public static void shareInfo(Context context,String title,Uri uri){
		Intent intent=new Intent(Intent.ACTION_SEND);
		intent.setType("image/*");
		List<ResolveInfo> resInfo=context.getPackageManager().queryIntentActivities(intent, 0);
		if(!resInfo.isEmpty()){
			List<Intent> targetedShareIntents=new ArrayList<Intent>();
			boolean isOneQQ=true;
			for(ResolveInfo info:resInfo){
				Intent targeted=new Intent(Intent.ACTION_SEND);
				targeted.setType("image/*");
				ActivityInfo activityInfo=info.activityInfo;
				String as=activityInfo.toString();
				if(activityInfo.packageName.contains("com.sina.weibo")){
					targeted.putExtra(Intent.EXTRA_TITLE, "标题");
					targeted.putExtra(Intent.EXTRA_TEXT, title);
					targeted.setPackage(activityInfo.packageName);
					targetedShareIntents.add(targeted);
				}else if (activityInfo.packageName.contains("tencent.mobileqq")) {
					if(isOneQQ){
					targeted.setType("text/*");
					targeted.putExtra(Intent.EXTRA_TITLE, "标题");
					targeted.putExtra(Intent.EXTRA_SUBJECT, "标题");
					targeted.putExtra(Intent.EXTRA_TEXT, title);
					targeted.setPackage(activityInfo.packageName);
					targeted.setClassName(activityInfo.packageName, activityInfo.name);
					targetedShareIntents.add(targeted);
					isOneQQ=false;
					}
				}else if (as.contains("tencent.mm.ui.tools.ShareImgUI")) {
						targeted.putExtra(Intent.EXTRA_TITLE, "标题");
						targeted.putExtra(Intent.EXTRA_SUBJECT, "标题");
						targeted.putExtra(Intent.EXTRA_TEXT, title);
						targeted.setPackage(activityInfo.packageName);
						targeted.setClassName(activityInfo.packageName, activityInfo.name);
						targetedShareIntents.add(targeted);
				}else if (as.contains("tencent.mm.ui.tools.ShareToTimeLineUI")) {
					targeted.putExtra("Kdescription",title);
					targeted.putExtra(Intent.EXTRA_STREAM, uri);
					targeted.setPackage(activityInfo.packageName);
					targeted.setClassName(activityInfo.packageName, activityInfo.name);
					targetedShareIntents.add(targeted);
			}
			}
			Intent chooserIntent=Intent.createChooser(targetedShareIntents.remove(0),"请选择");
			if(chooserIntent ==null)
				return;
			chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS,targetedShareIntents.toArray(new Parcelable[] {}));
			context.startActivity(chooserIntent);
		}
}

}
