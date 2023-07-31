// Enum is like class  except we can write named constants which acts as objects in a enum class
// these named constants are like objects with index values starting from zero -- ordinal() used to get index value

// in apps to return named constant output -- useful

// enums unlik class cannot extend a class 
// but  enums can have constructors, methods, variables, 
// by default enum extends Enum class in java.lang
// named constants - objects of enum class


enum Status 
// enum type Status class 
{
   Runnig, Jumping, Catching, Holding; //all these have static property 

}
enum Condition 
{
    Good, Bad, Ok, Better
}


public class _41Enum 
{
   public static void main(String args[])
   {
    Status s = Status.Catching; // s is a obj of type Status, which is a class of type enum
    // Status class - accessing Catching object
    Status ss[] = Status.values();
    // values() - gives all objects of Status class - as array
    for(Status m : ss)
    {
        System.out.println(m+":"+m.ordinal());
    }

    Condition a = Condition.Bad;
    if(a == a.Good) 
    {
        System.out.println("continue with project");
    }
    else if(a ==a.Better) // we can use object a to acces the objects of Condition enum or directly class Condition
    {
        System.out.println("Recheck process");

    }
    else if(a == Condition.Ok) // accesing using Condition class because thse are static
    {
        System.out.println("hold and rest");

    }
    else
    {
        System.out.println("cancel");
    }

    // switch case allows enum type 
    //byte , short , char , and int primitive data types. It also works with enumerated types 
     
    Condition b = Condition.Good;

    switch(b)
    {
        case Good:
        {
            System.out.println("continue with project");
            break;
        }
        case Better:
        {
            System.out.println("recheck with project");
            break;
        }
        case Ok:
        {
            System.out.println("pause with project");
            break;
        }
        default:
        {
            System.out.println("cancel with project");
            break;
        }
        
    }


    // enum class example 
    // enum cannot extend class but can create vars,methods,constructors 
    // enum extends Enum class -- Enum class extends Object class
       Machine mac = Machine.Probability;
       System.out.println(mac);
       System.out.println(mac.price);
    //    System.out.println(mac.);
    
   } 
   enum Machine
    {
        Python(5000), Statistics, Probability, ML(10000), AI(5000),DL(15000); //all these are objects
        private int price;
        // to assign values to the objects above we use constructor methods -- applying encapusatlion concept

        private Machine(int price) 
        {
            this.price = price;
        }
        private Machine() // this is the constructor // private only no public or protected is acceptble
        {
            price = 2500;
        }
        

    }   

}
