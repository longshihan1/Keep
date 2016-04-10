package com.news.keep.bean;

import java.util.List;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2016/4/5.
 * 项目名称：Keep
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2016/4/5 10:48
 * 修改人：Administrator
 * 修改时间：2016/4/5 10:48
 * 修改备注：
 */
public class Lesson extends BmobObject {
    private static final long serialVersionUID = 1L;

    private String name;//锻炼名称
    private String difficulty;//难度，1容易K1零基础 2中3难
    private int time_count;//持续时间
    private String peo_position;//锻炼部位
    private String use_tools;//使用机械
    private int pioneer;//参加人数

    private String day_average;//日均
    private String calorie;//消耗卡路里

    private String description;//描述
    private String picture;//图片
    private String detail;//详细

    private int averageDuration;
    private int type;//数据类型，0单次训练1多次训练

    private List<Lesson_peo> people;//参加人id

class Lesson_peo{
    private String objectId;
    private String img;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}

}
