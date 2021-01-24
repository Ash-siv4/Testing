package com.qa.unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CustomerTest {
	
	Customer cust = new Customer();
	
	@BeforeClass
	public static void start() {
		System.out.println("Before Class");
	}
	
	@Before
	public void preTest() {
		System.out.println("Before");
		cust.setName("Eeyore");
	}
	
	@Test
	public void variableTest() {
		assertEquals("Eeyore",cust.getName());
	}
	
	@Test
	public void numbersTest() {
		assertEquals(70,cust.numbers(3, 4));
		assertEquals(30,cust.numbers(2, 1));
		assertNotNull("Expected: not null since 0+0*0=0 not null",cust.numbers(0, 0));//0 is not null
	}
	
	@Test
	public void tfTest() {
//		assertTrue(cust.tf());
		assertFalse(cust.tf());
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Ignore //ignores the test, useful to skip a test that doesn't need to be checked
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	
	@After
	public void postTest() {
		System.out.println("After");
	}
	
	@AfterClass
	public static void end() {
		System.out.println("After Class");
	}
	
	
}
