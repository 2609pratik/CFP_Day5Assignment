package com.bridelabz.EmployeePayrollApp.dto;

import java.time.LocalDate;

public class PayrollDTO {
	private String profilePic;
	private String gender;
	private String department;
	private long salary;
	private LocalDate startDate = LocalDate.now();
	private String note;
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public PayrollDTO(String profilePic, String gender, String department, long salary, LocalDate startDate,
			String note) {
		super();
		this.profilePic = profilePic;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.startDate = startDate;
		this.note = note;
	}
	public PayrollDTO() {
		super();
	}
	
}
