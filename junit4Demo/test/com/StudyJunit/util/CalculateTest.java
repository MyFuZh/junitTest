package com.StudyJunit.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {


	
	@Test
	public void testadd(){
		assertEquals(6, new Calculate().and(3,3));
	}
	
	@Test
	public void testsubtract(){
		assertEquals(-4,new Calculate().subtract(5, 9));
	}
	
	@Test
	public void testmultiplication(){
		assertEquals(198, new Calculate().multiplication(99, 2));
	}
	
	@Test
	public void testexcept(){
		assertEquals(3, new Calculate().except(6,2));
	}
	
	

}
