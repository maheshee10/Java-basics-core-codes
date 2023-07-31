class A 
{
    public A()

    {
        super();
        System.out.println("in A");

    }
    public A(int a)
   {
    super();
    System.out.println("in int A");
    System.out.println("a"+a);
   } 

    
}
class B extends A 
{
    public B()
    {
        super();
        System.out.println("iun B");
    }
    public B(int a)
   {
    //super(a);
    this();
    System.out.println("in int B");
    System.out.println("a"+a);
   } 
}
public class _30ThisandSuper 
{
public static void main(String args[])
    {
        B obj = new B(5);
        //B obj1 = new B();
        System.out.println("in main method");
    }
}
    

