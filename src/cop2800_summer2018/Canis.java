//Bryant Vail, 06172018
public class Canis extends Mammal {

	int 		TeethCount;
	boolean 	Carnivore;
	boolean 	Vegetarian;
	String		Gender;
	
	public Canis() {
		TeethCount		= 0;
		Carnivore		= false;
		Vegetarian		= false;
		Gender			= "";
	}
	public Canis(int teethCount) {
		TeethCount		= teethCount;
		Carnivore		= false;
		Vegetarian		= false;
		Gender			= "";
	}
	public Canis(int teethCount, boolean carnivore) {
		TeethCount		= teethCount;
		Carnivore		= carnivore;
		Vegetarian		= false;
		Gender			= "";
	}
	public Canis(int teethCount, boolean carnivore, boolean vegetarian) {
		TeethCount		= teethCount;
		Carnivore		= carnivore;
		Vegetarian		= vegetarian;
		Gender			= "";
	}
	public Canis(int teethCount, boolean carnivore, boolean vegetarian, String gender) {
		TeethCount		= teethCount;
		Carnivore		= carnivore;
		Vegetarian		= vegetarian;
		Gender			= gender;
	}
	
	//abstract contracts
	public void Speak() {
		System.out.println("Woof");
	}
	
	//methods
	@Override
	public String toString() {
		return(this.TeethCount+", "+this.Carnivore+", "+this.Vegetarian+", "+this.Gender);
	}
}
