package com.yangkai.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	/**
	 * 
	 * @Title: testrandom 
	 * @Description:：返回min-max之间的随机整数（包含min和max值），
	 * 例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对
	 * @return: void
	 */
	@Test
	public void testrandom() {
		for (int i = 0; i <3; i++) {
			System.out.println(RandomUtil.random(1,5));
		}
	}


	
	
	/**
	 * 
	 * @Title: testrandom 
	 * @Description: 在最小值min与最大值max之间截取subs个不重复的随机数。
	 * 例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。
	 * 应用场景：在100篇文章中随机取10篇文章，月考可能会使用到
	 * @return: void
	 */
	@Test
	public void testsubRandom() {
		int[] is = RandomUtil.subRandom(1, 10, 3);
		for (int i : is) {
			System.out.println(i);
		}
	}
	
	
	
	/**
	 * 
	 * @Title: testsubRandom 
	 * @Description: 返回1个1-9,a-Z之间的随机字符。 (8分)
	 * @return: void
	 */
	@Test
	public void testrandomCharacter() {
	   for (int i = 0; i < 5; i++) {
		   System.out.println(RandomUtil.randomCharacter());
	}
	}

	
	
	/**
	 * 
	 * @Title: randomString 
	 * @Description:返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	 * @param length
	 * @return
	 * @return: String
	 */
	@Test
	public void testrandomString() {
	   for (int i = 0; i < 3; i++) {
		   System.out.println(RandomUtil.randomString(4));
	}
	}
}
