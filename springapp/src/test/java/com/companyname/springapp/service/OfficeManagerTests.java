package com.companyname.springapp.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.companyname.springapp.domain.Office;
import com.companyname.springapp.repository.InMemoryOfficeDao;
import com.companyname.springapp.repository.OfficeDao;


public class OfficeManagerTests {

	private OfficeManager officeManager;
	private List<Office> office;
	private static int ZIP = 25332;
	private static int PHONE = 987562458;
	private static String NAME= "sucursal1";
	private static String DIRECCION= "juanNuevo";
	
	
	@Before
	public void setUp() throws Exception {
		officeManager = new OfficeManager();
		office = new ArrayList<Office>();
		// Creamos objetos producto con su numbre y su precio correspondiente

		// stub up a list of products
		Office office1 = new Office(NAME, DIRECCION, PHONE, ZIP);
		// guardamos esos productos en un array list de productos que
		// posteriormente de lo pasaremos a nuestra lista de productos
		office.add(office1);
		// pasamos la lista de productos
		  OfficeDao officeDao = new InMemoryOfficeDao(office);
	      officeManager.setOfficeDao(officeDao);
		//officeManager.setOffice(office);
	}

	@Test
	public void testGetOfficeWithNoOffice() {
		officeManager= new OfficeManager();
		officeManager.setOfficeDao(new InMemoryOfficeDao(null));
		assertNull(officeManager.getOffice());
	}

	@Test
	public void testGetOffice() {
		List<Office> office = officeManager.getOffice();
		assertNotNull(office);
		Office objectOffice = office.get(0);
		assertEquals(NAME, objectOffice.getName());
		assertEquals(DIRECCION, objectOffice.getStreet());
		assertEquals(PHONE, objectOffice.getPhone(),0);
		assertEquals(ZIP, objectOffice.getZip());
	}
	
	@Test
	public void testAddOffice() {	
		Office office = new Office("sucursal2", "calle1", 999999, 52332);
		officeManager.getOffice().add(office);
		assertEquals("sucursal2", officeManager.getOffice().get(1).getName());
		assertEquals("calle1", officeManager.getOffice().get(1).getStreet());
		assertEquals(999999, officeManager.getOffice().get(1).getPhone(),0);
		assertEquals(52332, officeManager.getOffice().get(1).getZip());
		
	}
	
	@Test
	public void testEqualsOffice() {
	Office office2 = new Office(NAME, DIRECCION, PHONE, ZIP);
	officeManager.addOffice(office2);
	List<Office> offices = officeManager.getOffice();
	assertEquals(1, offices.size());
	
	}
}