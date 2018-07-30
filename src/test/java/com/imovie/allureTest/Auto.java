package com.imovie.allureTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class Auto {

	
	
	@Test
	public void SuccessTest() {
		
		assertEquals(1, true);
	}
	
	@Test
	public void FailTest() {
		boolean result=1>2;
		
		assertEquals(result, true);
	}
	
	@Test
	public void Post() {
		
		assertFalse(true);
	}
	
	@Test
	public void Post2() {
		
		assertFalse(false);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
