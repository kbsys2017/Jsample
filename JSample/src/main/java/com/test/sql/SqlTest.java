package com.test.sql;

import java.sql.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlTest {

	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found " + e);
		}
		System.out.println("JDBC Class found");
		int no_of_rows = 0;

		try {
			Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QT19SU3\\TESTSQL;Database=Test;","sa","Winter2018");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM dbo.employees");
			while (rs.next()) {
				no_of_rows++;
			}
			System.out.println("There are " + no_of_rows + " record in the table");
		} catch (SQLException e) {
			System.out.println("SjQL exception occured" + e);
		}
	}

}


//jdbc:sqlserver://{DESKTOP-QT19SU3}\\TestSQL:1433