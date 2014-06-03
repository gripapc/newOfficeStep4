package com.companyname.springapp.repository;
import java.util.List;

import com.companyname.springapp.domain.Office;

public interface OfficeDao {
	  public List<Office> getOfficeList();

	    public void saveOffice(Office office);
}
