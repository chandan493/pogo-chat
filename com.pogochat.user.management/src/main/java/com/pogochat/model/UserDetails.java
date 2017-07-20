package com.pogochat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name ="user_details")
public class UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="CUST_SEQ")
	@Column(name="User_Id")
	private Long userId;
	@Column(name="Authentication_Id")
	private Long authenticationId;
	@Column(name="Email")
	private String email;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getAuthenticationId() {
		return authenticationId;
	}
	public void setAuthenticationId(Long authenticationId) {
		this.authenticationId = authenticationId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
