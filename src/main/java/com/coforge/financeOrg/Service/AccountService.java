package com.coforge.financeOrg.Service;

import java.sql.SQLException;

public interface AccountService {
	public void addAccount() throws SQLException;
	public void displayAccount() throws SQLException;
	public void updateAccount(String accId) throws SQLException;


}
