package com.accion.cision.rest.sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="resources", schema = "cision")
public class CisionPanelEntity {

	@Id
    @GeneratedValue
	private Long id;	
	
	@Column(name="fullName")
	private String fullName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="newJoinee")
	private Boolean newJoinee;
	
	@Column(name="resourceId")
	private String resourceId;
	
	@Column(name="contactnumber")
	private String contactnumber;
	
	@Column(name="functionalProfile")
	private String functionalProfile;
	
	@Column(name="password")
	private String password;
	
	@Column(name="userType")
	private String userType;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getNewJoinee() {
		return newJoinee;
	}
	public void setNewJoinee(Boolean newJoinee) {
		this.newJoinee = newJoinee;
	}
	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getFunctionalProfile() {
		return functionalProfile;
	}
	public void setFunctionalProfile(String functionalProfile) {
		this.functionalProfile = functionalProfile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
	
}
