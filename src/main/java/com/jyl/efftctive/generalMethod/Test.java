package com.jyl.efftctive.generalMethod;

import java.util.Calendar;
import java.util.Date;

/**
 * @TODO
 * @author Long
 * @date 2017年12月26日下午5:58:46
 */
public class Test {
	
	public static void main(String[] args) {
		
		Date today = new Date();
		Calendar c = Calendar.getInstance();
        c.setTime(today);
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天
        Date tomorrow = c.getTime();
        
		Demo demo1 = new Demo(1L, "xxx", "sss", today);
		Demo demo2 = new Demo(1L, "xxx", "sss", tomorrow);
		
		System.out.println(demo1.equals(demo2));
		
		System.out.println(demo1.toString());
		
		System.out.println(demo1.hashCode());
		System.out.println(demo2.hashCode());
		
		Demo demo3 = new Demo();
		Demo demo4 = new Demo();
		System.out.println(demo3.equals(demo4));
	}

}
