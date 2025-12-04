package com.moso.fundwiseservice.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name="property")
public class Property {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
	private Integer Id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organization_id")
	@JsonIgnore
    private Organization iOrg;
    private String addressLine1;
    private String city;
    private String state;
    private String postalCode;
    private String county;
    private String propertyType;
    private BigDecimal appraisedValue;
    private BigDecimal purchasePrice;
    private BigDecimal asIsValue;
    private BigDecimal afterRepairValue;
    /* GeoLocation */
    private double latitude;
    private double longitude;
    
    @OneToMany(fetch = FetchType.LAZY)
	@JsonIgnore
    private List<PropertyUnit> units;
    
    private String createdBy;
	@CreationTimestamp
	private Date createdOn; 
	private String modifiedBy;
	@UpdateTimestamp
	private Date modifiedOn;
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Organization getiOrg() {
		return iOrg;
	}
	public void setiOrg(Organization iOrg) {
		this.iOrg = iOrg;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public BigDecimal getAppraisedValue() {
		return appraisedValue;
	}
	public void setAppraisedValue(BigDecimal appraisedValue) {
		this.appraisedValue = appraisedValue;
	}
	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public BigDecimal getAsIsValue() {
		return asIsValue;
	}
	public void setAsIsValue(BigDecimal asIsValue) {
		this.asIsValue = asIsValue;
	}
	public BigDecimal getAfterRepairValue() {
		return afterRepairValue;
	}
	public void setAfterRepairValue(BigDecimal afterRepairValue) {
		this.afterRepairValue = afterRepairValue;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public List<PropertyUnit> getUnits() {
		return units;
	}
	public void setUnits(List<PropertyUnit> units) {
		this.units = units;
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
		return "Property [Id=" + Id + ", iOrg=" + iOrg + ", addressLine1=" + addressLine1 + ", city=" + city
				+ ", state=" + state + ", postalCode=" + postalCode + ", county=" + county + ", propertyType="
				+ propertyType + ", appraisedValue=" + appraisedValue + ", purchasePrice=" + purchasePrice
				+ ", asIsValue=" + asIsValue + ", afterRepairValue=" + afterRepairValue + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", units=" + units + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + "]";
	}
	
	
}
