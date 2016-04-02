package com.news.keep.dao;

import android.annotation.SuppressLint;

import cn.bmob.v3.BmobObject;

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
public class People extends BmobObject {
    private static final long serialVersionUID = 1L;



    private String username;//昵称
    private String age;//年龄
    private String gender;//性别
    private String address;//地址
    private String email;//邮箱
    private String mobilePhoneNumber;//手机号码-唯一
    private String img;//头像地址
    private String weight;//体重
    private String height;//身高
    private String password;//密码



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
