package com.studentrestapi.studentrestapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	//properties
	@Id
	private long id;
	private String fullName;
	private String mobileNo;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(long id, String fullName, String mobileNo) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.mobileNo = mobileNo;
	}
	
	//getter setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", mobileNo=" + mobileNo + "]";
	}
	
	
	
}
