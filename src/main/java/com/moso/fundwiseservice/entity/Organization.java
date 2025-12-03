package com.moso.fundwiseservice.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="organization")
public class Organization {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
	private Integer Id;
    private String Name;

	private String Slug; //(for subdomain/tenant routing)

	private String country;

	private String timeZone;

	private String createdBy;
	@CreationTimestamp
	private Date createdOn; 
	private String modifiedBy;
	@UpdateTimestamp
	private Date modifiedOn;
	
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSlug() {
		return Slug;
	}
	public void setSlug(String slug) {
		Slug = slug;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
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
		return "Organization [Id=" + Id + ", Name=" + Name + ", Slug=" + Slug + ", country=" + country + ", timeZone="
				+ timeZone + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy
				+ ", modifiedOn=" + modifiedOn + "]";
	}
	
	
}
