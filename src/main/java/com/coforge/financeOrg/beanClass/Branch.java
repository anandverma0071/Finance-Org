package com.coforge.financeOrg.beanClass;

public class Branch {
	private String branchId;
	private String branchName;
	private String branchAddress;
	
	public Branch() {
		
	}
	
	public Branch(String branchId, String branchName, String branchAddress) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchAddress = branchAddress;
	}
	
	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", branchAddress=" + branchAddress + "]";
	}
	
	
	
	
}
