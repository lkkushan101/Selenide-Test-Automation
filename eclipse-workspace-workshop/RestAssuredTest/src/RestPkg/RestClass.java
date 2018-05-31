package RestPkg;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestClass {

	@Test
	public void GetWeatherDetails()
	{   
		
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

		
		RequestSpecification httpRequest = RestAssured.given();

		
		Response response = httpRequest.request(Method.GET, "/Pune");
        
		int statusCode = response.getStatusCode();
			
		String responseBody = response.getBody().asString();
		
		assertEquals(statusCode, 200);
		Assert.assertEquals(responseBody.toLowerCase().contains("pune") , true , "Response body contains P");
	

	}

}