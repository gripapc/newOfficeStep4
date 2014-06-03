package com.companyname.springapp.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.companyname.springapp.domain.Office;
import com.companyname.springapp.repository.InMemoryOfficeDao;
import com.companyname.springapp.service.OfficeManager;

public class ShowOfficeControllerTests {

	@Test
	public void testHandleRequestView() throws Exception {
		ShowOfficeController officecontroler = new ShowOfficeController();
		OfficeManager ofm  = new OfficeManager();
		ofm.setOfficeDao(new InMemoryOfficeDao(new ArrayList<Office>()));
		officecontroler.setOfficeMAnager(ofm);;
		// officecontroler.setOfficeMAnager(new OfficeManager());
		ModelAndView modelAndView = officecontroler.handleRequest(null, null);
		assertEquals("hello", modelAndView.getViewName());
		assertNotNull(modelAndView.getModel());
		@SuppressWarnings("unchecked")
		Map<String, Object> modelMap = (Map<String, Object>) modelAndView
				.getModel().get("model");
		String nowValue = (String) modelMap.get("now");
		assertNotNull(nowValue);
	}
}