package com.coforge.financeOrg.dao;

import java.sql.SQLException;

public interface AccountDao {
	public void addAccount() throws SQLException;
	public void displayAccount() throws SQLException;
	public void updateAccount(String accId) throws SQLException;

}
	
	
