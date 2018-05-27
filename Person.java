
public class Person {
	private String firstName;
	private String lastName	;
	
	public Person() {
		initFirstName	();
		initLastName	();
		
	}
	
	//Get/Set FirstName
	public String GetFirstName() {
		return this.firstName;
	}
	
	public void SetFirstName(String first) {
		this.firstName = first;
	}
	
	//Get/Set LastName
	public String GetLastName() {
		return this.lastName;
	}
	
	public void SetLastName(String last) {
		this.lastName = last;
	}
	
	public void initFirstName() {
		firstName	= "";
		
	}
	
	public void initLastName() {
		lastName = "";
	}

}
