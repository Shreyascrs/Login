package com.bridgeit.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	@Column
	private String name;
	@Id
	@Column
	private String username;
	@Column
	private String dob;
	@Column
	private String phonenumber;
	@Column
	private String email;
	@Column
	private String password;
	
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", username=" + username + ", dob=" + dob + ", phonenumber=" + phonenumber
				+ ", email=" + email + ", password=" + password + " ]";
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
