package com.yangkai.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
	
	/**
	 * 
	 * @Title: random 
	 * @Description://方法1：返回min-max之间的随机整数（包含min和max值），
	 * 例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	 * @param min
	 * @param max
	 * @return
	 * @return: int
	 */
	public static int random(int min, int max){
		//实例化随机数类
		Random r=new Random();
		//nextInt返回的是一个小于max的随机整数,例如max=10,则返回0-9
		return r.nextInt(max-min+1)+min;
	}
	
	
	/**
	 * 
	 * @Title: subRandom 
	 * @Description: 在最小值min与最大值max之间截取subs个不重复的随机数。
	 * 例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。
	 * 应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	 * @param min
	 * @param max
	 * @param subs
	 * @return
	 * @return: int[]
	 */
	public static int[] subRandom (int min, int max, int subs){
		//定义数组
		int [] arr=new int[subs];
		//定义set集合用来存储不重复的数据
		Set<Integer> set=new HashSet();
		//如果集合里面的数字总数不等于定义数组里面的数就添加,否则跳出循环
		while(set.size()!=subs) {
			set.add(random(min, max));
		}
		//添加以后把set集合中的数字放入数组中
		int j=0;
		for (Integer in : set) {
			arr[j]=in;
			j++;
		}
		return arr;
	}
	
	
	/**
	 * 
	 * @Title: randomCharacter 
	 * @Description: 返回1个1-9,a-Z之间的随机字符。 (8分)
	 * @return
	 * @return: char
	 */
	public static char randomCharacter (){
		//穷举出所有可能出现的情况给
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		//charAt(index) 根据下标返回字符串的值
		//随机数下标从0开始到str.length()-1的长度根据下标随机抽取字符
		return str.charAt(random(0, str.length()-1));
	}
	
	
	
	/**
	 * 
	 * @Title: randomString 
	 * @Description:返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	 * @param length
	 * @return
	 * @return: String
	 */
	public static String randomString(int length){
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < length; i++) {
			//append 将boolean参数的字符串表示附加到序列中。 
			sb.append(randomCharacter());
		}
		return sb.toString();
		}
	
	
	
	
}
