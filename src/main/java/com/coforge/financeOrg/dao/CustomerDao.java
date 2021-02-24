package com.coforge.financeOrg.dao;

import java.util.Scanner;

import com.coforge.financeOrg.beanClass.Customer;

public class CustomerDao {
	
	public void addCustomer(Customer c) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter CustId, CustName, CustMob, CustAdd");
		c.setCustId(sc.nextInt());
		c.setCustName(sc.next());
		c.setCustMob(sc.nextLong());
		c.setCustAdd(sc.next());
	}
	
	public void displayCustomer(Customer c){
		System.out.println("---------------Customer Details----------------");
		System.out.println("Customer Id-: "+c.getCustId());
		System.out.println("Customer Name-: "+c.getCustName());
		System.out.println("Customer Mob-: "+c.getCustMob());
		System.out.println("Customer Add-: "+c.getCustAdd());
	}

}
