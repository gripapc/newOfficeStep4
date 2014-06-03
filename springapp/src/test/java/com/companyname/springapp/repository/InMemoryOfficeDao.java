package com.companyname.springapp.repository;



import java.util.List;

import com.companyname.springapp.domain.Office;



public class InMemoryOfficeDao implements OfficeDao {

    private List<Office> officeList;
    private JPAOfficeDao jpaOffice;

    public InMemoryOfficeDao(){
    	jpaOffice = new JPAOfficeDao();
    }
    
    public InMemoryOfficeDao(List<Office> officeList) {
        this.officeList = officeList;
    }

    public List<Office> getOfficeList() {
        return officeList;
    }

    public void saveOffice(Office office) {

    }

}