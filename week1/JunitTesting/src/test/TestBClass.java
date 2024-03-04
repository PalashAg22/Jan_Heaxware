package test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestBClass {

	@Test
	@Tag("Development")
	public void testB() {
		System.out.println("TestB() is called");
	}

}
