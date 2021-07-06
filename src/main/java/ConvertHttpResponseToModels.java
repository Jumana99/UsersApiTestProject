import java.io.IOException;
import java.net.*;
import java.nio.file.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;


public class ConvertHttpResponseToModels {

static String inputline = "";

    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	final String MAIN_URL = "https://reqres.in"; 		
    	final String GET_ALL_USERS_URL = MAIN_URL + "/api/users?page=2";
    	
    	try {
    		
    		URL url = new URL(GET_ALL_USERS_URL);
    		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    		connection.setRequestMethod("GET");
    		connection.connect();
    		
    		//Getting the response code
    		int responseCode = connection.getResponseCode();
    		
    		if (responseCode != 200) {
    			throw new RuntimeException("HttpResponseCode: " + responseCode);
    			
			        } else {
			        	
			        	Scanner scanner = new Scanner(url.openStream());

			            //Write all the JSON data into a string using a scanner
			            while (scanner.hasNext()) {
			                inputline += scanner.nextLine();
			               // System.out.println(inline);
			            }

			            //Close the scanner
			            scanner.close();
			            
			            //print all users 
			            List<User> usersList = convertURLResponseToUsersObjects();
			            for (User user: usersList) {
			    			System.out.println(user);
			    			System.out.println("------------------------------------------------------------------------\n\n");
			    		} 
			        
			        }

			    } catch (Exception e) {
			        e.printStackTrace();
			   }
}

			
public static  List <User> convertURLResponseToUsersObjects() throws ParseException {
	
	//Using the JSON simple library parse the string into a json object
	JSONParser parse = new JSONParser();
	JSONObject data_object = (JSONObject) parse.parse(inputline);
	JSONArray array = (JSONArray) data_object.get("data");
	List<User> usersList = new ArrayList<>();
	
	for (int i = 0; i < array.size(); i++) {
		JSONObject new_object = (JSONObject) array.get(i);
		String id = new_object.get("id").toString();
		String last_name = new_object.get("last_name").toString();
		String first_name = new_object.get("first_name").toString();
		String email = new_object.get("email").toString();
		String avatar = new_object.get("avatar").toString();
  
		//create object of user
		User user = new User (id, first_name, last_name, email, avatar);
		usersList.add(user);
       }	   
 return usersList;
    }					

}
			