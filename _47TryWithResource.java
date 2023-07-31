import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _47TryWithResource 
{
    public static void main(String args[])
    {
        int num = 0;
        BufferedReader bf = null; // initialising a object ref variable
        try
        {
            System.out.println("enter a value :");
            InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(in);
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
          System.out.println("in try block");
        }
        // we can use try without catch block -- use finally instead
        // why if we have statements that have to be executed irrespective try or catch execution
        // say if exception -- catch executes but try doesnt -- no exception - try executesd but no catch
        // either try executes or finally executes but not both-- we can execute such scenario using finally block
        catch(Exception e) 
        {
            System.out.println("in catch block");
        }
        finally
        {
           // mostly used to close the resources or connections or files we opened
           try {
            bf.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
           // e.printStackTrace();
        }
        }
    }
}
