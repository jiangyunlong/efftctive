package com.jyl.efftctive.object.privateConstruct;

/**
 * 用私有构造器或者枚举类型强化Singleton属性
 * @author Long
 * @date 2017年12月26日下午5:15:50
 */
public class Elvis2 {

	public static final Elvis2 INSTANCE = new Elvis2();
	
	private Elvis2(){
		
	}
	
	public void leaveTheBuilding(){
		System.out.println("xxx");
	}
}
