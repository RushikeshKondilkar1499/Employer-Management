package com.rushi.EmployerManagement.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Emp_stage")
public class EmployerStage {
	
	@Id
	@Pattern(regexp = "^EM.*", message = "Value must start with 'EM'")
	private String applicationId;
	
	@NotBlank(message = "Application type can not be blank")
	private ApplicationType applicationType;
  
	@NotEmpty(message = "Employee id can not be empty")
	private String empId;

	@NotEmpty(message = "Employee name can not be empty")
	private String empName;

	@Enumerated(EnumType.STRING) // Store enum as VARCHAR
	@NotNull(message="Employee type cannot be null")
	@Column(nullable = false)
	private EmployerType employerType;
	
	@NotNull(message="Master code can not be null")
	@Positive(message = "master code can not be negative")
	private Integer masterCode;
	
	@NotNull(message="Subisdary code can not be null")
	@Positive(message = "Subisdary code can not be negative")
	private Integer subsidaryCode;
	
	@NotBlank(message="Registration id can not be blank")
	@Positive(message = "Registration id can not be negative")
	@Size(max = 6, message="Registration id must be six digit. Append zeros if it is not 6 digit")
	private String registrationId;
	
	@Enumerated(EnumType.STRING)
	@NotBlank(message = "Emplyer Category can not be blank")
	private EmployerCategory employerCategory;
	
	@NotBlank(message = "Employer Grade can not be blank")
	@Enumerated(EnumType.STRING)
	private EmployeGrade employergrade;
	
	@NotBlank(message = "Employer address can not be blank")
	private String address;
	
	@NotBlank(message = "Country name can not be blank")
	private String country;
	
	@NotBlank(message = "RM name can not be blank")
	private String rmName;
	
	@NotBlank(message = "Mobile no can not be blank")
	@Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid Indian mobile number")
	private String mobileNo;
	
	@NotBlank(message = "Email can not be blank")
	@Pattern(
		    regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.com$",
		    message = "Only .com email addresses are allowed"
		)
	private String email;
	
	@Positive(message="Revenue amount must be positive")
	private Long revenue;
	
	@Positive(message="Profit amount must be positive")
	private Long profit;
	
	@Size(min = 0,message="debt amount must be positive or zero")
	private Long debt;
	
	@Size(min = 0,message="noOfEmployees amount must be positive or zero")
	private Long noOfEmployees;
	
	@Size(min = 0,message="noOfEmployeesEliigibleForLoan amount must be positive or zero")
	private Long noOfEmployeesEliigibleForLone;
	
	@Size(min = 0,message="maxLoanAmountPerEmployee  must be positive or zero")
	private Long maxLoanAmountPerEmployee;
	
	@Size(min = 0,message="maxLoanAmount must be positive or zero")
	private Long maxLoanAmount;
	
	@Size(min=0,max=100, message = "npa must be between 0-100")
	private Double npa;
	
	@Size(min=0,max=100, message = "deliquency must be between 0-100")
	private Double deliquency;
	
	@NotBlank(message = "approvedGrade cannot be blank")
	private EmployeGrade approvedGrade;
	
	@NotBlank(message = "application stage can not be blank")
	private ApplicationStage stage;

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public ApplicationType getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(ApplicationType applicationType) {
		this.applicationType = applicationType;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public EmployerType getEmployerType() {
		return employerType;
	}

	public void setEmployerType(EmployerType employerType) {
		this.employerType = employerType;
	}

	public Integer getMasterCode() {
		return masterCode;
	}

	public void setMasterCode(Integer masterCode) {
		this.masterCode = masterCode;
	}

	public Integer getSubsidaryCode() {
		return subsidaryCode;
	}

	public void setSubsidaryCode(Integer subsidaryCode) {
		this.subsidaryCode = subsidaryCode;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public EmployerCategory getEmployerCategory() {
		return employerCategory;
	}

	public void setEmployerCategory(EmployerCategory employerCategory) {
		this.employerCategory = employerCategory;
	}

	public EmployeGrade getEmployergrade() {
		return employergrade;
	}

	public void setEmployergrade(EmployeGrade employergrade) {
		this.employergrade = employergrade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRmName() {
		return rmName;
	}

	public void setRmName(String rmName) {
		this.rmName = rmName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getRevenue() {
		return revenue;
	}

	public void setRevenue(Long revenue) {
		this.revenue = revenue;
	}

	public Long getProfit() {
		return profit;
	}

	public void setProfit(Long profit) {
		this.profit = profit;
	}

	public Long getDebt() {
		return debt;
	}

	public void setDebt(Long debt) {
		this.debt = debt;
	}

	public Long getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(Long noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public Long getNoOfEmployeesEliigibleForLone() {
		return noOfEmployeesEliigibleForLone;
	}

	public void setNoOfEmployeesEliigibleForLone(Long noOfEmployeesEliigibleForLone) {
		this.noOfEmployeesEliigibleForLone = noOfEmployeesEliigibleForLone;
	}

	public Long getMaxLoanAmountPerEmployee() {
		return maxLoanAmountPerEmployee;
	}

	public void setMaxLoanAmountPerEmployee(Long maxLoanAmountPerEmployee) {
		this.maxLoanAmountPerEmployee = maxLoanAmountPerEmployee;
	}

	public Long getMaxLoanAmount() {
		return maxLoanAmount;
	}

	public void setMaxLoanAmount(Long maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}

	public Double getNpa() {
		return npa;
	}

	public void setNpa(Double npa) {
		this.npa = npa;
	}

	public Double getDeliquency() {
		return deliquency;
	}

	public void setDeliquency(Double deliquency) {
		this.deliquency = deliquency;
	}

	public EmployeGrade getApprovedGrade() {
		return approvedGrade;
	}

	public void setApprovedGrade(EmployeGrade approvedGrade) {
		this.approvedGrade = approvedGrade;
	}

	public ApplicationStage getStage() {
		return stage;
	}

	public void setStage(ApplicationStage stage) {
		this.stage = stage;
	}

	@Override
	public String toString() {
		return "EmployerStage [applicationId=" + applicationId + ", applicationType=" + applicationType + ", empId="
				+ empId + ", empName=" + empName + ", employerType=" + employerType + ", masterCode=" + masterCode
				+ ", subsidaryCode=" + subsidaryCode + ", registrationId=" + registrationId + ", employerCategory="
				+ employerCategory + ", employergrade=" + employergrade + ", address=" + address + ", country="
				+ country + ", rmName=" + rmName + ", mobileNo=" + mobileNo + ", email=" + email + ", revenue="
				+ revenue + ", profit=" + profit + ", debt=" + debt + ", noOfEmployees=" + noOfEmployees
				+ ", noOfEmployeesEliigibleForLone=" + noOfEmployeesEliigibleForLone + ", maxLoanAmountPerEmployee="
				+ maxLoanAmountPerEmployee + ", maxLoanAmount=" + maxLoanAmount + ", npa=" + npa + ", deliquency="
				+ deliquency + ", approvedGrade=" + approvedGrade + ", stage=" + stage + "]";
	}
	
	
}
