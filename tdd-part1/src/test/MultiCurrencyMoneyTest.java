package test;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

import currency.Dollar;


public class MultiCurrencyMoneyTest {
	
	/**
	 * Chapter 1 Test Case
	 */
//	@Test
//	public void testMultiplicationCH1() {
//		Dollar five= new Dollar(5);
//		five.times(2);
//		assertEquals(10, five.amount);
//	}
	
	/**
	 * Chapter 2 Test Case
	 */	
	@Test
	public void testMultiplicationCH2() {
		Dollar five= new Dollar(5);
		Dollar product= five.times(2);
		assertEquals(10, product.amount);
		product= five.times(3);
		assertEquals(15, product.amount);
	}
	
}

