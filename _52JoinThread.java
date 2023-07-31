
class Counter
{
	int count;
//	public void increment()
	public synchronized void increment() // makes thread safe // only one thread object operates on this method once
	{
		count++;
	}
}

public class _52JoinThread {
    public static void main(String[] args) throws InterruptedException{   
    	
    	Counter c=new Counter();
    	
    	Runnable obj1=()-> // using Runnable interface class 
    	{
//    		for(int i=1;i<=1000;i++)
    		for(int i=1;i<=10000;i++)
    		{
    			c.increment();
    		}
    	};
    	
    	Runnable obj2=()->
    	{
//    		for(int i=1;i<=1000;i++)
    		for(int i=1;i<=10000;i++)
    		{
    			c.increment();
    		}
    	};
    	
    	Thread t1=new Thread(obj1);
    	Thread t2=new Thread(obj2); // creates threasd object
    	 	
    	t1.start();
    	t2.start(); //beginning of thread 
    	
    	t1.join(); 
    	t2.join(); //ending of thread
    	
    	System.out.println(c.count);
    }
}