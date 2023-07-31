// abstract - keyword - used when one or methods we don't define but later sub classes can define/implement
// abstract calss can have non abstract methods - mix - only abstract - only non abstract
// but abstract methods exist only in abstract classes 
// when a sub class extends a abstract class - it must define its abstract methods - or it also becomes abstract class
// abstract class can not have objects
abstract class A 
{
    public abstract void run(); // abstarct method 
    public void show()
    {
        System.out.println("A in abstarct class");
    }
}
class B extends A 
{
    public void run()
    {
        System.out.println("say run");
    }
}
public class _36Abstract 
{
    public static void main(String args[])
    {
      A obj = new B();
      obj.run();
      obj.show();
    }
}
