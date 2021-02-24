package com.coforge.financeOrg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Scanner;

import com.coforge.financeOrg.beanClass.Account;
import com.coforge.financeOrg.jdbc.DbConnect;

public class AccountDaoImpl implements AccountDao{
	private Account a=null;
	Scanner sc=new Scanner(System.in);

	static Connection con=null;
	static PreparedStatement pst=null;
	static ResultSet rs=null;
	static Statement st = null;


	public void addAccount() throws SQLException {
		a=new Account();
		System.out.println("Please enter AccNo, AccType, Customer Id, Branch Id");
		int accNO=sc.nextInt();
		String accType=sc.next();
		String cId=sc.next();
		String bId=sc.next();
		
		try {
			con=DbConnect.dbConnect();
			con.setAutoCommit(false);
			String str="insert into accountdetail values(?,?,?,?)";
			pst=con.prepareStatement(str);
			pst.setInt(1,accNO);
			pst.setString(2, accType);
			pst.setString(3, cId);
			pst.setString(4,bId);
			pst.executeUpdate();
			sc.close();
			System.out.println("data inserted");
		}
		catch(Exception e) {
			System.out.println("duplicate entry change acc no because account already present");
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
	

	public void displayAccount() throws SQLException {
		System.out.println("---------------Account Details----------------");
		try {
			con = DbConnect.dbConnect();
			con.setAutoCommit(false);
			String query = "Select * from accountdetail";
			st=con.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3)+" : "+rs.getString(4));
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


	public void updateAccount(String accId) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
