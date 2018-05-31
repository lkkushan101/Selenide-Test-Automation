package UniRESTJava;
import static org.testng.Assert.*;
import org.testng.annotations.*;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
public class UNIRestClass {
	@Test
	public void shouldReturnStatusOkay() throws UnirestException {
	    HttpResponse<JsonNode> jsonResponse1 
	      = Unirest.post("http://restapi.demoqa.com/customer")
	      .header("accept", "application/json")
	      .field("FirstName", "Virender")
	      .field("LastName", "Singh")
	      .field("UserName", "simpleuser001")
	      .field("Password", "password1")
	      .field("Email",  "someuser@gmail.com")
	      .asJson();
	 
	    assertEquals(200, jsonResponse1.getStatus());
	    System.out.println(jsonResponse1.getBody());
	  
	}
}
