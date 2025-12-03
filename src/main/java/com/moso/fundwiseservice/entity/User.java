package com.moso.fundwiseservice.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name="user")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
	private Integer Id;
    private String firstName;
    private String lastName;
    private String email;

	private String passwordHash;

	@OneToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Organization iOrg;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JsonIgnore
	private Role iRole; //(enum: ADMIN, LOAN_OFFICER, UNDERWRITER, PROCESSOR, BROKER_USER, INSPECTOR, OWNER)

	private Boolean isActive; //(enum: ACTIVE, INACTIVE)

	private String createdBy;
	@CreationTimestamp
	private Date createdOn; 
	private String modifiedBy;
	@UpdateTimestamp
	private Date modifiedOn;
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public Organization getiOrg() {
		return iOrg;
	}

	public void setiOrg(Organization iOrg) {
		this.iOrg = iOrg;
	}

	public Role getiRole() {
		return iRole;
	}

	public void setiRole(Role iRole) {
		this.iRole = iRole;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", passwordHash=" + passwordHash + ", iOrg=" + iOrg + ", iRole=" + iRole + ", isActive=" + isActive
				+ ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy
				+ ", modifiedOn=" + modifiedOn + "]";
	}

	
	
}
