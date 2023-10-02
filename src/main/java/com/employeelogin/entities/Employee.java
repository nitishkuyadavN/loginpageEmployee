package com.employeelogin.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class Employee {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String employeeId;
	    private String name;
	    private String gender;
	    private String designation;
	    private String mobileNo;
	    private String email;
	    private String photoUrl;
	    private double basic;
	    private double hra;
	    private double variableAllowance;
	    private double salary;
	    // Add getters and setters
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(String employeeId) {
			this.employeeId = employeeId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhotoUrl() {
			return photoUrl;
		}
		public void setPhotoUrl(String photoUrl) {
			this.photoUrl = photoUrl;
		}
		public double getBasic() {
			return basic;
		}
		public void setBasic(double basic) {
			this.basic = basic;
		}
		public double getHra() {
			return hra;
		}
		public void setHra(double hra) {
			this.hra = hra;
		}
		public double getVariableAllowance() {
			return variableAllowance;
		}
		public void setVariableAllowance(double variableAllowance) {
			this.variableAllowance = variableAllowance;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(Long id, String employeeId, String name, String gender, String designation, String mobileNo,
				String email, String photoUrl, double basic, double hra, double variableAllowance, double salary) {
			super();
			this.id = id;
			this.employeeId = employeeId;
			this.name = name;
			this.gender = gender;
			this.designation = designation;
			this.mobileNo = mobileNo;
			this.email = email;
			this.photoUrl = photoUrl;
			this.basic = basic;
			this.hra = hra;
			this.variableAllowance = variableAllowance;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", employeeId=" + employeeId + ", name=" + name + ", gender=" + gender
					+ ", designation=" + designation + ", mobileNo=" + mobileNo + ", email=" + email + ", photoUrl="
					+ photoUrl + ", basic=" + basic + ", hra=" + hra + ", variableAllowance=" + variableAllowance
					+ ", salary=" + salary + "]";
		}
		public void calculateSalary() {
			double basicPercentage = 0.6;
			double hraPercentage = 0.4;
			this.salary = (basic * basicPercentage) + (hra * hraPercentage) + variableAllowance;
		}
	}


