package com.wangfan.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.text.SimpleAttributeSet;

public class CalendarUtils {
	//创建时间格式
	public static final String HTEAM_1="yyyy-MM-dd";
	//显示本月第一天
	public static String diyi(int i,String shijian){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, i);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		return new SimpleDateFormat(shijian).format(calendar.getTime());
	}
	//显示本月最后一天
	public static String zuihou(int i,String shijian){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, i+1);
		calendar.set(Calendar.DAY_OF_MONTH, 0);
		return new SimpleDateFormat(shijian).format(calendar.getTime());
	}
}
