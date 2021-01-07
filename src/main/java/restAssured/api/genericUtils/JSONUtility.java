package restAssured.api.genericUtils;

import io.restassured.response.Response;

public class JSONUtility {

	public String getJSONPath(String jsonXpath, Response resp)
	{
		String jsonData = resp.jsonPath().get(jsonXpath);
		return jsonData;
	}
}
