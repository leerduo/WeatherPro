package com.dy.ustc.weatherpro.test;

import java.util.List;

import com.dy.ustc.weatherpro.db.CoolWeatherDB;
import com.dy.ustc.weatherpro.db.CoolWeatherOpenHelper;
import com.dy.ustc.weatherpro.model.Province;

import android.test.AndroidTestCase;

public class TestDBCase extends AndroidTestCase {
	
	/**
	 * 数据库名
	 */
	public static final String DB_NAME = "cool_weather";

	/**
	 * 数据库版本
	 */
	public static final int VERSION = 1;
	/**
	 * 测试创建数据库
	 * 
	 */
	public void testDB(){
		CoolWeatherOpenHelper helper = new CoolWeatherOpenHelper(getContext(), DB_NAME, null, VERSION);
		helper.getWritableDatabase();
	}
	
	public void saveProvince(){
		CoolWeatherDB db = CoolWeatherDB.getInstance(getContext());
		Province province = new Province();
		province.setProvinceName("安徽");
		province.setProvinceName("四川");
		province.setProvinceCode("22");
		province.setProvinceCode("27");
		db.saveProvince(province);
	}
	
	public void loadProvinces(){
		CoolWeatherDB db = CoolWeatherDB.getInstance(getContext());
		List<Province> provinces = db.loadProvinces();
		for (Province province : provinces) {
			System.out.println(province.toString());
		}
	}

}
