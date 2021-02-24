package com.coforge.financeOrg.beanClass;

public class Loan {
	private int loanNo;
	private String loanType;
	private double loanAmount;
	private Account account;
	
	public Loan() {
		
	}
	
	public Loan(int loanNo, String loanType, double loanAmount, Account account) {
		super();
		this.loanNo = loanNo;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.account = account;
	}

	public int getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	
	@Override
	public String toString() {
		return "Loan [loanNo=" + loanNo + ", loanType=" + loanType + ", loanAmount=" + loanAmount + ", account="
				+ account + "]";
	}
	
	
	
	
}
