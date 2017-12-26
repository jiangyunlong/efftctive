package com.jyl.efftctive.staticFactory;

import java.math.BigInteger;

/**
 * 静态工厂方法代替构造器
 * @author Long
 * @date 2017年12月18日上午10:18:10
 */
public class StaticFactory {
	
	public static void main(String[] args) {
		
		//普通构造方法
		System.out.println(new Animal());
		
		// 1、有方法名称，可以确切知道意图
		System.out.println(Animal.getByStr("bird"));
		
		// 2、可以避免创建一个新对象
		System.out.println(BigInteger.valueOf(100l));
		
		// 3、可以返回原返回类型的任何子类型的对象
		System.out.println(Animal.getPeople());
		
		// 4、创建参数化实例的时候，可以使代码简洁
		System.out.println(new MyMap<String, String, String>());
	}

}
