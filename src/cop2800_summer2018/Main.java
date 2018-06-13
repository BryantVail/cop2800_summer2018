//Bryant Vail
package cop2800_summer2018;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// names are getting int he way
		
		Character[] ary  = new Character[4];//no characters in array, declared memory space, enough space to hold 4 "Characters"
		
		ary[0] = new Character("Snoopy");
		ary[1] = new Character("Garfield");
		
		//array list = 
		
		
		System.out.println(ary[0]);
		System.out.println(ary[1]);
		
		ArrayList<Character> CharacterList = new ArrayList<Character>(4);//Size defined, but the size can change, 
		
		CharacterList.add(new Character("Snoopy"));
		//ALERT ALERT, ^ above method can be used dynamically when "Snoopy" is a parameter
		CharacterList.add(new Character("Garfield"));
		CharacterList.add(new Character("Bugs"));
		CharacterList.set(0,new Character("broomfield"));
		
		for(int i = 0; i<CharacterList.size(); i++){
			System.out.println(CharacterList.get(i).Name);
		}//end for
		
		Character pList = new Character("Snoopy");
		
		pList.pNext = new Character("Garfield");
		pList.pNext.pNext = new Character("Tweety");
<<<<<<< HEAD
=======
		
		Character pL;
		pL = pList;
		
		pL.pNext = new Character("Garfield");
		pL  = pL.pNext;
		
		while(true){
			if(pL.pNext == null){
				break;	
			}
			System.out.println(pL.Name);
			pL = pL.pNext;
			
		}
		
		
		

>>>>>>> 0ebf8a320219d39c4909aa7c31040a126f110de0
	}

}
