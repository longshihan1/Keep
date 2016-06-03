package com.news.keep.bean;

import java.util.List;

/**
 * @author Administrator
 * @time 2016/4/21 0021 下午 10:15
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class Find_list_displayBean {


    /**
     * ok : true
     * data : [{"_id":"5715a683950f56215c473118","name":"封面Keepers","photo":"http://static1
     * .gotokeep.com/Ft8dt_qqJKHWScheVIuTwml7W8D3","state":"pin",
     * "user":{"_id":"549cd5697e7ed6ee5c94ba4b","id":"549cd5697e7ed6ee5c94ba4b",
     * "created":"2014-12-26T03:26:33.000Z","username":"Keep_技术分享","avatar":"http://static1
     * .gotokeep.com/avatar/2016/00/04/15/f32e979b6e5c6432743b66366ab3e0c790a68f66.jpg"},
     * "created":"2016-04-19T03:31:15.322Z","updated":"2016-04-19T07:18:01.259Z","__v":0,
     * "description":"封面 Keeper 是怎样炼成的！","count":21},{"_id":"5715b5f1950f56215c473258",
     * "name":"小白入门必读","description":"健身先健脑，看完这些再开练！","photo":"http://static1.gotokeep
     * .com/FlRih2tA2VxYmaYaZYpihjp1h7Ke","state":"pin","user":{"_id":"56178e241779a99315da9373",
     * "id":"56178e241779a99315da9373","created":"2015-10-09T09:51:32.000Z","username":"Keep_精选",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2016/00/04/15/1d5cd58f31196bc4690f031ed469613149eb8196.jpg"},
     * "created":"2016-04-19T04:37:05.073Z","updated":"2016-04-19T07:20:36.326Z","__v":0,
     * "count":11},{"_id":"5715cca1950f56215c47356e","name":"健身餐也可以很美味","description":"要健康也要美味",
     * "photo":"http://static1.gotokeep.com/Fr_mHUO-x4JjzmQq8uTB-rQ0Af86","state":"pin",
     * "user":{"_id":"56178e241779a99315da9373","id":"56178e241779a99315da9373",
     * "created":"2015-10-09T09:51:32.000Z","username":"Keep_精选","avatar":"http://static1
     * .gotokeep.com/avatar/2016/00/04/15/1d5cd58f31196bc4690f031ed469613149eb8196.jpg"},
     * "created":"2016-04-19T06:13:53.808Z","updated":"2016-04-19T06:59:27.697Z","__v":0,
     * "count":13},{"_id":"5715dcca950f56215c47360a","name":"减脂大作战",
     * "description":"夏天马上就到啦，让我们吹响减肥的号角！","photo":"http://static1.gotokeep
     * .com/Fnrtf-aDbh81yggnu8ZhH2QoepuO","state":"pin","user":{"_id":"56178e241779a99315da9373",
     * "id":"56178e241779a99315da9373","created":"2015-10-09T09:51:32.000Z","username":"Keep_精选",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2016/00/04/15/1d5cd58f31196bc4690f031ed469613149eb8196.jpg"},
     * "created":"2016-04-19T07:22:50.297Z","updated":"2016-04-19T11:12:03.297Z","__v":0,"count":8}]
     * errorCode : 0
     * now : 2016-04-21T14:03:12.806Z
     * version : 1.0.0
     * lastId : 5715dcca950f56215c47360a
     */

    private boolean ok;
    private int errorCode;
    private String now;
    private String version;
    private String lastId;
    /**
     * _id : 5715a683950f56215c473118
     * name : 封面Keepers
     * photo : http://static1.gotokeep.com/Ft8dt_qqJKHWScheVIuTwml7W8D3
     * state : pin
     * user : {"_id":"549cd5697e7ed6ee5c94ba4b","id":"549cd5697e7ed6ee5c94ba4b",
     * "created":"2014-12-26T03:26:33.000Z","username":"Keep_技术分享","avatar":"http://static1.gotokeep.com/avatar/2016/00/04/15/f32e979b6e5c6432743b66366ab3e0c790a68f66.jpg"}
     * created : 2016-04-19T03:31:15.322Z
     * updated : 2016-04-19T07:18:01.259Z
     * __v : 0
     * description : 封面 Keeper 是怎样炼成的！
     * count : 21
     */

    private List<DataBean> data;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getNow() {
        return now;
    }

    public void setNow(String now) {
        this.now = now;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLastId() {
        return lastId;
    }

    public void setLastId(String lastId) {
        this.lastId = lastId;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String _id;
        private String name;
        private String photo;
        private String state;
        /**
         * _id : 549cd5697e7ed6ee5c94ba4b
         * id : 549cd5697e7ed6ee5c94ba4b
         * created : 2014-12-26T03:26:33.000Z
         * username : Keep_技术分享
         * avatar : http://static1.gotokeep
         * .com/avatar/2016/00/04/15/f32e979b6e5c6432743b66366ab3e0c790a68f66.jpg
         */

        private UserBean user;
        private String created;
        private String updated;
        private int __v;
        private String description;
        private int count;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getUpdated() {
            return updated;
        }

        public void setUpdated(String updated) {
            this.updated = updated;
        }

        public int get__v() {
            return __v;
        }

        public void set__v(int __v) {
            this.__v = __v;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public static class UserBean {
            private String _id;
            private String id;
            private String created;
            private String username;
            private String avatar;

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
        }
    }
}
