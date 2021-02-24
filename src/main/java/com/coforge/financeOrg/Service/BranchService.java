package com.coforge.financeOrg.Service;

import java.sql.SQLException;

public interface BranchService {
	public void addBranch() throws SQLException;
	public void displayBranch() throws SQLException;
	public void updateBranch(String branchId) throws SQLException;
}
