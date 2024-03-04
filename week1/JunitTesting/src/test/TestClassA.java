package test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestClassA {

	@Test
	@Tag("Development")
	@Tag("Production")
	public void testA() {
		System.out.println("TestA() is called");
	}
}
