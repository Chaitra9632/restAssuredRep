package restAssured.api.projectScripts;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import restAssured.api.genericUtils.BaseAPIClass;
import restAssured.api.genericUtils.EndPoints;

public class GetAllProjects extends BaseAPIClass {
	
	@Test
	public void getAllProjects()
	{
		given()
		.get(EndPoints.getProjects)
		.then()
		.log().all()
		.assertThat().statusCode(200);
		
	}
}
