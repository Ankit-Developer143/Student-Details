package com.student.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Collection;

public class DBConnection {
	static Connection dbconnect =null;
public static Connection getConnection() {
	try {
	Class.forName("com.mysql.jdbc.Driver");
	dbconnect=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_111", "root","root");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	return dbconnect;
	
}
}
