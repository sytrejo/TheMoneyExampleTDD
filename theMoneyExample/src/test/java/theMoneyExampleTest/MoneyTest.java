package theMoneyExampleTest;

import static org.junit.Assert.*;

import org.junit.*;

import theMoneyExample.Dollar;
import theMoneyExample.Franc;
import theMoneyExample.Money;

public class MoneyTest {
	
	@Test
	public void testDollarMultiplication() {
		Money five = Money.dollar(5);
	
		assertEquals(Money.dollar(10),five.times(2));
		assertEquals(Money.dollar(15),five.times(3));
	}
	
	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
		assertFalse(new Franc(5).equals(Money.dollar(5)));
		
	}
	
	@Test
	public void testFrancMultiplication() {
		Franc five = new Franc(5);
	
		assertEquals(new Franc(10),five.times(2));
		assertEquals(new Franc(15),five.times(3));
	}
	

}
