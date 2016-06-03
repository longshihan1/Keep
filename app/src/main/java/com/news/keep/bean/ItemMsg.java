package com.news.keep.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Administrator
 * @time 2016/5/19 0019 上午 11:30
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class ItemMsg {

    /**
     * _id : 573c1e8e4e540bac61105231
     * content : 变形🙈🙈🙈 @Keep  #我要上精选#
     * photo : http://static1.gotokeep
     * .com/picture/2016/05/18/15/36b6836a55dace73b4790bf995c62d8af5c53545.jpg
     * author : {"_id":"55fe52c51b03358600f70e4a","id":"55fe52c51b03358600f70e4a",
     * "created":"2015-09-20T06:31:33.000Z","username":"我是Amy姐","avatar":"http://static1.gotokeep
     * .com/avatar/2016/05/12/00/4065863328568853da8d4c7e6cdaaa297ec0cdc8.jpg","gender":"F"}
     * __v : 0
     * modified : 2016-05-18T07:49:34.408Z
     * stateValue : 30
     * state : hot
     * achievements : []
     * viewCount : 1
     * favoriteCount : 10
     * contentType : ["text","photo"]
     * type : direct
     * geo : []
     * noise : false
     * public : true
     * likes : 323
     * comments : 36
     * meta : {"name":" 新版功能 ","count":1}
     * created : 2016-05-18T07:49:34.000Z
     * id : 573c1e8e4e540bac61105231
     * hasLiked : false
     * hasFollowed : false
     * hasBlack : false
     * hasMutualFollow : false
     * relation : 0
     */

    private String _id;
    private String content;
    private String photo;
    /**
     * _id : 55fe52c51b03358600f70e4a
     * id : 55fe52c51b03358600f70e4a
     * created : 2015-09-20T06:31:33.000Z
     * username : 我是Amy姐
     * avatar : http://static1.gotokeep.com/avatar/2016/05/12/00/4065863328568853da8d4c7e6cdaaa297ec0cdc8.jpg
     * gender : F
     */

    private AuthorBean author;
    private int __v;
    private String modified;
    private int stateValue;
    private String state;
    private int viewCount;
    private int favoriteCount;
    private String type;
    private boolean noise;
    @SerializedName("public")
    private boolean publicX;
    private int likes;
    private int comments;
    /**
     * name :  新版功能
     * count : 1
     */

    private MetaBean meta;
    private String created;
    private String id;
    private boolean hasLiked;
    private boolean hasFollowed;
    private boolean hasBlack;
    private boolean hasMutualFollow;
    private int relation;
    private List<?> achievements;
    private List<String> contentType;
    private List<?> geo;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public AuthorBean getAuthor() {
        return author;
    }

    public void setAuthor(AuthorBean author) {
        this.author = author;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public int getStateValue() {
        return stateValue;
    }

    public void setStateValue(int stateValue) {
        this.stateValue = stateValue;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(int favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isNoise() {
        return noise;
    }

    public void setNoise(boolean noise) {
        this.noise = noise;
    }

    public boolean isPublicX() {
        return publicX;
    }

    public void setPublicX(boolean publicX) {
        this.publicX = publicX;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isHasLiked() {
        return hasLiked;
    }

    public void setHasLiked(boolean hasLiked) {
        this.hasLiked = hasLiked;
    }

    public boolean isHasFollowed() {
        return hasFollowed;
    }

    public void setHasFollowed(boolean hasFollowed) {
        this.hasFollowed = hasFollowed;
    }

    public boolean isHasBlack() {
        return hasBlack;
    }

    public void setHasBlack(boolean hasBlack) {
        this.hasBlack = hasBlack;
    }

    public boolean isHasMutualFollow() {
        return hasMutualFollow;
    }

    public void setHasMutualFollow(boolean hasMutualFollow) {
        this.hasMutualFollow = hasMutualFollow;
    }

    public int getRelation() {
        return relation;
    }

    public void setRelation(int relation) {
        this.relation = relation;
    }

    public List<?> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<?> achievements) {
        this.achievements = achievements;
    }

    public List<String> getContentType() {
        return contentType;
    }

    public void setContentType(List<String> contentType) {
        this.contentType = contentType;
    }

    public List<?> getGeo() {
        return geo;
    }

    public void setGeo(List<?> geo) {
        this.geo = geo;
    }

    public static class AuthorBean {
        private String _id;
        private String id;
        private String created;
        private String username;
        private String avatar;
        private String gender;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }

    public static class MetaBean {
        private String name;
        private int count;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
}
