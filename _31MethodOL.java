import java.math.*;
class Cal 
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}
class AdvCal extends Cal 
{
    public int add(int n1, int n2)
    {
        return (int) (n1+n2+Math.PI);
    }
}

public class _31MethodOL  
{
    public static void main(String args[])
    {
        AdvCal obj1 = new AdvCal();
        Cal obj2 = new Cal();
        int r1 = obj1.add(5,4);
        int r2 = obj2.add(5,4);
        System.out.println(r1+";"+r2);
    }
}
// overriding methods names and params must match
//static methods cannot overrride