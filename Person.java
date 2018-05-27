//Bryant Vail
//pr1, Project 1, classes "Person", "Data", & "Main".
public class Person {
	private String firstName;
	private String lastName	;
	
	public Person() {
		initFirstName	();
		initLastName	();
		
	}
	
	public Person(String firstname, String lastname) {
		SetFirstName(firstname);
		SetLastName(lastname);
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
	
	//init first/last as ""
	public void initFirstName() {
		firstName	= "";
	}
	
	public void initLastName() {
		lastName = "";
	}//end initLastName
	
	@Override
	public String toString() {
		return ("Last: "+GetLastName()+", First: "+GetFirstName());
	}

}
