package test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

import currency.Dollar;


public class MultiCurrencyMoneyTest {
	
	/**
	 * Chapter 1. Multi-Currency Money
	 * Test Case
	 */
//	@Test
//	public void testMultiplicationCH1() {
//		Dollar five= new Dollar(5);
//		five.times(2);
//		assertEquals(10, five.amount);
//	}
	
	/**
	 * Chapter 2. Degenerate Objects
	 * Test Case
	 */	
	@Test
	public void testMultiplicationCH2() {
		Dollar five= new Dollar(5);
		Dollar product= five.times(2);
		assertEquals(10, product.amount);
		product= five.times(3);
		assertEquals(15, product.amount);
	}
	
	/**
	 * Chapter 3. Equality for All
	 * Test Case
	 */
	@Test
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
	
}

