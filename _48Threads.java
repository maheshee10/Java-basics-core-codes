// threads - breaking software in small units - each thread is a unit - working parallel - sharing resources
// doing tasks independently - individually
// threads - Threads class - start() - join() - sleep()
// mostly frameworks we use in building apps -- builds threads for us
class Hi extends Thread
{
    public void run() // overriding run method
    {
        for(int i = 1; i<=10; i++)
        {
            System.out.println("hi");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
class Hello extends Thread 
{
    public void run() // 
    {
        for(int i = 1; i<=10; i++)
        {
            System.out.println("hello");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
public class _48Threads 
{
    public static void main(String args[])
    {
        Hello t1 = new Hello();
        Hi t2 = new Hi();

        System.out.println(t1.getPriority()+t2.getPriority()); // range of priority goes from 1-10 ;; 1- least 10 max

        t2.setPriority(Thread.MAX_PRIORITY); // suggests it as main priority but cannot force it as main priority


        t1.start();
        
        t2.start();

        
    }
}
