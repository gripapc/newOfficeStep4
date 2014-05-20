package com.companyname.springapp.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OfficeTests {

	private Office office;

	@Before
	public void setUp() throws Exception {
		office = new Office(null, null, 0, 0);
	}
	
	@Test 
	public void testConstructor(){
		Office office2 = new Office("sucursal1", "juan nuevo", 987356522, 24009);
		assertEquals("sucursal1",office2.getName());
		assertEquals("juan nuevo", office2.getStreet());
		assertEquals(987356522, office2.getPhone());
		assertEquals(24009, office2.getZip());
		
	}
	@Test
	public void testSetAndGetName() {
		String testName = "padreIsla";
		assertNull(office.getName());
		office.setName(testName);
		assertEquals(testName, office.getName());
	}

	@Test
	public void testSetAndGetStreet() {
		String testStreet = "juanNuevo";
		assertNull(office.getStreet());
		office.setStreet(testStreet);
		assertEquals(testStreet, office.getStreet());
	}

	@Test
	public void testSetAndGetZip() {
		int testZip = 24009;
		office.setZip(testZip);
		assertEquals(testZip, office.getZip());
	}

	@Test
	public void testSetAndGetPhone() {
		int testPhone = 987568974;
		office.setPhone(testPhone);
		assertEquals(testPhone, office.getPhone(), 0);
	}
}
