// multiple inheritence is not possible in java
// to inherit a super class along with a thread becomes in this case
// Thread is class -- implements Runnable and Runnable has a run()
// instead of extending Thread we can implemetn Runnable interface

// in Runnable interface we dont have the start()
class Z
{

}
class A implements Runnable // this class becomes a Runnable class
{

    @Override
    public void run() {
         try{
            for(int i =1;i<=10;i++)
    {
      System.out.print("hello");
      System.out.println();
      Thread.sleep(5);
    }
            
           // throw new UnsupportedOperationException("Unimplemented method 'run'");
            

        }
        
        
        
        catch(Exception e)
        {
            System.out.println();
           System.out.println(e);
        }
       
    }
    
}
class B implements Runnable 
{

    @Override
    public void run() {
 try{
    for(int i =1;i<=10;i++)
    {
      System.out.print("hai");
      System.out.println();
      Thread.sleep(2);
    }
            
           // throw new UnsupportedOperationException("Unimplemented method 'run'");
           

        }
        
        
        
        catch(Exception e)
        {
             System.out.println();
           System.out.println(e);
        }
    }
    
}
public class _49Runnable 
{
    public static void main(String args[])
    {
        A t1 = new A();
        B t2 = new B();

        t1.run();
        
        t2.run();
    }
}
