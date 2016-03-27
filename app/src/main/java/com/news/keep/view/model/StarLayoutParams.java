package com.news.keep.view.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Administrator on 2016/3/19.
 * 项目名称：Keep
 * 类描述：星星构造参数
 * 创建人：Administrator
 * 创建时间：2016/3/19 14:02
 * 修改人：Administrator
 * 修改时间：2016/3/19 14:02
 * 修改备注：
 */
public class StarLayoutParams {
    /** 默认选择的星星数为3 */
    public static final int DEF_SELECTED_STAR_NUM = 3;
    /** 星星总数 */
    public static final int DEF_TOTAL_STAR_NUM = 6;
    /** 星星之间的默认间距 */
    public static final int DEF_STAR_HORIZONTAL_SPACE = 10;
    /** 未被选中的星星图片 */
    private Drawable normalStar;
    /** 被选中的星星图片 */
    private Drawable selectedStar;
    /** 星星控件是否可点击选择 */
    private boolean isSelectable;
    private int selectedStarNum = DEF_SELECTED_STAR_NUM;
    private int totalStarNum = DEF_TOTAL_STAR_NUM;
    private int starHorizontalSpace = DEF_STAR_HORIZONTAL_SPACE;

    public Drawable getNormalStar() {
        return normalStar;
    }
    public StarLayoutParams setNormalStar(Drawable normalStar) {
        this.normalStar = normalStar;
        return this;
    }
    public Drawable getSelectedStar() {
        return selectedStar;
    }
    public StarLayoutParams setSelectedStar(Drawable selectedStar) {
        this.selectedStar = selectedStar;
        return this;
    }
    public boolean isSelectable() {
        return isSelectable;
    }
    public StarLayoutParams setSelectable(boolean isSelectable) {
        this.isSelectable = isSelectable;
        return this;
    }
    public int getSelectedStarNum() {
        return selectedStarNum;
    }
    public StarLayoutParams setSelectedStarNum(int selectedStarCnt) {
        this.selectedStarNum = selectedStarCnt;
        return this;
    }
    public int getTotalStarNum() {
        return totalStarNum;
    }
    public StarLayoutParams setTotalStarNum(int totalStarCnt) {
        this.totalStarNum = totalStarCnt;
        return this;
    }
    public int getStarHorizontalSpace() {
        return starHorizontalSpace;
    }

    public StarLayoutParams setStarHorizontalSpace(int starHorizontalSpace) {
        this.starHorizontalSpace = starHorizontalSpace;
        return this;
    }
}
