package com.companyname.springapp.web;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.companyname.springapp.service.OfficeManager;


public class ShowOfficeControllerTests {

	@Test
	public void testHandleRequestView() throws Exception {
		ShowOfficeController officecontroler = new ShowOfficeController();
		officecontroler.setOfficeMAnager(new OfficeManager());
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