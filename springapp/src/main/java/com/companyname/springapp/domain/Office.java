package com.companyname.springapp.domain;

import java.io.Serializable;



public class Office implements Serializable {
	
	private static final long serialVersionUID = 1L;

    private String name, street;
    private int phone;
    private int zip;
    

    public Office (String name, String street,int phone,int zip){
    	this.name = name;
    	this.street = street;
    	this.phone = phone;
    	this.zip = zip;
    }

    public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public int getZip() {
		return zip;
	}



	public void setZip(int zip) {
		this.zip = zip;
	}



	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}



	public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Name: " + name + ";");
        buffer.append("Street: " + street +";");
        buffer.append("Zip" + zip + ";");
        buffer.append("Phone" + phone);
        return buffer.toString();
    }
}
