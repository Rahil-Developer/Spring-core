package com.spring.practice.di.model;

import java.util.Date;

public class Student {
	private int sId;
	private String fullName;
	//private Date dob;
	private String bloodGroup;
	private String mobileNo;
	/*
	 * public int getsId() { return sId; } public void setsId(int sId) { this.sId =
	 * sId; } public String getFullName() { return fullName; } public void
	 * setFullName(String fullName) { this.fullName = fullName; } public Date
	 * getDob() { return dob; } public void setDob(Date dob) { this.dob = dob; }
	 * public String getBloodGroup() { return bloodGroup; } public void
	 * setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; } public
	 * String getMobileNo() { return mobileNo; } public void setMobileNo(String
	 * mobileNo) { this.mobileNo = mobileNo; }
	 */
	
	public Student(int sId, String fullName, String bloodGroup, String mobileNo) {
		super();
		this.sId = sId;
		this.fullName = fullName;
		this.bloodGroup = bloodGroup;
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", fullName=" + fullName + ", bloodGroup=" + bloodGroup + ", mobileNo="
				+ mobileNo + "]";
	}
	
	
	
	/*
	 * public Student(int sId, String fullName, Date dob, String bloodGroup, String
	 * mobileNo) { this.sId = sId; this.fullName = fullName; this.dob = dob;
	 * this.bloodGroup = bloodGroup; this.mobileNo = mobileNo; }
	 */
	
	
}
