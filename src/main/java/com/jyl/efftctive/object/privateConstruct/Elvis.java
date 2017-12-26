package com.jyl.efftctive.object.privateConstruct;

/**
 * 用私有构造器或者枚举类型强化Singleton属性
 * @author Long
 * @date 2017年12月26日下午5:15:50
 */
public class Elvis {

	private static final Elvis INSTANCE = new Elvis();
	
	private Elvis(){
		
	}
	
	public static Elvis getInstance(){
		return INSTANCE;
	}
	
	public void leaveTheBuilding(){
		System.out.println("xxx");
	}
}
