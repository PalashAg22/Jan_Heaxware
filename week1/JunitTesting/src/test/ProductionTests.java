package test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("test")
@IncludeTags("Development")
public class ProductionTests {

	@Test
	@Tag("Development")
	public void testProd() {
		System.out.println("prod() test mthd call");
	}
}
