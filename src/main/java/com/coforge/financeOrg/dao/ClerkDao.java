package com.coforge.financeOrg.dao;

import java.util.Scanner;

import com.coforge.financeOrg.beanClass.Branch;
import com.coforge.financeOrg.beanClass.Clerk;

public class ClerkDao {
	
	public void addClerk(Clerk c, Branch b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter ClerkId, ClerkName, ClerkMob,");
		c.setClerkId(sc.nextInt());
		c.setClerkName(sc.next());
		c.setClerkMob(sc.nextLong());
		c.setBranch(b);
	}

	public void displayClerk(Clerk c) {
		System.out.println("---------------Clerk Details----------------");
		System.out.println("ClerkId-: " + c.getClerkId());
		System.out.println("ClerkName-: " + c.getClerkName());
		System.out.println("ClerkMob-: " + c.getClerkMob());
		System.out.println(c.getBranch());
		
	}
}
