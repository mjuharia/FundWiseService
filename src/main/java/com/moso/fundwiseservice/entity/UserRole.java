package com.moso.fundwiseservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name="user_role")
public class UserRole {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
	private Integer Id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id")
	@JsonIgnore
	private Role iRole; //(enum: ADMIN, LOAN_OFFICER, UNDERWRITER, PROCESSOR, BROKER_USER, INSPECTOR, OWNER)
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private User iUser;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organization_id")
	@JsonIgnore
	private Organization iOrg;

	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Role getiRole() {
		return iRole;
	}

	public void setiRole(Role iRole) {
		this.iRole = iRole;
	}

	public User getiUser() {
		return iUser;
	}

	public void setiUser(User iUser) {
		this.iUser = iUser;
	}

	public Organization getiOrg() {
		return iOrg;
	}

	public void setiOrg(Organization iOrg) {
		this.iOrg = iOrg;
	}

	@Override
	public String toString() {
		return "UserRole [Id=" + Id + ", iRole=" + iRole + ", iUser=" + iUser + ", iOrg=" + iOrg + "]";
	}
	
	
}
