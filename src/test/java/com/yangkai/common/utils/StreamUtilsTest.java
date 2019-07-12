package com.yangkai.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class StreamUtilsTest {

	@Test
	public void testCloseAll() {
		fail("Not yet implemented");
	}

	
	
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	*/
	@Test
	public void testReadTextFileInputStream() throws IOException {
		   FileInputStream inputStream = new FileInputStream(new File("D:/yxy.txt"));
		   String string = StreamUtils.readTextFile(inputStream);
		   System.out.println(string);
	}

	
	
	/*
	* 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	@Test
	public void testReadTextFileFile() throws FileNotFoundException, IOException {
		String string = StreamUtils.readTextFile(new File("d:/yxy.txt"));
		System.out.println(string);
	}

}
