package com.companyname.springapp.service;

import java.util.List;

import com.companyname.springapp.domain.Office;

public class OfficeManager implements InterfaceOffice {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Office> office;

	

	public void setOffice(List<Office> office1) {
		this.office = office1;
	}

	public void addOffice(Office office) {
	for(int i = 0; i< this.office.size();i++){
		if (!office.getName().equals(this.office.get(i).getName())){
			this.office.add(office);
			i=this.office.size();
		}
	}
		


	}

	public List<Office> getOffice() {
		return office;
	}
}