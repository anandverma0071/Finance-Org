package com.coforge.financeOrg.dao;

import java.util.Scanner;

import com.coforge.financeOrg.beanClass.Manager;
import com.coforge.financeOrg.beanClass.Branch;

public class ManagerDao {
	
	public void addManager(Manager m, Branch b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter ManagerId, ManagerName, ManagerMob,");
		m.setManagerId(sc.nextInt());
		m.setManagerName(sc.next());
		m.setManagerMob(sc.nextLong());
		m.setBranch(b);
	}

	public void displayManager(Manager m) {
		System.out.println("---------------Manager Details----------------");
		System.out.println("ClerkId-: " + m.getManagerId());
		System.out.println("ClerkName-: " + m.getManagerName());
		System.out.println("ClerkMob-: " + m.getManagerMob());
		System.out.println(m.getBranch());
		
	}

}
