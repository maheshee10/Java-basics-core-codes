// Interface : -- tells the path -- what methods needs to be used -- doesnt care about implementatio
// Interface - consits of only abstract methods 
// class - extends class .... class - implements interface.... interface extends interface
// interface is similar to class except it has only abstarct methods 
// when a class is extended - it inherits all variable and methods 
// when a inheritence is implemented it implements only methodfs
// interface - methods by default -- will have -- public and abstract
// interface - all the variables - final and static 

// class Computer
// {
//  public void code()
//  {

//  }
// }

// class Desktop extends Computer
// {
//     public void code()
//     {
//         System.out.println("coding, learning, robust");
//     }
// }
// class Laptop extends Computer
// {
//     public void code()
//     {
//          System.out.println("coding, learning");
//     }
   
// }
// class Developer
// {
//     public void Devaps(Computer device )
//     {
//         device.code();
//       //Sysytem.out.println("Devlop Apps using Java lang");
//     }
// }

// public class _39Interface  
// {
//     public static void main(String args[])
//     {
//         Computer lap = new Laptop();
//         Computer desk = new Desktop();
//     //     Desktop desk = new Desktop();
//     // //     Laptop lap = new Laptop();
//         Developer mahesh = new Developer();
//        mahesh.Devaps(lap);
//        mahesh.Devaps(desk);

//     }
// }
interface A // only abstract methods no other methods and methods donot have any body
{
    void show();
    void config();
    void run();
    int age = 34; //final and static
    String name = "njk"; // final and static -- can be acced directly by A interface but cannot be changed
}
class B implements A // implements only methods of interface A but not its variables
{
    public void show()
    {
        System.out.println("Shw all the contents");
    }
    public void config()
    {
        System.out.println("accepts all the contents");
    }
    public void run()
    {
        System.out.println("run all the contents");
    }
}
public class _39Interface  
{
  public static void main(String args[])
  {
     A obj ; // Interface like abstarct class cannot have object instatnitaed -- so it is either implementwed by a class 
     //or anonymous abstarct class execution
     obj = new B(); //obj B of type A interface
     obj.config();
     obj.run();
     obj.show();
    System.out.println(A.name);
    String y = A.name; // A interface

     DL objDL = new DL() //used anon abstarct/interface implementation of Machine interface subclass ki subclass DL
     // by doing this we can call all super interfaces and super class methods
     {
       public String op()
       {
         return "here we go";
       }
     };
     objDL.disp();
     objDL.stat();
     


  }
}
interface Machine
{
    int stat();
    void disp();
    String op();
}
// interface classification extends Machine
// {
//     public int ();
//     // {
//     //     return (2*2);
//     // }

// }
abstract class Alg implements Machine
{
    public int stat()
    {
        System.out.println("stat is working");
        return 2*2;
        
    }
}
abstract class DL extends Alg
{
  public void disp()
  {
    System.out.println("trying to work");
  }
}