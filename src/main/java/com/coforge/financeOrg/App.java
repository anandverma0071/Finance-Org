package com.coforge.financeOrg;

import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.financeOrg.Service.AccountServiceImpl;
import com.coforge.financeOrg.Service.BranchServiceImpl;
import com.coforge.financeOrg.jdbc.DbConnect;

public class App {
	public static void main(String[] args) throws SQLException {
		
		DbConnect.dbConnect();
		AccountServiceImpl ac = new AccountServiceImpl();
		BranchServiceImpl bc = new BranchServiceImpl();

		

		while (true) {
			Scanner sc = new Scanner(System.in);

			
			System.out.println("Enter 1 for add detail\n"+"2 for display\n"+"3 for update");
			switch(sc.nextInt()) {
			case 1:
				boolean add=true;
				while(add) {
				System.out.println("ENTER 1 For Add Account AND 2 FOR Branch");
				switch (sc.nextInt()) {
				case 1:
					ac.addAccount();
					break;

				case 2:
					bc.addBranch();
					break;

				default: add=false;
						break;
				}
				}
				
			case 2:
				while(true) {
				System.out.println("ENTER 1 For Display Account AND 2 FOR Branch");
				switch (sc.nextInt()) {
				case 1:
					ac.displayAccount();
					break;

				case 2:
					bc.displayBranch();
					break;

				default:
					System.exit(0);
				}
				}
				
			case 3:
				while(true) {
				System.out.println("ENTER 1 For Update Account AND 2 FOR Branch");
				switch (sc.nextInt()) {
				case 1:
//					ac
					break;

				case 2:
					System.out.println("enter branch id to update name");
					String branchId=sc.next();
					bc.updateBranch(branchId);
					break;

				default:
					System.exit(0);
				}
				}
			
			default: System.exit(0);
			
			}

		}
	}
}
