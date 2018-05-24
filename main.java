//bryant vail
//static variables capatilized
public class Data {
    //data members
    public final int CONSTANT = 20;
    public int[] ary ;

    //default constructor
    public Data(){
        ary = new int[CONSTANT];//explicitly initialized an array w/20 elements
        //ary = new Array();
        //ary was
    }//end default constructor
    /*
        cannot return anything on a constructor
    */

    //MEMBERSHIP FUNCTIONS
    public void InitArray(){
        //7 & 13 characters 
        //Single Responsibility / what is the purpose
        for(int i = 0;i<CONSTANT;i++){
            /*
                pointing to a reference, where it resides in consecutive memory
                'i' is the "offset" of the array's memory location
            */
            ary[i] = 0;

        }//end for


    }//end InitArray







}
























