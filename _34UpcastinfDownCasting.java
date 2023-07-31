class A
{
  public void show()
  {
    System.out.println("A");
  }
}
class B extends A
{
  public void show1()
  {
    System.out.println("B");
  }
}
public class _34UpcastinfDownCasting 
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.show();
        // obj.show1(); // doesnt work cause A doesnt know B exist
        A obj1 = new B(); // this is downcasting sone implicitly
        // heere A obj1 = (A) new B(); 
        // implies obje or instance of B is type caste of type A and assigned to ref variable obj1 of A
        obj1.show();
        // obj1.show1(); // still doesnt work because even though object belongs to B it still of A type
        obj =  new B(); //--- this is upcasting object is of B but variable is of A type
        obj1 = new B();
        // in below line we taking new ref and aSSIGNING TO IT object of A after downcasting it to B type
        B obj2 = (B) obj; //-- this is downcasting object is of A but downcasted and assigned to variable of B types
        obj2.show1();



    }
}
