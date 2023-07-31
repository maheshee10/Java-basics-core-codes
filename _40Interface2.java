interface A 
{
   int age = 30;
   void show();
   void run();
}
 interface B 
 {
    void config();
    void maintaince();
 }
 interface X extends B // inherits methods of B into X 
 {
   
 }

 class C implements A,X,SAM // can implement multiple interfaces unlike abstract class -- can only extend one class

 {
    public void show()
    {
        System.out.println("showing ");
    }
    public void run()
    {
        System.out.println("running ");
    }
    public void config()
    {
        System.out.println("configuring ");
    }
    
    public void maintaince() {
        
        // throw new UnsupportedOperationException("Unimplemented method 'maintaince'");
    }
    @Override
    public void jump() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'jump'");
    }
    
 }
public class _40Interface2 
{
   public static void main(String args[])
   {
     A objC = new C();
     B objn = new C(); // because A does not know about config method in B
     objn.config();
     objC.show();
     objC.run();
     objn.maintaince();
     SAM objS;
     objS = new C();
     objS.jump();
    //  C obj = new C()
    //  {
    //     public void maintaince()
    //     {
    //         System.out.println("mainten charges");
    //     }
    //  };
    //  obj.maintaince();
   }  
}

// types of interfaces -- three
// interfaces only declaring - after 8 - option to define
// normal - two or more methods 
// functional or SAM - single abstract method
// marker - blank or no methods
// marker interfaces - useful - serialization and deserialisation concepts
// 
@FunctionalInterface //-- telss SAM is functional and have one abstract method
interface SAM 
{
    void jump();
}
// we can use lambda expression/functions only with Functional interfaces