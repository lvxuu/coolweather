package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by ${lvx} on 2017/5/5.
 * com.example.coolweather.util
 * CoolWeather
 * 与服务器进行交互代码。发起一条http请求--调用sendOkHttpRequest()方法--传入请求地址并注册一个回调
 * 来处理服务器响应
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
