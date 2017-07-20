package com.pogochat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="user_authentication")
public class UserAuthentication {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="CUST_SEQ")
	@Column(name="Authentication_Id")
	private Long authenticationId;
	@Column(name="Authentication_Token")
	private String authToken;
	@Column(name="Api_Key")
	private String apiKey;
	public Long getAuthenticationId() {
		return authenticationId;
	}
	public void setAuthenticationId(Long authenticationId) {
		this.authenticationId = authenticationId;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	

}
