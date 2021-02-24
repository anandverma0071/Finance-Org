package com.coforge.financeOrg.Service;

import java.sql.SQLException;

import com.coforge.financeOrg.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService{

	private AccountDaoImpl ad=null;
	
	public AccountServiceImpl() {
		ad=new AccountDaoImpl();
	}
	public void addAccount() throws SQLException {
		ad.addAccount();
	}

	public void displayAccount() throws SQLException {
		ad.displayAccount();
	}
	public void updateAccount(String accId) throws SQLException{
		
	}
	
}
