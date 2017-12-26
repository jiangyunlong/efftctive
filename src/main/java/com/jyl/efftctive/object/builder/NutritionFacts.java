package com.jyl.efftctive.object.builder;

/**
 * 多个构造器参数时考虑用构建器
 * @author Long
 * @date 2017年12月26日下午4:53:28
 */
public class NutritionFacts {
	
	private int servingSize;
	private int servings;
	private int calories;
	private int fat;
	private int sodium;
	private int carbohydrate;
	
	public static class Builder {
		
		private final int servingSize;
		private final int servings;
		
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;
		
		public Builder(int servingSize, int servings){
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val){
			calories = val;
			return this;
		}
		
		public Builder fat(int val){
			fat = val;
			return this;
		}
		
		public Builder sodium(int val){
			sodium = val;
			return this;
		}
		
		public Builder carbohydrate(int val){
			carbohydrate = val;
			return this;
		}
		
		public NutritionFacts build(){
			return new NutritionFacts(this);
		}
		
	}
	
	private NutritionFacts(Builder builder){
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "servingSize=" + servingSize + ", servings=" + servings + 
				", calories=" + calories + ", fat=" + fat + ", sodium=" + 
				sodium + ", carbohydrate=" + carbohydrate;
	}
}
