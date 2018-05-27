//bryant vail
//static variables capatilized
import java.util.Random;
import java.util.Arrays;


public class Data {
    //data members
    public final int CONSTANT = 10;
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

    public int SumArrayInt(int[] arry){
    	int total = 0;
    	for(int i = 0;i<arry.length; i++) {
    		
    		total += arry[i];
    	}
    	return total;
    }//end SumArrayInt()
    
    public double SumArrayDbl(double[] arry) {
    	double total = 0;
    	for(int i = 0;i<arry.length; i++) {
    		
    		total += arry[i];
    	}
    	return total;
    }//end SumArrayDbl

    public double AverageArray(double[] theArray){
    	//locals
    	double arraySum;
    	int arrayLength = 0;
    	double average = 0;
    	
    	//denominator of Avg
    	arrayLength = theArray.length;
    	
    	//Numerator of Avg
    	arraySum = SumArrayDbl(theArray);
    	average = arraySum/arrayLength;
    	
    	return average;    	
    }//end AverageArray

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
 * 	an array of integers with ten elements.		xx	
	Initialize array auto to 0. 				xx	InitArray()
	Initialize array with random numbers, 		xx	InitArrayRandom()
		from 0 to 100.
	Sort the array.
		sum the array.							xx	SumArray()
		average of the array.					x
		Print all data to console				xx	public void Display(){				
			a method called Display().
 */











