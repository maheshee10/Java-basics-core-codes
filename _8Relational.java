public class _8Relational 
{
    public static void main(String args[])
    {
        int x = 6;
        int y = 8;
        double a = 6.89;
        double b = 5.99;
        //relational operators
        boolean result = x>y; //checking one condition
        //logical operators
        boolean r1 = x<y&a>b; //checking two conditions
        boolean r2 = x>y||a>b; // checks only one condition
        System.out.println(result);
        System.out.println(r1);
        System.out.println(r2);
        // ! reverse the bolean output i.e from true to false and vice versa
    }
}
