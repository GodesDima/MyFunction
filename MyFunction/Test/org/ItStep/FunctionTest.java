package org.ItStep;

import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionTest {
	
	@Test
	public void MyFunction () {
		MyFunction myFirstTest = new MyFunction();
		int runTest = myFirstTest.getMyFunction(6);
		assertEquals(72, runTest);
	}
	@Test
	public void getFactorial() {
		MyFunction myFirstTest = new MyFunction();
		int runTest = myFirstTest.getFactorial(2);
		assertEquals(2, runTest);
	}
	
	 
	
	}

