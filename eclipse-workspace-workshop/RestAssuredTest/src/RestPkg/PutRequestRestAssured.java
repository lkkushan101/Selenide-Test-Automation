package RestPkg;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class PutRequestRestAssured {
	@Test
	public void PostDetails()
	{   
		
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		RequestSpecification httpRequest = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Kushan"); // Cast
		requestParams.put("LastName", "Amarasiri");
		requestParams.put("UserName", "test123");
		requestParams.put("Password", "password1");
	 
		requestParams.put("Email",  "tester101@gmail.com");
		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.post("/register");
	 
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
	}
}
