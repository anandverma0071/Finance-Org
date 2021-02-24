package com.coforge.financeOrg.beanClass;

public class Account {
	
	private int accNo;
	private String accType;
	private  Customer customer;
	private Branch branch;
	
	public Account() {
		
	}
	
	
	public Account(int accNo, String accType, Customer customer, Branch branch) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.customer = customer;
		this.branch = branch;
	}


	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public String getAccType() {
		return accType;
	}


	public void setAccType(String accType) {
		this.accType = accType;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Branch getBranch() {
		return branch;
	}


	public void setBranch(Branch branch) {
		this.branch = branch;
	}


	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accType=" + accType + ", customer=" + customer + ", branch=" + branch
				+ "]";
	}
	
	
	

	
}
