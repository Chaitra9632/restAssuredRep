package restAssured.api.projectScripts;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import restAssured.api.genericUtils.BaseAPIClass;
import restAssured.api.genericUtils.EndPoints;
import restAssured.api.pojoclass.Project;
import static io.restassured.RestAssured.*;

public class AddSingleProjectWithCreated extends BaseAPIClass {
	
	@Test
	public void addSingleProject()
	{
		Project proj= new Project("chaitra","RMGantra","Created",10);
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
