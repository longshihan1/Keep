package com.news.keep.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

public class BitmapToBase64 {
	/**
	 * 
	 * @param imgPath
	 * @param bitmap
	 * @param imgFormat
	 *            ͼƬ��ʽ
	 * @return
	 */
	public static String imgToBase64(String imgPath) {
		Bitmap bitmap=null;
		if (imgPath != null && imgPath.length() > 0) {
			bitmap = readBitmap(imgPath);
		}
		ByteArrayOutputStream out = null;
		try {
			out = new ByteArrayOutputStream();
			bitmap.compress(Bitmap.CompressFormat.JPEG, 100, out);

			out.flush();
			out.close();

			byte[] imgBytes = out.toByteArray();
			return Base64.encodeToString(imgBytes, Base64.DEFAULT);
		} catch (Exception e) {
			return null;
		} finally {
			try {
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static Bitmap readBitmap(String imgPath) {
		try {
			return BitmapFactory.decodeFile(imgPath);
		} catch (Exception e) {
			return null;
		}

	}

}
