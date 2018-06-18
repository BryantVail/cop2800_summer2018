//Bryant Vail, 06172018

public abstract class Mammal {
	String 	Species;
	int		LifeExpectancy;
	boolean	Aerial;
	
	
	public Mammal() {
		Species 		= "";
		LifeExpectancy	= 0;
		Aerial			= false;
	}
	public Mammal(String species) {
		Species			= species;
		LifeExpectancy 	= 0;
		Aerial			= false;
	}
	public Mammal(String species, int lifeExpectancy) {
		Species			= species;
		LifeExpectancy	= lifeExpectancy;
		Aerial			= false;
	}
	public Mammal(String species, int lifeExpectancy, boolean aerial) {
		Species			= species;
		LifeExpectancy	= lifeExpectancy;
		Aerial			= aerial;
	}
	
	//Methods
	@Override
	public String toString() {
		return (this.Species + ", "+ this.LifeExpectancy +", "+this.Aerial);
	}
	public abstract void Speak();
	
	
	
	
	
	
	
	
	
}
