package jdbc;
import java.sql.*;
import java.io.*;
public class JDBC {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=null;
		con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","SYSTEM","SYSTEM");
		Statement st=con.createStatement();
		/*st.executeUpdate("create table studen(id number,name varchar2(10),marks number)");*/
		PreparedStatement p=con.prepareStatement("insert into studen values(?,?,?)");
		p.setInt(1,1);
		p.setString(2,"ram");
		p.setInt(3,90);
		p.executeUpdate();
		p.setInt(1,2);
		p.setString(2,"gopi");
		p.setInt(3,80);
		p.executeUpdate();
		ResultSet rs=st.executeQuery("select * from studen");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}

	}

}
