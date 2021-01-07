package restAssured.api.projectScripts;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import restAssured.api.genericUtils.BaseAPIClass;
import restAssured.api.genericUtils.EndPoints;

public class GetSingleProjectWithProjectId extends BaseAPIClass{

	@Test
	public void getSingleProject()
	{
	    given()
	    .get(EndPoints.getProjects+"/TY_PROJ_403")
	    .then()
	    .log().all()
	    .assertThat().statusCode(200);
	    
	}
}
