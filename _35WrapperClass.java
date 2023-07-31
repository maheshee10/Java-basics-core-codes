public class _35WrapperClass 
{
   public static void main(String args[])
   {
     int num = 6;
     System.out.println(num); // int primitive
     Integer num1 = num; // converting num as object - autoboxing
     System.out.println(num1); // object value
     int num2 = num1.intValue(); // getting int value of object - autounboxing
     System.out.println(num2); // int primitive

     // this Integer class is called as wrapper class
     // primitive datat types are not object oriented
     // some frameworks only on objects
     // arrays - can have primitives
     // but collections only work with objects
     // -- first primitives converted to classes which in turn extends Object class
     // for every primitive type there is a class Integer, Double, Char

     String name = "36";
     int x = Integer.parseInt(name); // converts string to Int then assign it to x
     System.out.println(name);
     System.out.println(x);


   }   
}
