package com.wipro.hms.util;
import java.sql.*;
public class DBUtil {
public static Connection getConnection()
{
	Connection con=null;
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","SYSTEM","SYSTEM");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return con;
}
}
