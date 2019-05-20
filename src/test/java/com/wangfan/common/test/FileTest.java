package com.wangfan.common.test;

import org.junit.Test;

import com.wangfan.common.utils.FileUtil;

public class FileTest {
	@Test
	public void test(){
		//系统临时目录
		String path1 = FileUtil.xitong();
		System.out.println(path1);
		//创建目录
		String path2 = FileUtil.yonghu();
		System.out.println(path2);
		//系统用户目录
		String path3 = FileUtil.mulu();
		System.out.println(path3);
		//具体路径
		String path4 = FileUtil.lujing();
		System.out.println(path4);
	}
}
