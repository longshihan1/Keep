package com.news.keep.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Administrator on 2016/3/18.
 * 项目名称：Keep
 * 类描述：截取图片中间一部分
 * 创建人：Administrator
 * 创建时间：2016/3/18 22:16
 * 修改人：Administrator
 * 修改时间：2016/3/18 22:16
 * 修改备注：
 */
public class PoritionView extends View {
    private Bitmap showPic = null;
    private int startX = 0;
    private int startY = 0;

    public PoritionView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);
        canvas.drawBitmap(showPic, startX, startY, null);
    }

    public void setBitmapShow(Bitmap b, int x, int y) {
        showPic = b;
        startX = x;
        startY = y;
    }
}
