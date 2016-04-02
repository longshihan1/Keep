package com.news.keep.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;

import com.news.keep.R;

import java.text.DecimalFormat;

public class CircleProgressBar extends View{
	
	public static final int ANIMATE_DURATION = 1000;			//默认动画执行时间
	public static final int DEFAULT_DELAY = 500;				//默认延时
	
	private int cpbBackgroundColor;								//背景色
	private int cpbBarColor;									//进度条颜色
	private int cpbCenterColor = Color.WHITE;					//中心
	private float cpbPadding = 10;								//进度条据边缘距离
	private float cpbBarWidth = 30;								//进度条宽度
	private float mProgress = 0.6f;								//当前进度
	private int cpbTextColor;									//进度文字颜色
	private int cpbTextSize;									//进度文字大小
	private String cpbTextFormat;								//进度文字格式
	private long duration;										//动画执行时间
	private long delay;											//动画延时执行时间
	private boolean isAnimate;									//是否显示动画	true:显示动画；false:不显示动画
	
	private float tempProgress = 0f;
	
	private Paint paint;
	private DrawThread drawThread;
	
	public CircleProgressBar(Context context){
		this(context, Color.rgb(221, 221, 221), Color.rgb(116, 185, 4), Color.WHITE, 10, 40);
	}
	
	public CircleProgressBar(Context context, boolean isAnimate){
		this(context, Color.rgb(221, 221, 221), Color.rgb(116, 185, 4), Color.WHITE, 10, 40, ANIMATE_DURATION, DEFAULT_DELAY, true);
	}
	
	public CircleProgressBar(Context context, int cpbBackgroundColor, int cpbBarColor, int cpbCenterColor, float cpbPadding, float cpbBarWidth){
		this(context, cpbBackgroundColor, cpbBarColor, cpbCenterColor, cpbPadding, cpbBarWidth, ANIMATE_DURATION, DEFAULT_DELAY, false);
	}
	
	public CircleProgressBar(Context context, int cpbBackgroundColor, int cpbBarColor, int cpbCenterColor, float cpbPadding, float cpbBarWidth, long duration, long delay, boolean isAnimate){
		this(context, cpbBackgroundColor, cpbBarColor, cpbCenterColor, cpbPadding, cpbBarWidth, Color.BLACK, 18, duration, delay, isAnimate);
	}
	
	public CircleProgressBar(Context context, int cpbBackgroundColor, int cpbBarColor, int cpbCenterColor, float cpbPadding, float cpbBarWidth, int cpbTextColor, int cpbTextSize, long duration, long delay, boolean isAnimate){
		this(context, cpbBackgroundColor, cpbBarColor, cpbCenterColor, cpbPadding, cpbBarWidth, 0f, cpbTextColor, cpbTextSize, null, duration, delay, isAnimate);
	}
	
	public CircleProgressBar(Context context, int cpbBackgroundColor,
			int cpbBarColor, int cpbCenterColor, float cpbPadding,
			float cpbBarWidth, float mProgress, int cpbTextColor,
			int cpbTextSize, String cpbTextFormat, long duration, long delay, boolean isAnimate) {
		super(context);
		this.cpbBackgroundColor = cpbBackgroundColor;
		this.cpbBarColor = cpbBarColor;
		this.cpbCenterColor = cpbCenterColor;
		this.cpbPadding = cpbPadding;
		this.cpbBarWidth = cpbBarWidth;
		this.mProgress = mProgress;
		this.cpbTextColor = cpbTextColor;
		this.cpbTextSize = cpbTextSize;
		this.cpbTextFormat = cpbTextFormat;
		this.duration = duration;
		this.delay = delay;
		this.isAnimate = isAnimate;
		initParams();
	}

	public CircleProgressBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.CircleProgressBar);
		cpbBackgroundColor = array.getColor(R.styleable.CircleProgressBar_cpb_background_color, Color.rgb(221, 221, 221));
		cpbBarColor = array.getColor(R.styleable.CircleProgressBar_cpb_bar_color, Color.rgb(116, 185, 4));
		cpbCenterColor = array.getColor(R.styleable.CircleProgressBar_cpb_center_color, Color.WHITE);
		cpbPadding = array.getDimensionPixelSize(R.styleable.CircleProgressBar_cpb_padding, 15);
		cpbBarWidth = array.getDimensionPixelSize(R.styleable.CircleProgressBar_cpb_bar_width, 40);
		mProgress = array.getFloat(R.styleable.CircleProgressBar_cpb_progress, 0f);
		cpbTextColor = array.getColor(R.styleable.CircleProgressBar_cpb_text_color, Color.BLACK);
		cpbTextSize = array.getDimensionPixelSize(R.styleable.CircleProgressBar_cpb_text_size, 18);
		cpbTextFormat = array.getString(R.styleable.CircleProgressBar_cpb_text_format);
		duration = array.getInt(R.styleable.CircleProgressBar_cpb_duration, ANIMATE_DURATION);
		delay = array.getInt(R.styleable.CircleProgressBar_cpb_delay, DEFAULT_DELAY);
		isAnimate = array.getBoolean(R.styleable.CircleProgressBar_cpb_is_animate, false);
		array.recycle();
		initParams();
	}
	
	public void invalidate() {
		tempProgress = 0;
		if(drawThread != null){
			drawThread.interrupt();
			drawThread = null;
		}
        super.invalidate();
    }
	
	public int getCpbBackgroundColor() {
		return cpbBackgroundColor;
	}
	
	public void setCpbBackgroundColor(int cpbBackgroundColor) {
		this.cpbBackgroundColor = cpbBackgroundColor;
		invalidate();
	}

	public int getCpbBarColor() {
		return cpbBarColor;
	}

	public void setCpbBarColor(int cpbBarColor) {
		this.cpbBarColor = cpbBarColor;
		invalidate();
	}

	public int getCpbCenterColor() {
		return cpbCenterColor;
	}

	public void setCpbCenterColor(int cpbCenterColor) {
		this.cpbCenterColor = cpbCenterColor;
		invalidate();
	}

	public float getCpbPadding() {
		return cpbPadding;
	}

	public void setCpbPadding(float cpbPadding) {
		this.cpbPadding = cpbPadding;
		invalidate();
	}

	public float getCpbBarWidth() {
		return cpbBarWidth;
	}

	public void setCpbBarWidth(float cpbBarWidth) {
		this.cpbBarWidth = cpbBarWidth;
		invalidate();
	}

	public float getProgress() {
		return mProgress;
	}

	public void setProgress(float mProgress) {
		this.mProgress = mProgress;
		initParams();
		invalidate();
	}

	public int getCpbTextColor() {
		return cpbTextColor;
	}

	public void setCpbTextColor(int cpbTextColor) {
		this.cpbTextColor = cpbTextColor;
		invalidate();
	}

	public int getCpbTextSize() {
		return cpbTextSize;
	}

	public void setCpbTextSize(int cpbTextSize) {
		this.cpbTextSize = cpbTextSize;
		invalidate();
	}

	public String getCpbTextFormat() {
		return cpbTextFormat;
	}

	public void setCpbTextFormat(String cpbTextFormat) {
		this.cpbTextFormat = cpbTextFormat;
		initParams();
		invalidate();
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
		initParams();
	}
	
	public long getDelay() {
		return delay;
	}

	public void setDelay(long delay) {
		this.delay = delay;
		initParams();
	}

	public boolean isAnimate() {
		return isAnimate;
	}

	public void setAnimate(boolean isAnimate) {
		this.isAnimate = isAnimate;
	}

	public void initParams(){
//		if(mProgress > 1){
//			mProgress = 1;
//		}
		if(duration <= 0){
			duration = ANIMATE_DURATION;
		}
		if(delay < 0){
			duration = 0;
		}
		if(cpbTextFormat == null || !cpbTextFormat.matches("^#+0?(.#+)?$")){
			cpbTextFormat = "##0";
		}
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		
		//是否显示动画
		if(isAnimate && drawThread == null){
			drawThread = new DrawThread();
			tempProgress = 0;
			drawThread.start();
		}
		
		//不显示动画，一次画完
		if(!isAnimate){
			tempProgress = mProgress;
		}
		drawProgress(tempProgress, canvas);
		super.onDraw(canvas);
	}
	
	/**
	 * 根据进度获取角度
	 * @param progress	进度
	 * @return
	 */
	public float getArc(float progress){
		return progress * 360;
	}
	
	Handler handler = new Handler(){
		@Override
		public void handleMessage(Message msg) {
			CircleProgressBar.super.invalidate();
		}
	};
	
	public void drawProgress(float progress, Canvas canvas){
		int width = getWidth();
		int height = getHeight();
		int radius = width / 2 > height / 2 ? height / 2 : width / 2;
		float centerX = getWidth() / 2;
		float centerY = getHeight() / 2;
		paint = new Paint();
		
		//画背景
		paint.setColor(cpbBackgroundColor);
		paint.setAntiAlias(true);
		canvas.drawCircle(centerX, centerY, radius, paint);

		//画进度条
		paint.setColor(cpbBarColor);
		RectF oval = new RectF(centerX - radius + cpbPadding, centerY - radius + cpbPadding, centerX + radius - cpbPadding, centerY + radius - cpbPadding);
		canvas.drawArc(oval, -90, getArc(progress > 1 ? 1 : progress), true, paint);
		
		//画中心圆
		paint.setColor(cpbCenterColor);
		canvas.drawCircle(centerX, centerY, radius - cpbPadding - cpbBarWidth, paint);
		
		//当前进度
		paint.setColor(cpbTextColor);
		paint.setTextSize(cpbTextSize);
		Rect bounds = new Rect();
		DecimalFormat df = new DecimalFormat(cpbTextFormat);	//进度字符串的显示格式
		String text = df.format(progress * 100) + "%";
		paint.getTextBounds(text, 0, text.length(), bounds);
		float textLeft = (getWidth() - bounds.width()) / 2;
		float textButtom = (getHeight() + bounds.height()) / 2;
		canvas.drawText(text, textLeft, textButtom, paint);
	}
	
	class DrawThread extends Thread{
		@Override
		public void run() {
			try {
				Thread.sleep(delay);
				long t = duration / 10;
				for(int i = 1; i <= t; i++){
					if(!isInterrupted()){
						tempProgress = mProgress / t * i;
						handler.obtainMessage().sendToTarget();
						Thread.sleep(10);
					}else{
						break;
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
