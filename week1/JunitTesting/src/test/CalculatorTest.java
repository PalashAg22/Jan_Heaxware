package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.Calculator;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator c = new Calculator();
		int act = c.add(5, 5);
		assertEquals(10,act);
	}

	@Test
	void testMinus() {
		Calculator c = new Calculator();
		int act = c.minus(10, 4);
		assertEquals(6,act);
	}
	@Test
	void testMul() {
		Calculator c = new Calculator();
		int act = c.mul(5, 5);
		assertEquals(25,act);
	}
	@Test
	void testDiv() {
		Calculator c = new Calculator();
		double act = c.div(12,3);
		assertEquals(4.0, act, 0.1);
	}

}
