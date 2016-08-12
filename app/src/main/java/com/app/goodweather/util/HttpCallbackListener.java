package com.app.goodweather.util;

/**
 * Created by Administrator on 2016/8/11 0011.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
