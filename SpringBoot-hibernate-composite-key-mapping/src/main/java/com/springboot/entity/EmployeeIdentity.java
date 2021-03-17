package com.springboot.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeIdentity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String employeeId;
	private String companyId;
	
	public EmployeeIdentity() {
		
	}
	
	public EmployeeIdentity(String employeeId, String companyId) {
		super();
		this.employeeId = employeeId;
		this.companyId = companyId;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
