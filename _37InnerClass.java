class A // only inner classes can be declared static not outer
{
    int a;
    public void show()
    {
        System.out.println("A ahow");

    }
    class B // inner class - accesd using - either using object of A since it belongs to A or if its static directly class A

    {
        int b;
        public void show()
        {
            System.out.println("in show B");

        }
    }
    static class C 
    {
        public void show()
        {
            System.out.println("in Show C");
        }
    }
    // class D 
    // {
    //     public void run()
    //     {
    //         System.out.println("run");
    //     }
    // }
    //public void run() {
    //}
}
class AI 
{

    public void run() {
    }

}
public class _37InnerClass 
{
  public static void main(String args[])
  {
    A obj = new A();
    obj.a = 45;
    obj.show();

    A.B objB = obj.new B();
    objB.show();

    A.C objC = new A.C();
    objC.show();

     // anonymopusly creating a class and giving its implementation directly to obj1 of A
    // here obj1 directly implements following class code block without calling class A block
    AI objAI = new AI()
    {
      public void run()
        {
            System.out.println("run");
        }
    };
    objAI.run(); //this method should be clreated originally in AI class only its implementation changes
    




  }   
}
