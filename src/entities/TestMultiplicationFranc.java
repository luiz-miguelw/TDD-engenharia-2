package entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestMultiplicationFranc {
	@Test
	public void testFrancMultiplication() {
	   Money five = Money.franc(5);
	   assertEquals(Money.franc(10), five.times(2));
	   assertEquals(Money.franc(15), five.times(3));
	}
}
