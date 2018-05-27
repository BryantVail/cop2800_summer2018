//bryant vail
//static variables capatilized
import java.util.Random;
import java.util.Arrays;


public class Data {
    //data members
    public final int CONSTANT = 20;
    public int[]    ary ;
    public double   avg;
    public int      sum;

    //default constructor
    public Data(){
        ary = new int[CONSTANT];//explicitly initialized an array w/20 elements
        //ary = new Array();
        InitArray();
    }//end default constructor
    /*
        cannot return anything on a constructor
    */

    //MEMBERSHIP FUNCTIONS
    public void InitArray(){
        //7 & 13 characters 
        //Single Responsibility / what is the purpose
        for(int i = 0;i<CONSTANT;i++){
        	ary[i] = 0;		//array 20 elements, all of value 0.
        	/*
                pointing to a reference, where it resides in consecutive memory
                'i' is the "offset" of the array's memory location
            */
            
        }//end for
    }//end InitArray

     public void InitArrayRandom(){
            Random randm = new Random(-1);//troubleshoot the code w/-1 then change to conventioin date after perhaps
            for(int i = 0; i<CONSTANT; i++){
                ary[i] = randm.nextInt(100);

            }//end for
     }//end InitArrayRandom



    public void SortArray(){
        Arrays.sort(ary);
    }

    public void SumArray(){
    	int total = 0;
        
        for(int i = 0; i<CONSTANT; i++){
            
            total += ary[i];
        }
        sum = 0;
        sum = total;
    }//end SumArray()

    public void AverageArray(){

    }

    public void Display(){
        System.out.println(Arrays.toString(ary));
    }

    /*
        objects are always passed by reference
        parameters/arguments are passed by value
    */




}//end class Data

/*
 * 
 * Class Data shall have: 
 * 	an array of integers with ten elements.
	Initialize array auto to 0. 
	Initialize array with random numbers, 
		from 0 to 100.
	Sort the array.
		sum the array.
		average of the array.
		Print all data to console
			a method called Display().
 */



























