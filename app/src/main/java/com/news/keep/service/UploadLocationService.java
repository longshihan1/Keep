package com.news.keep.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class UploadLocationService extends IntentService {
	private double Latitude;
	private double Longitude;
	private Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {

		};
	};

	public UploadLocationService() {
		super("locationService");
		// TODO Auto-generated constructor stub

	}

	@Override
	protected void onHandleIntent(Intent intent) {
		// TODO Auto-generated method stub
		Latitude = intent.getDoubleExtra("Latitude", 0);
		Longitude = intent.getDoubleExtra("Longitude", 0);
		Map<String, Object> map = new HashMap<String, Object>();
		JSONObject object = new JSONObject();
		if (Latitude != 0 && Longitude != 0) {
			/*if (HXSDKHelper.getInstance().isLogined()) {
				try {
					UserInfo user=(UserInfo) SharePreferenceUtils.getSharePerfence("userinfo", UserInfo.class);
					String userId = user.getUserId();
					object.put("userId", userId);
					object.put("posx", Longitude);
					object.put("posy", Latitude);
					Log.e("json", Longitude +"-----"+Latitude);
					map.put("json",
							URLEncoder.encode(object.toJSONString(), "utf-8"));
					HttpUtil.sendHttpNoDialog(getApplicationContext(), handler,
							"", map, "saveUserPosition");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
		}
	}

}
