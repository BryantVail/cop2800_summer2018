package cop2800_summer2018;


public abstract class Person {
	
	String FirstName = "";
	String LastName  = "";
	
	public Person(){
		FirstName 	= "";
		LastName	= "";
		
		System.out.println("Person:Default Constructor");
	}
	
	public Person(String firstName, String lastName){
		FirstName	= firstName;
		LastName	= lastName;
		System.out.println("Person");
	}
	

	
	
	// abstract methods are only in abstract classes; an abstract method requires the class be abstract.
	
	protected abstract void Display();
	

}
