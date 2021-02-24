package com.coforge.financeOrg.beanClass;

public class Clerk {
	
	private int clerkId;
	private String clerkName;
	private long clerkMob;
	private Branch branch;
	
	public Clerk() {
		
	}
	
	public Clerk(int clerkId, String clerkName, long clerkMob, Branch branch) {
		super();
		this.clerkId = clerkId;
		this.clerkName = clerkName;
		this.clerkMob = clerkMob;
		this.branch = branch;
	}

	public int getClerkId() {
		return clerkId;
	}

	public void setClerkId(int clerkId) {
		this.clerkId = clerkId;
	}

	public String getClerkName() {
		return clerkName;
	}

	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}

	public long getClerkMob() {
		return clerkMob;
	}

	public void setClerkMob(long clerkMob) {
		this.clerkMob = clerkMob;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Clerk [clerkId=" + clerkId + ", clerkName=" + clerkName + ", clerkMob=" + clerkMob + ", branch="
				+ branch + "]";
	}
	
	
	
}
