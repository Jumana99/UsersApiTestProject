
public class User {
	
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String avatar;
	private int counter;
	
	


public User(int counter, String id, String firstName, String lastName, String email, String avatar) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.avatar = avatar;
		this.counter = counter;
	}


public String getId() {
	return id;
}




public void setId(String id) {
	this.id = id;
}




public String getFirstName() {
	return firstName;
}




public void setFirstName(String firstName) {
	this.firstName = firstName;
}




public String getLastName() {
	return lastName;
}




public void setLastName(String lastName) {
	this.lastName = lastName;
}




public String getEmail() {
	return email;
}




public void setEmail(String email) {
	this.email = email;
}




public String getAvatar() {
	return avatar;
}




public void setAvatar(String avatar) {
	this.avatar = avatar;
}




public int getCounter() {
	return counter;
}




public void setCounter(int counter) {
	this.counter = counter;
}




public String toString() {
		
		return "User ["+counter+"] {\nID Number: "+id+ "\nFirst Name: "+firstName+"\nLast Name: "
		+lastName+"\nEmail Address: "+email+"\nAvatar: "+avatar+"}\n";
	}
	

}
