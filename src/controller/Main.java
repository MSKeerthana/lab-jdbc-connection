package controller;

import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
	ConnectionManager conn = new ConnectionManager();
	Connection conncheck = ConnectionManager.getConnection();
	
	if(conncheck!=null)
		System.out.println("Connection Established");
	else
	    System.out.println("Check your connections");
	
	}
}
