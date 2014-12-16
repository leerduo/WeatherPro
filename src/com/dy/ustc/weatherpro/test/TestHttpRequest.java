package com.dy.ustc.weatherpro.test;

import com.dy.ustc.weatherpro.utils.HttpCallbackListener;
import com.dy.ustc.weatherpro.utils.HttpUtil;

import android.test.AndroidTestCase;
import android.util.Log;

public class TestHttpRequest extends AndroidTestCase {
	
	protected static final String TAG = "TestHttpRequest";

	public void testHttpRequest(){
		String address = "http://www.weather.com.cn/data/cityinfo/101270101.html";
		HttpUtil.sendHttpRequest(address, new HttpCallbackListener() {
			
			@Override
			public void onFinish(String response) {
				Log.i(TAG, response.toString());
				
			}
			
			@Override
			public void onError(Exception e) {
				
				System.out.println(e.getMessage() + "哈哈，解析错误");
				Log.i(TAG, e.getMessage() + "哈哈，解析错误");
			}
		});
		
		
	}
	

}
