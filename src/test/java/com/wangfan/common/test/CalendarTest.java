package com.wangfan.common.test;

import com.wangfan.common.utils.CalendarUtils;

public class CalendarTest {
	public static void main(String[] args) {
		//调用
		CalendarUtils calend=new CalendarUtils();
		//测试第一天  0为本月，每加一代表在本月的基础上往后推一个月，每减一代表在本月的基础上往前推一个月
		System.out.println(calend.diyi(0, CalendarUtils.HTEAM_1));
		//测试最后一天  0为本月，每加一代表在本月的基础上往后推一个月，每减一代表在本月的基础上往前推一个月
		System.out.println(calend.zuihou(0, CalendarUtils.HTEAM_1));
	}
}
