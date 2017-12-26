package com.jyl.efftctive.object.privateConstruct;

/**
 * @TODO
 * @author Long
 * @date 2017年12月26日下午5:22:36
 */
public class Test {
	
	public static void main(String[] args) {
		
		Elvis e = Elvis.getInstance();
		e.leaveTheBuilding();
		
		Elvis2 e2 = Elvis2.INSTANCE;
		e2.leaveTheBuilding();
		
		ElvisEnum.INSTANCE.leaveTheBuilding();
	}
	

}
