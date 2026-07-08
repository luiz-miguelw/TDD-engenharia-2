package entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestMultiplicationDollar {
    @Test
    public void testMultiplication() {
	   Dollar five = new Dollar(5);
	   assertEquals(new Dollar(10), five.times(2));
	   assertEquals(new Dollar(15), five.times(3));
	}
}