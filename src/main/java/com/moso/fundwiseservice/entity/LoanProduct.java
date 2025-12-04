package com.moso.fundwiseservice.entity;

import java.math.BigDecimal;
import java.sql.Date;

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

@Entity(name="loan_product")
public class LoanProduct {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
	private Integer Id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organization_id")
	@JsonIgnore
    private Organization iOrg;
	
	private String loanType;
	private String interestRateType;
	
	private String name;
	private BigDecimal maxLtv;
	private BigDecimal maxLtc;
	private Integer minFico;
	
	private BigDecimal defaultInterestRate;
	private BigDecimal baseInterestRate;
	private BigDecimal spread;
    private Integer termMonths;
    private BigDecimal pointsCharged;
    private String dayCountBasis;

    private Boolean interestReserveRequired;

    private BigDecimal maxLoanAmount;
    private BigDecimal minLoanAmount;
    
    private boolean isActive;
    private String createdBy;
	@CreationTimestamp
	private Date createdOn; 
	private String modifiedBy;
	@UpdateTimestamp
	private Date modifiedOn;

	public LoanProduct() {
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

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getInterestRateType() {
		return interestRateType;
	}

	public void setInterestRateType(String interestRateType) {
		this.interestRateType = interestRateType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getMaxLtv() {
		return maxLtv;
	}

	public void setMaxLtv(BigDecimal maxLtv) {
		this.maxLtv = maxLtv;
	}

	public BigDecimal getMaxLtc() {
		return maxLtc;
	}

	public void setMaxLtc(BigDecimal maxLtc) {
		this.maxLtc = maxLtc;
	}

	public Integer getMinFico() {
		return minFico;
	}

	public void setMinFico(Integer minFico) {
		this.minFico = minFico;
	}

	public BigDecimal getDefaultInterestRate() {
		return defaultInterestRate;
	}

	public void setDefaultInterestRate(BigDecimal defaultInterestRate) {
		this.defaultInterestRate = defaultInterestRate;
	}

	public BigDecimal getBaseInterestRate() {
		return baseInterestRate;
	}

	public void setBaseInterestRate(BigDecimal baseInterestRate) {
		this.baseInterestRate = baseInterestRate;
	}

	public BigDecimal getSpread() {
		return spread;
	}

	public void setSpread(BigDecimal spread) {
		this.spread = spread;
	}

	public Integer getTermMonths() {
		return termMonths;
	}

	public void setTermMonths(Integer termMonths) {
		this.termMonths = termMonths;
	}

	public BigDecimal getPointsCharged() {
		return pointsCharged;
	}

	public void setPointsCharged(BigDecimal pointsCharged) {
		this.pointsCharged = pointsCharged;
	}

	public String getDayCountBasis() {
		return dayCountBasis;
	}

	public void setDayCountBasis(String dayCountBasis) {
		this.dayCountBasis = dayCountBasis;
	}

	public Boolean getInterestReserveRequired() {
		return interestReserveRequired;
	}

	public void setInterestReserveRequired(Boolean interestReserveRequired) {
		this.interestReserveRequired = interestReserveRequired;
	}

	public BigDecimal getMaxLoanAmount() {
		return maxLoanAmount;
	}

	public void setMaxLoanAmount(BigDecimal maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}

	public BigDecimal getMinLoanAmount() {
		return minLoanAmount;
	}

	public void setMinLoanAmount(BigDecimal minLoanAmount) {
		this.minLoanAmount = minLoanAmount;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
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
		return "LoanProduct [Id=" + Id + ", iOrg=" + iOrg + ", loanType=" + loanType + ", interestRateType="
				+ interestRateType + ", name=" + name + ", maxLtv=" + maxLtv + ", maxLtc=" + maxLtc + ", minFico="
				+ minFico + ", defaultInterestRate=" + defaultInterestRate + ", baseInterestRate=" + baseInterestRate
				+ ", spread=" + spread + ", termMonths=" + termMonths + ", pointsCharged=" + pointsCharged
				+ ", dayCountBasis=" + dayCountBasis + ", interestReserveRequired=" + interestReserveRequired
				+ ", maxLoanAmount=" + maxLoanAmount + ", minLoanAmount=" + minLoanAmount + ", isActive=" + isActive
				+ ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy
				+ ", modifiedOn=" + modifiedOn + "]";
	}
    
    
}
