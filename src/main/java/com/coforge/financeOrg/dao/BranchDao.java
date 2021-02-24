package com.coforge.financeOrg.dao;

import java.sql.SQLException;

public interface BranchDao {
	public void addBranch() throws SQLException;
	public void displayBranch() throws SQLException;
	public void updateBranch(String branchId) throws SQLException;
}
