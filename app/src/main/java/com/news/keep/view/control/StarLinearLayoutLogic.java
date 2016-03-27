package com.news.keep.view.control;

import com.news.keep.view.model.StarLayoutParams;

/**
 * Created by Administrator on 2016/3/19.
 * 项目名称：Keep
 * 类描述：星星的逻辑控制
 * 创建人：Administrator
 * 创建时间：2016/3/19 14:00
 * 修改人：Administrator
 * 修改时间：2016/3/19 14:00
 * 修改备注：
 */
public class StarLinearLayoutLogic {
    /** 当前已选择的星星数 */
    private int curStarNum;
    private StarLayoutParams mParams;
    private IStarSelectedLis starSelectedLi;



    public interface IStarSelectedLis {
        void onSelected(int curStarNum);
    }

    public StarLinearLayoutLogic(IStarSelectedLis lis) {
        starSelectedLi = lis;
    }

    public void setParams(StarLayoutParams params) {
        mParams = params;
        curStarNum = params.getSelectedStarNum();
    }

    public float getCurStarNum() {
        return curStarNum;
    }

    /**
     * 返回当前选中的星星数给上层
     */
    public void onStarClick(int clickPosition) {
        curStarNum = clickPosition + 1;
        if(starSelectedLi != null) {
            starSelectedLi.onSelected(curStarNum);
        }
    }
}
