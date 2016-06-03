package com.news.keep.bean;

import android.annotation.SuppressLint;

import java.io.Serializable;
import java.util.List;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobPointer;
import cn.bmob.v3.datatype.BmobRelation;

/**
 * Created by Administrator on 2016/3/17.
 * 项目名称：Keep
 * 类描述：user
 * 创建人：龙贺
 * 创建时间：2016/3/17 22:07
 * 修改人：Administrator
 * 修改时间：2016/3/17 22:07
 * 修改备注：
 */

@SuppressLint("ParcelCreator")
public class People extends BmobUser {
    private static final long serialVersionUID = 1L;

    private String peoage;//年龄
    private String peogender;//性别
    private String peoaddress;//地址
    // private String email;//邮箱
    private String peoimg;//头像地址
    private String peoweight;//体重
    private String peoheight;//身高
    private List<Whois> UserJoin;//参加的活动

    private BmobRelation UserAtt;//关注
    private BmobPointer eeee;//试一试
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public BmobPointer getEeee() {
        return eeee;
    }

    public void setEeee(BmobPointer eeee) {
        this.eeee = eeee;
    }

    public BmobRelation getUserAtt() {
        return UserAtt;
    }

    public void setUserAtt(BmobRelation userAtt) {
        UserAtt = userAtt;
    }

    public List<Whois> getUserJoin() {
        return UserJoin;
    }

    public void setUserJoin(List<Whois> userJoin) {
        UserJoin = userJoin;
    }

    @Override
    public String toString() {
        return "People{" +
                ", peoage='" + peoage + '\'' +
                ", peogender='" + peogender + '\'' +
                ", peoaddress='" + peoaddress + '\'' +
                ", peoimg='" + peoimg + '\'' +
                ", peoweight='" + peoweight + '\'' +
                ", peoheight='" + peoheight + '\'' +
                '}';
    }


    public String getPeoage() {
        return peoage;
    }

    public void setPeoage(String peoage) {
        this.peoage = peoage;
    }

    public String getPeogender() {
        return peogender;
    }

    public void setPeogender(String peogender) {
        this.peogender = peogender;
    }

    public String getPeoaddress() {
        return peoaddress;
    }

    public void setPeoaddress(String peoaddress) {
        this.peoaddress = peoaddress;
    }


    public String getPeoimg() {
        return peoimg;
    }

    public void setPeoimg(String peoimg) {
        this.peoimg = peoimg;
    }

    public String getPeoweight() {
        return peoweight;
    }

    public void setPeoweight(String peoweight) {
        this.peoweight = peoweight;
    }

    public String getPeoheight() {
        return peoheight;
    }

    public void setPeoheight(String peoheight) {
        this.peoheight = peoheight;
    }

    public static class Whois implements Serializable {
        private String u_id;//bmob数据库的id
        private String i_id;//数据的id

        public Whois(String u_id, String i_id) {
            this.i_id = i_id;
            this.u_id = u_id;
        }

        public String getU_id() {
            return u_id;
        }

        public void setU_id(String u_id) {
            this.u_id = u_id;
        }

        public String getI_id() {
            return i_id;
        }

        public void setI_id(String i_id) {
            this.i_id = i_id;
        }
    }
}
