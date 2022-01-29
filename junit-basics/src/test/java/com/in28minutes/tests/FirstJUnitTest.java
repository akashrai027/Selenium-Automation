package com.in28minutes.tests;

import static org.junit.Assert.*;

import org.junit.Test;

class SimpleClass {
	public int sum(int[] numbers) {
		int sum = 0;
		
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		
		return sum;
	}
}

public class FirstJUnitTest {

	@Test
	public void test() {
		
		SimpleClass simpleClass = new SimpleClass();
		
		int actualResult = simpleClass.sum( new int[] {12, 15, 18});
		
		int expectedResult = 45;
		System.out.println("Executed test");

		assertEquals(expectedResult, actualResult);
		

	}

	@Test
	public void testFor0Elements() {
		
		SimpleClass simpleClass = new SimpleClass();
		
		int actualResult = simpleClass.sum( new int[] {});
		
		int expectedResult = 0;
		System.out.println("Executed testfor0elements");

		assertEquals(expectedResult, actualResult);
		

	}

	@Test
	public void testFor2Elements() {
		
		SimpleClass simpleClass = new SimpleClass();
		
		int actualResult = simpleClass.sum( new int[] {12, 15});
		
		int expectedResult = 27;
		System.out.println("Executed testfor2elements");

		assertEquals(expectedResult, actualResult);
		

	}

	@Test
	public void testFor5Elements() {
		
		SimpleClass simpleClass = new SimpleClass();
		
		int actualResult = simpleClass.sum( new int[] {2, 6, 8, 15, 18});
		
		int expectedResult = 49;
		System.out.println("Executed testfor5elements");
		assertEquals(expectedResult, actualResult);

	}

}
