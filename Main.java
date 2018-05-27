//bryant vail

public class Main{
    public static void main(String[] args){
    	
    	Person p1 = new Person("Bryant", "Vail");
    	Person p2 = new Person("Shirley", "Vail");
    	Person p3 = new Person("John", "Vail");
    	Person p4 = new Person("Lewis", "Vail");
    	Person[] persons = {p1,p2,p3,p4};
    	
    	
        //init array
        Data d = new Data();
        d.Display();

        //initRandom Array
        d.InitArrayRandom();
        d.Display();

        //Sort the Array
        d.SortArray();
        d.Display();
        //Display

        //Person[] pArray = new Person[4];//virtual memory referece "0x000000" == null (true)
        //pArray[0] = new Person("Snoopy", "Brown");

        //Person p1 = new Person("Snoopy", "Brown");
        //pArray[1] = p1;
        //llambda, object w/out a name
        //Noem chompsky
        //problems: tractable, solve in a reasonable amount of time
        //          intractable


    }//end main
}//end public class main

/*
 * 
 * 	Class Main shall only have one method, 
 * 		main()
	main() shall 
		create 
			four objects of 
				type Person and they shall be 
				stored to an array.

	The array should be 
		part of the Class Main.
 */



















