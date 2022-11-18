package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitTestFunctions junit = new jUnitTestFunctions();
		int result = junit.addNumbers(69, 420);
		assertEquals(489, result);
	}

}
