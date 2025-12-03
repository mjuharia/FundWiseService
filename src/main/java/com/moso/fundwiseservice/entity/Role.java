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
import jakarta.persistence.OneToOne;

@Entity(name="role")
public class Role {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
	private Integer Id;
    private String roleName;
    private String createdBy;
	@CreationTimestamp
	private Date createdOn; 
	private String modifiedBy;
	@UpdateTimestamp
	private Date modifiedOn;
	private Boolean isActive;

	@OneToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Organization iOrg;
	
	

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Organization getiOrg() {
		return iOrg;
	}

	public void setiOrg(Organization iOrg) {
		this.iOrg = iOrg;
	}

	@Override
	public String toString() {
		return "Role [Id=" + Id + ", roleName=" + roleName + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", isActive=" + isActive + ", iOrg="
				+ iOrg + "]";
	}

	
	
}
