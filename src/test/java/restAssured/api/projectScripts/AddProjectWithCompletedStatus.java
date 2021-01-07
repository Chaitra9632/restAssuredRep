package restAssured.api.projectScripts;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import restAssured.api.genericUtils.BaseAPIClass;
import restAssured.api.genericUtils.EndPoints;
import restAssured.api.pojoclass.Project;

public class AddProjectWithCompletedStatus extends BaseAPIClass {
	
	@Test
	public void addProjectwithCompleted()
	{
		Project proj = new Project("Chaitra","RMGYantra-Test","Completed",25);
		given()
			.contentType(ContentType.JSON)	
			.body(proj)
		.when()
			.post(EndPoints.addProjecttest)
		.then()
			.log().all()
			.assertThat().statusCode(201);
	}

}
