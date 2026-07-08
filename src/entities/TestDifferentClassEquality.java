package entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestDifferentClassEquality {
	@Test
	public void testDifferentClassEquality() {
		assertTrue(new Money(10, "CHF").equals(Money.franc(10)));
	}
}
