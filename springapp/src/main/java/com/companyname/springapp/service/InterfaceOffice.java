package com.companyname.springapp.service;

import java.io.Serializable;
import java.util.List;

import com.companyname.springapp.domain.Office;



	
	public interface InterfaceOffice extends Serializable {

	    public void addOffice(Office office);
	    
	    public List<Office> getOffice();

	}

