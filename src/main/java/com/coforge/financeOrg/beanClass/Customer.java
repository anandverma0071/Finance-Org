package com.coforge.financeOrg.beanClass;

public class Customer {
	
	private int custId;
	private String custName;
	private long custMob;
	private String custAdd;
	
	public Customer() {
		
	}
	
	
	public Customer(int custId, String custName, long custMob, String custAdd) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custMob = custMob;
		this.custAdd = custAdd;
	}


	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public long getCustMob() {
		return custMob;
	}


	public void setCustMob(long custMob) {
		this.custMob = custMob;
	}


	public String getCustAdd() {
		return custAdd;
	}


	public void setCustAdd(String custAdd) {
		this.custAdd = custAdd;
	}


	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custMob=" + custMob + ", custAdd=" + custAdd
				+ "]";
	}
	
	
}
