package com.yangkai.common.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileUtilsTest {

	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	*/
	@Test
	public void testGetExtendName() {
		String name = FileUtils.getExtendName("aaa.jsp");
		System.out.println(name);
	}

	
	/*
	* 方法2：返回操作系统临时目录(5分)
	*/
	@Test
	public void testGetTempDirectory() {
		File file = FileUtils.getTempDirectory();
		System.out.println(file);
	}

	
	/*
	* 方法3：返回操作系统用户目录(5分)
	* 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
	*/
	@Test
	public void testGetUserDirectory() {
		File file = FileUtils.getUserDirectory();
		System.out.println(file);

	}

}
