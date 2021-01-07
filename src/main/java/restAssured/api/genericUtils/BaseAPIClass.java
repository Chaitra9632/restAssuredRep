package restAssured.api.genericUtils;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class BaseAPIClass {
	
	@BeforeSuite
	public void configBeforeSuite() {
		baseURI = "http://localhost";
		port = 8084;
		
		DataBaseUtils.connectToDB();
	}
	
	@AfterSuite
	public void configAfterSuite() throws SQLException {
		DataBaseUtils.closeDb();
	}

}
