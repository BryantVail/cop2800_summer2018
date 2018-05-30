//Bryant Vail
package cop2800_summer2018;

public class Main {

	public static void main(String[] args) {
		// names are getting int he way
		Character p1 = new Character("Snoopy");
		Character p2 = new Character("Garfield");
		
		Character[] ary  = new Character[4];//no characters in array, declared memory space, enough space to hold 4 "Characters"
		ary[0] = p1;
		ary[1] = p2;
		
		System.out.println(p1.Name);
		System.out.println(p2.Name);

	}

}
