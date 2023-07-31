public class _11Switch 
{
    public static void main(String args[])
    {
        int n =5;
        // only PrintStatement with n value matching gets executed
        // n is 5 so n==5 gets executed
        if(n==1)
        System.out.println("Monday");
        else if(n==2)
        System.out.println("Tuesday");
        else if(n==3)
        System.out.println("Wedday");
        else if(n==4)
        System.out.println("Thuday");
        else if(n==5)
        System.out.println("Firday");
        else if(n==6)
        System.out.println("Satday");
        else if(n==7)
        System.out.println("Sunday");
        else
        System.out.println("Out of Range");

        //Switch case block value expresiion n checks with values of each case the moment it matches the case value from there entire block is executed
        // to break out of block we use 'break keyword'
        switch(n)
        {
        case 1:
        System.out.println("Monday");
        break;
        case 2 :
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wedday");
        break;
        case 4:
        System.out.println("Thuday");
        break;
        case 5:
        System.out.println("Firday");
        break;
        case 6:
        System.out.println("Satday");
        break;
        case 7:
        System.out.println("Sunday");
        default:
        System.out.println("invalid input"); //in case of no value of switch matches with case value
        
        }

    }
}
