package com.jyl.efftctive.object.staticFactory;

/**
 * @TODO
 * @author Long
 * @date 2017年12月26日下午4:09:31
 */
public class Animal {
	
	String type = "default";
	
	public Animal(){
		
	}
	
	public Animal(String str){
		this.type = str;
	}
	
	public static Animal getByStr(String str){
		
		return new Animal(str);
	}
	
	public static People getPeople(){
		return new People("people");
	}

	@Override
	public String toString() {
		return type.toString();
	}

}
