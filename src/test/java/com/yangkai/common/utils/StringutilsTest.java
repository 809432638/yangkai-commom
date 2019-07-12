package com.yangkai.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringutilsTest {

	@Test
	public void testhasLength() {
		fail("Not yet implemented");
	}

	@Test
	public void testhasText() {
		fail("Not yet implemented");
	}
	
	
	/**
	 * 
	 * @Title: randomChineseString 
	 * @Description: 返回参数length个中文汉字字符串，
	 * 字符集必须在GB2312(相当于中文简体)范围内，例如“中呀被”(5分)
	 * @param length
	 * @return
	 * @return: String
	 */

	@Test
	public void testRandomChineseString() {
		String string = Stringutils.randomChineseString(10);
		System.out.println(string);
	}
	
	
	
	
	/**
	 * 
	 * @Title: generateChineseName 
	 * @Description:返回中文姓名，必须以真实姓开头，百家姓在“六、附百家姓”里，名使用1-2个随机汉字(8分)，内部调用randomChineseString()方法(3分)。返回示例：“刘呀被”、“欧阳及为”
	 * @return
	 * @return: String
	 */
	@Test
	public void testgenerateChineseName() {
		String name = Stringutils.generateChineseName();
		System.out.println(name);
	}
	
	

}
