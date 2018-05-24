//bryant vail

public class Main{
    public static void main(String[] args){
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

        Person[] pArray = new Person[4];//virtual memory referece "0x000000" == null (true)
        pArray[0] = new Person("Snoopy", "Brown");

        Person p1 = new Person("Snoopy", "Brown");
        pArray[1] = p1;
        //llambda, object w/out a name
        //Noem chompsky
        //problems: tractable, solve in a reasonable amount of time
        //          intractable


    }//end main
}//end public class main
























