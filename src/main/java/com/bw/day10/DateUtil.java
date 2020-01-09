package com.bw.day10;

import java.util.Date;


public class DateUtil {
	
	//根据传入的日期获取年龄
	public static int getAge (Date src) {
		Date date = new Date();
		System.out.println(date);
		return 0;
		
	}
	
	//根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	public static Date getDateByMonthInit (Date src) {
		String str = "2019-09-19 19:29:39";
		Date date = new Date();
		return date;
	}
	
	/**
	 * 根据传入的参数获取该日器的月末日期，'
	 * 例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	 */
	public static Date getDateByMonthLast(Date src) {
		boolean b = src.after(src);
		String str = "2019-09-19 19:29:39";
		Date date = new Date();
		return date;
	}
	
	/**
	 * 求未来日期离今天还剩的天数
	 * 
	 */
	public static int getDaysByFuture (Date future) {
		Date date = new Date();
		System.out.println(date);
		return 0;
	}
	/**
	 * 求过去日期离今天过去的天数
	 */
	public static int getDaysByDeparted (Date departed) {
		Date date = new Date();
		int i = date.compareTo(date);
		return i;
	}
}
