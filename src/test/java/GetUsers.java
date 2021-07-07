import org.testng.Assert;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseLogSpec;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.JSONArray;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;


@Test
public class GetUsers {
	
	final String MAIN_URL = "https://reqres.in"; 		
	final String GET_ALL_USERS_URL = MAIN_URL + "/api/users?page=2";
	
	
	@Test
	public void getAllUsers() throws IOException {


		//Read Http Response
		
		URL url = new URL(GET_ALL_USERS_URL);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(url.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine+"\n");
            
        in.close();
        
   
    	//given().get(GET_ALL_USERS_URL).then().statusCode(200).log().all();
	}
}
