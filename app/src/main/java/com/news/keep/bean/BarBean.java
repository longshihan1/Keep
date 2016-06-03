package com.news.keep.bean;

import java.util.List;

/**
 * @author Administrator
 * @time 2016/5/21 0021 下午 6:01
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class BarBean {

    /**
     * ok : true
     * data : [{"_id":"573e7f21cc0656c905df3f50","url":"keep://store_topic/14",
     * "photo":"http://static1.gotokeep.com/picture/2016/05/20/11/55330810eec00000.jpg",
     * "ipadPhoto":"http://static1.gotokeep.com/picture/2016/05/20/11/55330816fcc00000.jpg",
     * "title":"电商Bra","author":"549cd5697e7ed6ee5c94ba4b","modified":"2016-05-20T03:06:09.741Z",
     * "stateValue":20,"sort":5,"subtitle":"","__v":0},{"_id":"573eeb1ccc0656c905df4112",
     * "url":"keep://articles/573eea02cc0656c905df4110","photo":"http://static1.gotokeep
     * .com/picture/2016/05/20/18/5533716b5a400000.jpg","ipadPhoto":"http://static1.gotokeep
     * .com/picture/2016/05/20/18/5533716de6c00000.jpg","title":"香蕉",
     * "author":"55ac969edceb3b0fdf13bcfd","modified":"2016-05-20T10:46:52.862Z","stateValue":20,
     * "sort":4,"subtitle":"","__v":0},{"_id":"573c572c7dad26e77f070d4f",
     * "url":"keep://articles/573c50437dad26e77f070d4a","ipadPhoto":"http://static1.gotokeep
     * .com/picture/2016/05/18/19/5530ecff64c00000.jpg","photo":"http://static1.gotokeep
     * .com/picture/2016/05/18/19/5530ed03a4400000.jpg","title":"马甲线养成",
     * "author":"549cd5697e7ed6ee5c94ba4b","modified":"2016-05-18T11:51:08.883Z","stateValue":20,
     * "sort":3,"subtitle":"","__v":0},{"_id":"573c44577dad26e77f070d48",
     * "url":"keep://articles/573c2e687dad26e77f070d35","photo":"http://static1.gotokeep
     * .com/picture/2016/05/18/18/5530dc0a0f800000.jpg","ipadPhoto":"http://static1.gotokeep
     * .com/picture/2016/05/18/18/5530dc0ce7c00000.jpg","title":"不再畏惧阳光高空和深海，不设限的人生才是「真理」",
     * "author":"56178e241779a99315da9373","modified":"2016-05-18T10:36:33.809Z","stateValue":20,
     * "sort":2,"subtitle":"","__v":0},{"_id":"573db363b12cdda130257e0d",
     * "url":"keep://articles/573db0c2b12cdda130257e08","photo":"http://static1.gotokeep
     * .com/picture/2016/05/19/20/553240fe5ec00000.jpg","ipadPhoto":"http://static1.gotokeep
     * .com/picture/2016/05/19/20/553241024d400000.jpg","title":"CrossFit",
     * "author":"549cd5697e7ed6ee5c94ba4b","modified":"2016-05-19T12:36:51.222Z","stateValue":20,
     * "sort":1,"subtitle":"","__v":0}]
     * errorCode : 0
     * now : 2016-05-21T09:27:06.684Z
     * version : 1.0.0
     */

    private boolean ok;
    private int errorCode;
    private String now;
    private String version;
    /**
     * _id : 573e7f21cc0656c905df3f50
     * url : keep://store_topic/14
     * photo : http://static1.gotokeep.com/picture/2016/05/20/11/55330810eec00000.jpg
     * ipadPhoto : http://static1.gotokeep.com/picture/2016/05/20/11/55330816fcc00000.jpg
     * title : 电商Bra
     * author : 549cd5697e7ed6ee5c94ba4b
     * modified : 2016-05-20T03:06:09.741Z
     * stateValue : 20
     * sort : 5
     * subtitle :
     * __v : 0
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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String _id;
        private String url;
        private String photo;
        private String ipadPhoto;
        private String title;
        private String author;
        private String modified;
        private int stateValue;
        private int sort;
        private String subtitle;
        private int __v;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public String getIpadPhoto() {
            return ipadPhoto;
        }

        public void setIpadPhoto(String ipadPhoto) {
            this.ipadPhoto = ipadPhoto;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
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

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public int get__v() {
            return __v;
        }

        public void set__v(int __v) {
            this.__v = __v;
        }
    }
}
