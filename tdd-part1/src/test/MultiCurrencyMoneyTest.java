package test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

import currency.Dollar;
import currency.Franc;


public class MultiCurrencyMoneyTest {
	
	/** Chapter 1. Multi-Currency Money (Test Case) */
//	@Test
//	public void testMultiplicationCH1() {
//		Dollar five= new Dollar(5);
//		five.times(2);
//		assertEquals(10, five.amount);
//	}
	
	/** Chapter 2. Degenerate Objects (Test Case) */	
//	@Test
//	public void testMultiplicationCH2() {
//		Dollar five= new Dollar(5);
//		Dollar product= five.times(2);
//		assertEquals(10, product.amount);
//		product= five.times(3);
//		assertEquals(15, product.amount);
//	}
	
	/** Chapter 3. Equality for All (Test Case) */
	@Test
	public void testEqualityCH3() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
	
	/** Chapter 4. Privacy (Test Case) */
	@Test
	public void testMultiplication() {
		Dollar five= new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}
	
	/** Chapter 5. Franc-ly Speaking (Test Case) */
	@Test
	public void testFrancMultiplication() {
		Franc five= new Franc(5);
		assertEquals(new Franc(10), five.times(2));
		assertEquals(new Franc(15), five.times(3));
	}
	
	/** Chapter 6. Equality for All, Redux (Test Case) */
	@Test
	public void testEqualityCH6() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
	}
	
	/** Chapter 7. Apples and Oranges (Test Case) */
	@Test
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
		assertFalse(new Franc(5).equals(new Dollar(5)));
	}
	
}

