package com.employeelogin.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class User {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String userId;
	    private String password;
	    private String mobileNo;
	    private String email;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
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
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(Long id, String userId, String password, String mobileNo, String email) {
			super();
			this.id = id;
			this.userId = userId;
			this.password = password;
			this.mobileNo = mobileNo;
			this.email = email;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", userId=" + userId + ", password=" + password + ", mobileNo=" + mobileNo
					+ ", email=" + email + "]";
		}
	}

