package com.baidu.test;

import java.lang.reflect.Field;


public class Test {

	public static void main(String[] args) {
		Integer a = 1;
		Integer b = 2;
		System.out.println("before swap : a = " + a + ",b = " + b);
		swap(a, b);
		System.out.println("after swap : a = " + a + ",b = " + b);
	}

	private static void swap(Integer num1, Integer num2) {
		/*
		 * Integer tmp = num1; num1 = num2; num2 = tmp;
		 */
		try {
			Field field = Integer.class.getDeclaredField("value");
			field.setAccessible(true);
			int tmp = num1.intValue();
			field.set(num1, num2);
			field.set(num2, new Integer(tmp));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
