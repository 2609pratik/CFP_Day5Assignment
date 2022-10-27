package com.bridelabz.EmployeePayrollApp.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.bridelabz.EmployeePayrollApp.dto.PayrollDTO;

@Entity
public class PayrollModel {
	@Id
	@GeneratedValue
	private int id;
	private String profilePic;
	private String gender;
	private String department;
	private long salary;
	private LocalDate startDate = LocalDate.now();
	private String note;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public void PayrollModel(PayrollDTO data) {
		this.profilePic = data.getProfilePic();
		this.gender = data.getGender();
		this.department = data.getDepartment();
		this.salary = data.getSalary();
		this.startDate = data.getStartDate();
		this.note = data.getNote();
	}
	public PayrollModel() {
		super();
	}
	public PayrollModel(int id, String profilePic, String gender, String department, int salary, LocalDate startDate,
			String note) {
		super();
		this.id = id;
		this.profilePic = profilePic;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.startDate = startDate;
		this.note = note;
	}
	
	

}
