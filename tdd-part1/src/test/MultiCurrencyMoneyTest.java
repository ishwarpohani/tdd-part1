package test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

import currency.Money;


public class MultiCurrencyMoneyTest {
	
	/** Chapter 8. Makin' Objects (Test Case) */
	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}
	/** Chapter 8. Makin' Objects (Test Case) */
	@Test
	public void testFrancMultiplication() {
		Money five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}
	
	/** Chapter 9. Times We're Livin' In (Test Case) */
	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	
	/** Chapter 11. The Root of All Evil (Test Case) */
	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	
	
//	/** Chapter 1. Multi-Currency Money (Test Case) */
//	@Test
//	public void testMultiplicationCH1() {
//		Dollar five= new Dollar(5);
//		five.times(2);
//		assertEquals(10, five.amount);
//	}
	
//	/** Chapter 2. Degenerate Objects (Test Case) */	
//	@Test
//	public void testMultiplicationCH2() {
//		Dollar five= new Dollar(5);
//		Dollar product= five.times(2);
//		assertEquals(10, product.amount);
//		product= five.times(3);
//		assertEquals(15, product.amount);
//	}

//	/** Chapter 3. Equality for All (Test Case) */
//	@Test
//	public void testEqualityCH3() {
//		assertTrue(new Dollar(5).equals(new Dollar(5)));
//		assertFalse(new Dollar(5).equals(new Dollar(6)));
//	}
//	
//	/** Chapter 4. Privacy (Test Case) */
//	@Test
//	public void testMultiplicationCH4() {
//		Dollar five= new Dollar(5);
//		assertEquals(new Dollar(10), five.times(2));
//		assertEquals(new Dollar(15), five.times(3));
//	}
//	
//	/** Chapter 5. Franc-ly Speaking (Test Case) */
//	@Test
//	public void testFrancMultiplicationCH5() {
//		Franc five= new Franc(5);
//		assertEquals(new Franc(10), five.times(2));
//		assertEquals(new Franc(15), five.times(3));
//	}
	
//	/** Chapter 6. Equality for All, Redux (Test Case) */
//	@Test
//	public void testEqualityCH6() {
//		assertTrue(new Dollar(5).equals(new Dollar(5)));
//		assertFalse(new Dollar(5).equals(new Dollar(6)));
//		assertTrue(new Franc(5).equals(new Franc(5)));
//		assertFalse(new Franc(5).equals(new Franc(6)));
//	}
//	
//	/** Chapter 7. Apples and Oranges (Test Case) */
//	@Test
//	public void testEqualityCH7() {
//		assertTrue(new Dollar(5).equals(new Dollar(5)));
//		assertFalse(new Dollar(5).equals(new Dollar(6)));
//		assertTrue(new Franc(5).equals(new Franc(5)));
//		assertFalse(new Franc(5).equals(new Franc(6)));
//		assertFalse(new Franc(5).equals(new Dollar(5)));
//	}

//	/** Chapter 8. Makin' Objects (Test Case) */
//	@Test
//	public void testEqualityCH8() {
//		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
//		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
//		assertTrue(Money.franc(5).equals(Money.franc(5)));
//		assertFalse(Money.franc(5).equals(Money.franc(6)));
//		assertFalse(Money.franc(5).equals(Money.dollar(5)));
//	}

	
}

