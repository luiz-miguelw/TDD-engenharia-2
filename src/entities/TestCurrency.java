package entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCurrency {
	@Test
	public void testCurrency() {
	   assertEquals("USD", Money.dollar(1).getCurrency());
	   assertEquals("CHF", Money.franc(1).getCurrency());
	}
}
