package com.companyname.springapp.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "offices")
public class Office implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String name, street;
	private int phone;
	private int zip;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Office( String name, String street, int phone, int zip) {
	
		this.name = name;
		this.street = street;
		this.phone = phone;
		this.zip = zip;
	}
	
	public Office(){
		
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
		buffer.append("Street: " + street + ";");
		buffer.append("Zip" + zip + ";");
		buffer.append("Phone" + phone);
		return buffer.toString();
	}
}
