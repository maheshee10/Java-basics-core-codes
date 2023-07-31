class Mobile
{  
    //instance variable
    int price;
    String brand; //declaring instance variable
    int salecount = 6;//initialising instance variable
    //static variable
    static String category = "Smart Phone"; //this variable and its value is shared among all the code
    //printing in a clss without main method
    //no other statements except variables declaration or initialisation is allowed in java
    {System.out.println(category);} //this {} is instance initialiser
    //print method 
    public void show()
    {
        System.out.println(price +" "+brand+" "+salecount+" "+category); //static varible used in non static method
    }

    //intialising instance variables using constructor method

    public Mobile()
    {
        price = 10000;
        brand = "Apple";
        System.out.println("in the constructor");
    }
    //static block gets loaded only once
    //and its loaded only when the class is loaded
    //when declared static.. variables or methods gets loaded only once when the class is loaded
    //when a method is declared static obj is not needed to call that method
    //since static variables universal and loaded when class is loaded they should
    //be called with their class names only not object names
    //nonstatic things called using objects and statics called using class name
    static
    {
      System.out.println("in the static block");
    }
    public static void show1(Mobile obj)
    {
      System.out.println(obj.price +" "+obj.brand+" "+obj.salecount+" "+category); //accepting non static in static by passing obj parameter in method

    }

}
class Simple
{
    static int run = 25;
    public static void main(String o)
    {}
  static
  {
    System.out.println("in the simple static block");
    System.out.println(run);
  }
}
public class _25Static 
{
    public static void main(String args[]) throws ClassNotFoundException
    {
      Mobile obj1 = new Mobile();
      obj1.brand = "Real me";
      obj1.price = 15000;
      obj1.salecount = 12;
      obj1.show();
      Mobile obj2 = new Mobile();
      obj2.brand = "Samsung";
      obj2.price = 20000;
      //since category is static calling it with its class is correct way
      Mobile.category = "Tab";//changing static varible changes value for all others
      obj2.show();
      obj1.show();
      //when an object is created two things happen its class gets loaded by class loader in jvm
      //and when class is loaded along with it all static blocks and variables loaded and they load only once 
      //to load a class without objects we use Class "Class" with method "forName(Class name)"
      Mobile mob[] = new Mobile[2];
      mob[0] = obj1;
      mob[1] = obj2;
      for(Mobile m:mob)
      {
        System.out.print(m.brand+" "+m.price+" "+m.salecount+" "+Mobile.category);
        System.out.println();
      }
      
      Class.forName("Simple");

     //static is called before any object because they are loaded the moment a class is loaded not when it is called
     //dynamic loading class gets loaded only when it is loaded /called/used
     Mobile.show1(obj1);
     Mobile.show1(obj2);



    }
    //this class is not loaded in any way in main method therefor this static block is not executed 
    class Check
    {
        static
        {
            System.out.println("in the check static block without class being loaded");
        }
    }

    
}
