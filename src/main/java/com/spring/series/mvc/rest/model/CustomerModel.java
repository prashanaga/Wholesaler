package com.spring.series.mvc.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name="PersonModel")
//@XmlAccessorType(XmlAccessType.NONE)
public class CustomerModel extends PersonModel{
 
   // @XmlElement(name = "id")
    private int id;
    
    //@XmlElement(name = "name")
    private String name;
    
    
   // @XmlElement(name = "matches")
    private String matches;
    
    private Address address;
    private String password;
 
    
    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMatches() {
		return matches;
	}

	public void setMatches(String matches) {
		this.matches = matches;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
   
    
    
}