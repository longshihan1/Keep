package com.news.keep.bean;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/7.
 * 项目名称：Keep
 * 类描述：序列化map供Bundle传递map使用
 * 创建人：Administrator
 * 创建时间：2016/4/7 10:04
 * 修改人：Administrator
 * 修改时间：2016/4/7 10:04
 * 修改备注：
 */
public class SerializableMap implements Serializable {

    private Map<String, Object> map;

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
