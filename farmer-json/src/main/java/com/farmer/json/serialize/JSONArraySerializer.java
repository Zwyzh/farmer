package com.farmer.json.serialize;

import com.farmer.json.JSONArray;

/**
 * JSON列表的序列化接口，用于将特定对象序列化为{@link JSONArray}
 * 
 * @param <V> 对象类型
 * 
 * @author Looly
 */
public interface JSONArraySerializer<V> extends JSONSerializer<JSONArray, V>{}
