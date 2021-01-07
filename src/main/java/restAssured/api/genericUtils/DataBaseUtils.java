package restAssured.api.genericUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtils {


	
	static Connection con = null;
	static ResultSet result = null;

	//open database connection	
	public static void connectToDB() {
		Driver driverRef;
		try {
			driverRef = new Driver();
			DriverManager.registerDriver(driverRef);
			con = DriverManager.getConnection(Iconstants.dbURL, Iconstants.dUname, Iconstants.dbPword);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	}
	
	//close database connection
	public static void closeDb() throws SQLException {
		con.close();
	}
	
	//execute a query in database
	public static ResultSet executeQuery(String query)
	{
		try {
			// executing the query
			 result = con.createStatement().executeQuery(query);
			 return result;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			 
				
			
		}
		return result;
	}
	
	
	//execute a query and get the data from database
	
	public static  String executeQueryAndGetData(String query ,int columnName , String expectedData) throws Throwable{
        boolean flag = false;
			result = con.createStatement().executeQuery(query);
			
		while (result.next()) {
			  		if(result.getString(columnName).equals(expectedData)) {
			  			flag= true;
			  			break;
			  		}
		}
			
		
		if(flag) {
			System.out.println(expectedData + "===> data verified in data base table");
			return expectedData;
		}else {
			System.out.println(columnName + "===> data not verified in data base table");
			return expectedData;
		}
		
	}
}


