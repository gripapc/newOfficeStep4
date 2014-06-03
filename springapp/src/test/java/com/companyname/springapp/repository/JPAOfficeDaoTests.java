package com.companyname.springapp.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.companyname.springapp.domain.Office;

public class JPAOfficeDaoTests {

	 private ApplicationContext context;
	    private OfficeDao officeDao;

	    @Before
	    public void setUp() throws Exception {
	        context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
	        officeDao = (OfficeDao) context.getBean("officeDao");
	    }

	    @Test
	    public void testGetOfficetList() {
	        List<Office> offices = officeDao.getOfficeList();
	        assertEquals(offices.size(), 5, 0);	   
	    }

	    @Test
	    public void testSaveOffice() {
	        List<Office> offices = officeDao.getOfficeList();
	        Office office = new Office("oficina1", "numancia", 987111111, 20001);
	       offices.add(office);
	        
	       
	        assertEquals(offices.get(offices.size()-1).getZip(), 20001, 0);
	        assertEquals(offices.get(offices.size()-1).getName(), "oficina1");
	        assertEquals(offices.get(offices.size()-1).getPhone(), 987111111, 0);
	        assertEquals(offices.get(offices.size()-1).getStreet(), "numancia");

	        
	        //officeDao.saveOffice(o2);
	    }
	}
