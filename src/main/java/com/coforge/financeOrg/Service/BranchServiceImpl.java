package com.coforge.financeOrg.Service;

import java.sql.SQLException;

import com.coforge.financeOrg.dao.BranchDaoImpl;

public class BranchServiceImpl implements BranchService{

	private BranchDaoImpl bd=null;
	
	public BranchServiceImpl(){
		bd=new BranchDaoImpl();
	}
	
	public void addBranch() throws SQLException {
		bd.addBranch();
	}

	public void displayBranch() throws SQLException {
		bd.displayBranch();
	}

	public void updateBranch(String branchId) throws SQLException {
		bd.updateBranch(branchId);
	}

}
