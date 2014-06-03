package com.companyname.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.companyname.springapp.domain.Office;
import com.companyname.springapp.repository.OfficeDao;
@Component
public class OfficeManager implements InterfaceOffice {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private OfficeDao officeDao;
	

	public void setOfficeDao(OfficeDao officeDao) {
        this.officeDao = officeDao;
    }


	public List<Office> getOffice() {
		return officeDao.getOfficeList();
	}

	public void addOffice(Office office) {
	
		List<Office> listOffice = officeDao.getOfficeList();
		for(int i = 0; i< listOffice.size();i++){
		if (!office.getName().equals(listOffice.get(i).getName())){
			officeDao.saveOffice(office);
			i=listOffice.size();
		}
	}
		


	}

	
}