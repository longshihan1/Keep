package com.news.keep.bean;

import java.io.Serializable;
import java.util.List;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobRelation;

/**
 * Created by Administrator on 2016/4/1.
 * 项目名称：Keep
 * 类描述：首页显示
 * 创建人：Administrator
 * 创建时间：2016/4/1 14:56
 * 修改人：Administrator
 * 修改时间：2016/4/1 14:56
 * 修改备注：
 */
public class Train_Display {


    /**
     * updated_at : 1455687320
     * effect : 3
     * duration_count : 738
     * english_name : Stretch Band Full Body Workout
     * old_id : 0
     * weight : 35.00
     * crowd : 0
     * apparatus : 2
     * bodypart : 全身
     * id : 180
     * is_hot : 0
     * version : 1455687320
     * is_looping : 0
     * equipment : 拉伸带 瑜伽垫
     * is_test : 0
     * icon : http://oss-cn-qingdao.aliyuncs.com/fitzerolesson/f22ecade-0f57-4160-8e27-65ece0ce52f5.jpg
     * body_part : 1
     * calorie_count : 4320
     * state : 1
     * calorie : 4320
     * last_lesson_id : 663
     * lesson_count : 24
     * is_new : 0
     * description : 借助拉伸带，通过其阻力训练，舒展及锻炼全身肌肉，提高身体灵活性，燃烧脂肪，塑造完美身体曲线。
     * is_enrolling : 0
     * total : 24
     * background_image : http://oss-cn-qingdao.aliyuncs.com/fitzerolesson/2d6eeb34-81c7-41c2-945a-991e700c8c9b.jpg
     * effect_name : 塑形
     * bonus : 120
     * name : 拉伸带全身塑形
     * created_at : 1435824892
     * difficulty : 0
     * trainee_count : 1970519
     * instruction : 建议每周训练3-4次，每次间隔1-2天
     * player_version : 2
     */

    private List<CategoriesBean> categories;

    public List<CategoriesBean> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoriesBean> categories) {
        this.categories = categories;
    }

    public static class CategoriesBean extends BmobObject implements Serializable {
        private String updated_at;
        private String effect;
        private String duration_count;
        private String english_name;
        private String old_id;
        private String weight;
        private String crowd;
        private String apparatus;
        private String bodypart;
        private String id;
        private String is_hot;
        private String version;
        private String is_looping;
        private String equipment;
        private String is_test;
        private String icon;
        private String body_part;
        private String calorie_count;
        private String state;
        private int calorie;
        private String last_lesson_id;
        private String lesson_count;
        private String is_new;
        private String description;
        private String is_enrolling;
        private String total;
        private String background_image;
        private String effect_name;
        private int bonus;
        private String name;
        private String created_at;
        private String difficulty;
        private int trainee_count;
        private String instruction;
        private String player_version;
        private BmobRelation likes;//多对多关系：用于存储喜欢该帖子的所有用户

        public BmobRelation getLikes() {
            return likes;
        }

        public void setLikes(BmobRelation likes) {
            this.likes = likes;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getEffect() {
            return effect;
        }

        public void setEffect(String effect) {
            this.effect = effect;
        }

        public String getDuration_count() {
            return duration_count;
        }

        public void setDuration_count(String duration_count) {
            this.duration_count = duration_count;
        }

        public String getEnglish_name() {
            return english_name;
        }

        public void setEnglish_name(String english_name) {
            this.english_name = english_name;
        }

        public String getOld_id() {
            return old_id;
        }

        public void setOld_id(String old_id) {
            this.old_id = old_id;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getCrowd() {
            return crowd;
        }

        public void setCrowd(String crowd) {
            this.crowd = crowd;
        }

        public String getApparatus() {
            return apparatus;
        }

        public void setApparatus(String apparatus) {
            this.apparatus = apparatus;
        }

        public String getBodypart() {
            return bodypart;
        }

        public void setBodypart(String bodypart) {
            this.bodypart = bodypart;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIs_hot() {
            return is_hot;
        }

        public void setIs_hot(String is_hot) {
            this.is_hot = is_hot;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getIs_looping() {
            return is_looping;
        }

        public void setIs_looping(String is_looping) {
            this.is_looping = is_looping;
        }

        public String getEquipment() {
            return equipment;
        }

        public void setEquipment(String equipment) {
            this.equipment = equipment;
        }

        public String getIs_test() {
            return is_test;
        }

        public void setIs_test(String is_test) {
            this.is_test = is_test;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getBody_part() {
            return body_part;
        }

        public void setBody_part(String body_part) {
            this.body_part = body_part;
        }

        public String getCalorie_count() {
            return calorie_count;
        }

        public void setCalorie_count(String calorie_count) {
            this.calorie_count = calorie_count;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getCalorie() {
            return calorie;
        }

        public void setCalorie(int calorie) {
            this.calorie = calorie;
        }

        public String getLast_lesson_id() {
            return last_lesson_id;
        }

        public void setLast_lesson_id(String last_lesson_id) {
            this.last_lesson_id = last_lesson_id;
        }

        public String getLesson_count() {
            return lesson_count;
        }

        public void setLesson_count(String lesson_count) {
            this.lesson_count = lesson_count;
        }

        public String getIs_new() {
            return is_new;
        }

        public void setIs_new(String is_new) {
            this.is_new = is_new;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIs_enrolling() {
            return is_enrolling;
        }

        public void setIs_enrolling(String is_enrolling) {
            this.is_enrolling = is_enrolling;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getBackground_image() {
            return background_image;
        }

        public void setBackground_image(String background_image) {
            this.background_image = background_image;
        }

        public String getEffect_name() {
            return effect_name;
        }

        public void setEffect_name(String effect_name) {
            this.effect_name = effect_name;
        }

        public int getBonus() {
            return bonus;
        }

        public void setBonus(int bonus) {
            this.bonus = bonus;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public void setDifficulty(String difficulty) {
            this.difficulty = difficulty;
        }

        public int getTrainee_count() {
            return trainee_count;
        }

        public void setTrainee_count(int trainee_count) {
            this.trainee_count = trainee_count;
        }

        public String getInstruction() {
            return instruction;
        }

        public void setInstruction(String instruction) {
            this.instruction = instruction;
        }

        public String getPlayer_version() {
            return player_version;
        }

        public void setPlayer_version(String player_version) {
            this.player_version = player_version;
        }

        @Override
        public String toString() {
            return "CategoriesBean{" +
                    "updated_at='" + updated_at + '\'' +
                    ", effect='" + effect + '\'' +
                    ", duration_count='" + duration_count + '\'' +
                    ", english_name='" + english_name + '\'' +
                    ", old_id='" + old_id + '\'' +
                    ", weight='" + weight + '\'' +
                    ", crowd='" + crowd + '\'' +
                    ", apparatus='" + apparatus + '\'' +
                    ", bodypart='" + bodypart + '\'' +
                    ", id='" + id + '\'' +
                    ", is_hot='" + is_hot + '\'' +
                    ", version='" + version + '\'' +
                    ", is_looping='" + is_looping + '\'' +
                    ", equipment='" + equipment + '\'' +
                    ", is_test='" + is_test + '\'' +
                    ", icon='" + icon + '\'' +
                    ", body_part='" + body_part + '\'' +
                    ", calorie_count='" + calorie_count + '\'' +
                    ", state='" + state + '\'' +
                    ", calorie=" + calorie +
                    ", last_lesson_id='" + last_lesson_id + '\'' +
                    ", lesson_count='" + lesson_count + '\'' +
                    ", is_new='" + is_new + '\'' +
                    ", description='" + description + '\'' +
                    ", is_enrolling='" + is_enrolling + '\'' +
                    ", total='" + total + '\'' +
                    ", background_image='" + background_image + '\'' +
                    ", effect_name='" + effect_name + '\'' +
                    ", bonus=" + bonus +
                    ", name='" + name + '\'' +
                    ", created_at='" + created_at + '\'' +
                    ", difficulty='" + difficulty + '\'' +
                    ", trainee_count=" + trainee_count +
                    ", instruction='" + instruction + '\'' +
                    ", player_version='" + player_version + '\'' +
                    '}';
        }
    }
}
