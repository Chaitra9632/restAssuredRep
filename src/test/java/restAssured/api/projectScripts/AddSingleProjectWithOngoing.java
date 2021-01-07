package restAssured.api.projectScripts;

import org.testng.annotations.Test;

import restAssured.api.genericUtils.BaseAPIClass;
import restAssured.api.pojoclass.Project;

public class AddSingleProjectWithOngoing extends BaseAPIClass {
	
	@Test
	public void addSingleProjectWithOngoingStatus()
	{
		Project proj = new Project("chaitra123","RMGYantra","On Going",12); 
		
	}

}
