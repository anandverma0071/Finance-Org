package com.coforge.financeOrg.beanClass;

public class Manager {
	
	private int managerId;
	private String managerName;
	private long managerMob;
	private Branch branch;
	
	public Manager() {
		
	}
	
	public Manager(int managerId, String managerName, long managerMob, Branch branch) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerMob = managerMob;
		this.branch = branch;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public long getManagerMob() {
		return managerMob;
	}
	public void setManagerMob(long managerMob) {
		this.managerMob = managerMob;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", managerMob=" + managerMob
				+ ", branch=" + branch + "]";
	}
	
}