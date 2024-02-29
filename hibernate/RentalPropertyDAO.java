package com.wipro.hms.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
import com.wipro.hms.util.DBUtil;
import com.wipro.hms.bean.RentalPropertyBean;
public class RentalPropertyDAO {
public static String generatePropertyID(String city)
{
	String s=city.substring(0,3),pid=null;
	try
	{
		Connection con=DBUtil.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select rental_seq.nextvalue from dual");
		int seqno=0;
		while(rs.next())
		{
			seqno=rs.getInt(1);
		}
		pid=s.toUpperCase()+seqno;
		 
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return pid;
}
	
}
