package sw409.EmployeeTests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EmployeeCrudTests {
	@Test
	void testGetEmployees()
	{
		RestAssured.baseURI="http://midtermbackend-env.eba-8atwttu4.us-east-2.elasticbeanstalk.com/api/v1";
		RequestSpecification httpRequest = RestAssured.given();
		Response httpResponse = httpRequest.request(Method.GET,"/getEmployees");
		String res = httpResponse.getBody().asString();
		System.out.println("Response is: " + res);
		int statusCode = httpResponse.statusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	void testCreateEmployee()
	{
		RestAssured.baseURI="http://midtermbackend-env.eba-8atwttu4.us-east-2.elasticbeanstalk.com/api/v1";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("id", "15");
		requestParams.put("name", "Cher");
		requestParams.put("title", "CMO");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toJSONString());
		Response httpResponse = httpRequest.request(Method.POST, "/createEmployee");
		int statusCode = httpResponse.statusCode();
		String statusMessage = httpResponse.jsonPath().getString("status");
		String res = httpResponse.getBody().asString();
		System.out.println("Response is: " + res);
		Assert.assertEquals(statusCode, 200);
		//Assert.assertEquals(statusMessage, "success");
	}

	void testUpdateEmployee()
	{
		RestAssured.baseURI="http://midtermbackend-env.eba-8atwttu4.us-east-2.elasticbeanstalk.com/api/v1";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("id", "3");
		requestParams.put("name", "Tiemoko Soumano");
		requestParams.put("title", "CAO");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toJSONString());
		Response httpResponse = httpRequest.request(Method.PUT, "/updateEmployee/4");
		int statusCode = httpResponse.statusCode();
		String statusMessage = httpResponse.asString();
		String res = httpResponse.getBody().asString();
		System.out.println("Response is: " + res);
		Assert.assertEquals(statusCode, 200);
	}

	void testDeleteEmployees()
	{
		RestAssured.baseURI="http://midtermbackend-env.eba-8atwttu4.us-east-2.elasticbeanstalk.com/api/v1";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toJSONString());
		Response httpResponse = httpRequest.request(Method.DELETE, "/deleteEmployee/3");
		int statusCode = httpResponse.statusCode();
		String statusMessage = httpResponse.asString();
		String res = httpResponse.getBody().asString();
		System.out.println("Response is: " + res);
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(statusMessage, "success");
	}


}
