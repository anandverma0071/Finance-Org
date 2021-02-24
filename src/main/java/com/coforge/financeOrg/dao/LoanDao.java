package com.coforge.financeOrg.dao;

import java.util.Scanner;

import com.coforge.financeOrg.beanClass.Account;
import com.coforge.financeOrg.beanClass.Loan;

public class LoanDao {

	public void addLoan(Loan l, Account a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter LoanNo, LoanType, LoanAmount");
		l.setLoanNo(sc.nextInt());
		l.setLoanType(sc.next());
		l.setLoanAmount(sc.nextDouble());
		l.setAccount(a);
		
	}

	public void displayLoan(Loan l) {
		System.out.println("---------------Loan Details----------------");
		System.out.println("Loan No "+l.getLoanNo());
		System.out.println("Loan Type "+l.getLoanType());
		System.out.println("Loan Amount "+l.getLoanAmount());
		System.out.println("Account "+l.getAccount());
		
	}

}
