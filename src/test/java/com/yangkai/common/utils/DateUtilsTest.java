package com.yangkai.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.yangkai.common.pojo.Person;

public class DateUtilsTest {

	
	
	/**
	 * 将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，
	 * 将上面{2}的位置使用DateUtil
	 * 工具类中的getDateByFullMonth()返回值替换。最后打印出正确拼接的SQL字符串
	 * @Title: test1 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void test1() {
		
	    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	    String startDate = df.format(DateUtils.getDateByInitMonth(new Date()));
	    String endtDate = df.format(DateUtils.getDateByFullMonth(new Date()));
	    
	    
		String sql = "select * from t_order where create_time>='{1}'"
				+ " and create_time<='{2}' ";
		
		String sql1 = sql.replace("{1}", startDate);
		String sql2 = sql1.replace("{2}", endtDate);
		
		System.out.println(sql2);
	}
	
	
	
	/**
	 * @Title: randomDate 
	 * @Description: 返回在某个日期区间的随机日期
	 * @param startDate
	 * @return
	 * @return: Date
	 */
	@Test
	public void test() {
		Calendar c = Calendar.getInstance();
		c.set(2010,0,1);
		
		for (int i = 0; i < 10000; i++) {
			Person p=new Person(Stringutils.generateChineseName(), 
					RandomUtil.random(1, 120), Stringutils.randomChineseString(120),
					DateUtils.randomDate(c.getTime()));	
			System.out.println(p);
		}
	}

	
	
	
	//测试返回在某个日期区间的随机日期
	@Test
	public void testrandomDate() {
		Calendar c = Calendar.getInstance();
		c.set(2010,0,1);
	    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	    for (int i = 0; i < 10; i++) {
	    	Date date = DateUtils.randomDate(c.getTime());
	    	System.out.println(date);
		}
	}
	
	
	/*
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。
	* 例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	@Test
	public void testgetDateByInitMonth() {

		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd : HH:mm:ss");
		Date date = DateUtils.getDateByInitMonth(new Date());
		String string = df.format(date);
		System.out.println(string);
		
	
	}
	 
	
	/*
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/

	@Test
	public void testgetDateByFullMonth() {

		 Calendar c = Calendar.getInstance();
			c.set(Calendar.MONTH,0);
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			Date date = DateUtils.getDateByFullMonth(c.getTime());
			System.out.println(df.format(date));
	}
	
}
