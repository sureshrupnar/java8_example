package com.suresh.example;

import java.util.function.BiConsumer;

/**
 * @author sureshrupnar
 *
 */
public class LambdaDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LambdaDemo lambdaDemo = new LambdaDemo();
		lambdaDemo.add(10, 5);
		
		BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
		biConsumer.accept(10, 5);
	}
	
	public void add(Integer a, Integer b) {
		System.out.println(a + b);
	}

}
