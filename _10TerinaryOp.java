public class _10TerinaryOp 
{
    public static void main(String args[])
    {
        int n = 10;
        // terinary - condition?statement1:statement2;
        //if condition is true s1 is executed else s2
        String result = n%10==0?"even":"odd";
        System.out.println(result);
    }
}
