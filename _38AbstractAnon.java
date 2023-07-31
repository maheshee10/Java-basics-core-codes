abstract class Robot
{
    public abstract void tell();
    public abstract void task();
}
public class _38AbstractAnon 
{
    public static void main(String args[])
    {
       Robot obj = new Robot()
       {
        public void tell()
        {
            System.out.println("make a rabot");
        }
        public void task()
        {
            System.out.println("robots config");
        }
       };
       obj.task();
       obj.tell();
    }
}
