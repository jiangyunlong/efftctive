package com.jyl.efftctive.staticFactory;

/**
 * @TODO
 * @author Long
 * @date 2017年12月26日下午4:41:30
 */
public class MyMap<K, V, S> {

	public static <K, V, S> MyMap<K, V, S> newInstance(){
		return new MyMap<K, V, S>();
	}
}
