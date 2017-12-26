package com.jyl.efftctive.object.builder;

/**
 * @TODO
 * @author Long
 * @date 2017年12月26日下午5:04:41
 */
public class Test {

	public static void main(String[] args) {
		NutritionFacts n = new NutritionFacts.Builder(12, 48).calories(123).fat(56).build();
		System.out.println(n.toString());
	}
}
