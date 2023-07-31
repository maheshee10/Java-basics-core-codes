/** Packages are like folder like structures used to store blocks of code files
 * to use classes of a packge we have to import that package and classes of that corresponding packge
 * package is the keyword to create pakge--typically - give -- .com.name
 * generally every class is written ina separate file
 * and every file is included in a package depending on requirement
 * -- keep classes always public
 * -- metthods also public
 * -- class instance variables private
 * -- only when we want to access our instance variables outside package in a sub class -- keep prottestced
 * -- avoid defalut
 * every class in java extends object class
 * every constructuctor have a super method
 * this() methodf used to call current class constructor
 * poly - morphism - behavior of objects in differen places depending on the type of instance it is created
 * -- two types of polymorphism - compile time - runtime -
 * overloading a method - compile time ... overriding a method is runtime 
 * dynamic dispatching a method is another run time polymorphism
 * it works only in case of inheritence 
 * say we have a super class A - subclasses B,C
 * we can create instance/object of this A with ref var obj of type A - stored in heap with address say 101 
 * so this obj refers to that 101 in main stack method
 * now create another obj of subclass B of type A -- object -- refers to instance of B address 
 * same as above for C 
 * so depending type of address obj refers to behavior and its methods varies\
 * 
 */
class A 
{
  public void show()
    {
        System.out.println("in A");
    }
}
class B extends A 
{
    public void show()
    {
        System.out.println("in B");
    }
}

class C extends A 
{
    public void show()
    {
        System.out.println("in C");
    }
}
public class _32DynamicMetho 
{
    public static void main(String args[])
    {
       C objC = new C();
       objC.show();

       // dynaic method dispatch
       A obj = new A();
       obj.show();

       obj = new B();
       obj.show();

       obj = new C();
       obj.show();
    }
    
}
// final - keyword - can be used with variables, methods, classes
// variable - final -- constamt - cannot be change - value
// method - final - eliminates - overiding option
// class - final - takes away - inheritence prop 