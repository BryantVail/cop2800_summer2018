package cop2800_summer2018;


public class Character {
	//entity, something that describes a real thing
	/*
	 * optimize, link files, bite stream, 
	 */
	
	//DATA MEMBERS
	String Name;
	Character pNext;
	
	//Constructor
	public Character(){
		Name="";
		pNext = null;//has to be null until the object is instantiated
	}
	
	public Character(String name){
		this.Name = name;
		pNext = null;//has to be null until the object is instantiated
	}
	
	//llamda = function || object without a name
	
}
