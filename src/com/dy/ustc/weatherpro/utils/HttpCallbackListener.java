package com.dy.ustc.weatherpro.utils;

public interface HttpCallbackListener {

	void onFinish(String response);

	void onError(Exception e);

}
