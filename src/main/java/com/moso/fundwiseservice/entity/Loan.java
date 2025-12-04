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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity(name="loan")
public class Loan {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
	private Integer Id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organization_id")
	@JsonIgnore
    private Organization iOrg;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	private Customer borrower;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "property_id")
	private Property property;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loan_product_id")
	private LoanProduct loanProduct;

	private BigDecimal requestedLoanAmount;
	private BigDecimal approvedLoanAmount;

	private BigDecimal outstandingPrincipalBal;
	private BigDecimal amountNotBorrowed;
	
	private BigDecimal interestRate;
	private Integer termMonths;
	
	private BigDecimal interestReserveAmount;
	private BigDecimal ltv;
	private BigDecimal ltc;
	
	private Date loanStartDate;
	
	private String createdBy;
	@CreationTimestamp
	private Date createdOn; 
	private String modifiedBy;
	@UpdateTimestamp
	private Date modifiedOn;
	private boolean isActive;
	private String loanStatus;
	
	public Loan() {
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

	public Customer getBorrower() {
		return borrower;
	}

	public void setBorrower(Customer borrower) {
		this.borrower = borrower;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public LoanProduct getLoanProduct() {
		return loanProduct;
	}

	public void setLoanProduct(LoanProduct loanProduct) {
		this.loanProduct = loanProduct;
	}

	public BigDecimal getRequestedLoanAmount() {
		return requestedLoanAmount;
	}

	public void setRequestedLoanAmount(BigDecimal requestedLoanAmount) {
		this.requestedLoanAmount = requestedLoanAmount;
	}

	public BigDecimal getApprovedLoanAmount() {
		return approvedLoanAmount;
	}

	public void setApprovedLoanAmount(BigDecimal approvedLoanAmount) {
		this.approvedLoanAmount = approvedLoanAmount;
	}

	public BigDecimal getOutstandingPrincipalBal() {
		return outstandingPrincipalBal;
	}

	public void setOutstandingPrincipalBal(BigDecimal outstandingPrincipalBal) {
		this.outstandingPrincipalBal = outstandingPrincipalBal;
	}

	public BigDecimal getAmountNotBorrowed() {
		return amountNotBorrowed;
	}

	public void setAmountNotBorrowed(BigDecimal amountNotBorrowed) {
		this.amountNotBorrowed = amountNotBorrowed;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public Integer getTermMonths() {
		return termMonths;
	}

	public void setTermMonths(Integer termMonths) {
		this.termMonths = termMonths;
	}

	public BigDecimal getInterestReserveAmount() {
		return interestReserveAmount;
	}

	public void setInterestReserveAmount(BigDecimal interestReserveAmount) {
		this.interestReserveAmount = interestReserveAmount;
	}

	public BigDecimal getLtv() {
		return ltv;
	}

	public void setLtv(BigDecimal ltv) {
		this.ltv = ltv;
	}

	public BigDecimal getLtc() {
		return ltc;
	}

	public void setLtc(BigDecimal ltc) {
		this.ltc = ltc;
	}

	public Date getLoanStartDate() {
		return loanStartDate;
	}

	public void setLoanStartDate(Date loanStartDate) {
		this.loanStartDate = loanStartDate;
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	@Override
	public String toString() {
		return "Loan [Id=" + Id + ", iOrg=" + iOrg + ", borrower=" + borrower + ", property=" + property
				+ ", loanProduct=" + loanProduct + ", requestedLoanAmount=" + requestedLoanAmount
				+ ", approvedLoanAmount=" + approvedLoanAmount + ", outstandingPrincipalBal=" + outstandingPrincipalBal
				+ ", amountNotBorrowed=" + amountNotBorrowed + ", interestRate=" + interestRate + ", termMonths="
				+ termMonths + ", interestReserveAmount=" + interestReserveAmount + ", ltv=" + ltv + ", ltc=" + ltc
				+ ", loanStartDate=" + loanStartDate + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", isActive=" + isActive
				+ ", loanStatus=" + loanStatus + "]";
	}
	
	
	
}
