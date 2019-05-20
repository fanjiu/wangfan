package com.wangfan.common.utils;

public class FileUtil {
	//系统临时目录
	public static String xitong(){
		String path = System.getProperty("java.io.tmpdir");
		return path;
	}
	//创建目录
	public static String yonghu(){
		String path = System.getProperty("user.dir");
		return path;
	}
	//系统用户目录
	public static String mulu(){
		String path = System.getProperty("user.home");
		return path;
	}
	//具体路径
	public static String lujing(){
		String path = System.getProperty("java.class.path");
		return path;
	}
}
