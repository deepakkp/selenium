package CrmTest1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
    String dbURL="jdbc:sqlserver:// btptal005/tlmain";
    String username = "sa";
    String password="Talisma123";
  //Load MS SQL JDBC Driver
    Class.forName("net.sourceforge.jtds.jdbc.Driver");
    //Creating connection to the database
    Connection con = DriverManager.getConnection(dbURL,username,password);
    Statement st = con.createStatement();
	String selectquery = "SELECT * FROM tblcase WHERE aglobalcaseid=1013";
    
	ResultSet rs = st.executeQuery(selectquery);
	//While loop to iterate through all data and print results
	while (rs.next()) {
		System.out.println(rs.getString("transaction_datetime"));
	}
	con.close();
	}

}
