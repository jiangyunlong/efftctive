package com.jyl.efftctive.object.privateConstruct;

/**
 * 编写一个包含单个元素的枚举类型
 * @author Long
 * @date 2017年12月26日下午5:20:47
 * @since jdk1.5
 */
public enum ElvisEnum {

	INSTANCE;
	
	public void leaveTheBuilding(){
		System.out.println("xxx");
	}
}
