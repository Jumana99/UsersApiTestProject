import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;


@Test
public class GetAllUsers {
	
	
	final String URL = "https://reqres.in/api/users?page=2";
	final int id = 7;
	
	
	@Test
	public void getAllUsers() {

		given().get(URL).then().statusCode(200).body("data.id[0]", equalTo(id)).log().all();
		//body("data.first_name", hasItems("Michael","Lindsay")).
		
	}
}
