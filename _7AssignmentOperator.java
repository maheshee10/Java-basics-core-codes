public class _7AssignmentOperator 
{
    public static void main(String args[])
    {
        int num1 = 9; //Assignment
        int num2 = 34;
        int result = num1+num2; //add
        int result1 = num1-num2; //sub
        int result2 = num1*num2; //mul
        int result3 = num1/num2;//div - gives quotient
        int result4 = num1%num2;//gives remainder

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        //increment
        //post increment same with -- for decrement
        int num3 = 4;
        //in post increment first variable is fetched then incrementwed 
        System.out.println(num3++);
        int a = num3;
        System.out.println(a);
        //preincrement 
        int num4 = 5;
        //in pre increment value is incremented first and then fetched to variable
        
        System.out.println(++num4);
        int b = num4;
        System.out.println(b);

        //assigning 
        int c = 8;
        c+=4; //same with -= /= *= %= <<= >>= >>>=
        System.out.println(c);


    }
}
