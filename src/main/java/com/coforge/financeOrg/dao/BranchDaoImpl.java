package com.coforge.financeOrg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.coforge.financeOrg.beanClass.Branch;
import com.coforge.financeOrg.jdbc.DbConnect;

public class BranchDaoImpl implements BranchDao {
	private Branch b=null;
	Scanner sc=new Scanner(System.in);
	
	static Connection con=null;
	static PreparedStatement pst=null;
	static ResultSet rs=null;
	static Statement st = null;

	
	public void addBranch() throws SQLException {
		b=new Branch();
		System.out.println("Please enter BranchId, BranchName, BranchAddress");
		
		String BranchId = sc.next();
		String BranchName = sc.next();
		String BranchAddress =sc.next();
		
		b.setBranchId(BranchId);
		b.setBranchName(BranchName);
		b.setBranchAddress(BranchAddress);
		
		try {
			con=DbConnect.dbConnect();
			con.setAutoCommit(false);
			String str="insert into branch values(?,?,?)";
			pst=con.prepareStatement(str);
			pst.setString(1,BranchId);
			pst.setString(2, BranchName);
			pst.setString(3, BranchAddress);
			pst.executeUpdate();
			sc.close();
			System.out.println("data inserted");
		}
		catch(Exception e) {
			System.out.println("duplicate entry change branch id because branch already present");
			con.rollback();
		}
		finally {
			try {
				con.commit();
				pst.close();
				con.close();
			}
			catch (Exception e) {
				
			}
		}
	}

	public void displayBranch() throws SQLException {
		System.out.println("---------------Branch Details----------------");
		try {
			con = DbConnect.dbConnect();
			con.setAutoCommit(false);
			String query = "Select * from branch";
			st=con.createStatement();
			rs = st.executeQuery(query);
			System.out.println("display branch");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println("database empty");
			con.rollback();
		} finally {
			try {
				con.commit();
				pst.close();
				con.close();
			} catch (Exception e) {

			}
		}
	}
	
	public void updateBranch(String branchId) throws SQLException {
		
		try {
			con=DbConnect.dbConnect();
			con.setAutoCommit(false);
			String str="update branch set brName=? where brId=?";
			pst=con.prepareStatement(str);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter name of branch to updated");
			String name=sc.next();
			pst.setString(1, name );
			pst.setString(2,branchId);
			pst.executeUpdate();
			sc.close();
			System.out.println("Row updated");
		}
		
		catch(Exception e) {
			e.printStackTrace();
			con.rollback();
		}
		finally {
			try {
				con.commit();
				pst.close();
				con.close();
			}
			catch (Exception e) {
				e.printStackTrace();
				con.rollback();
				
			}
		}
		
	}
	
//	public String getBranchId() {
//	}

}
