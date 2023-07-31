class CustomException extends Exception  // creating our own exception class 
{

    CustomException(String s) // constructor of custom exception 
    {
        super(s);
       
    }
}
public class _45ThrowException 
{
    public static void main(String args[])
    {
        int i = 20;
        int j = 0;
        try
        {
            j = 18/i;
            if(j == 0)
            {
                
                throw new CustomException("zero is not allowed");
                //throw new Exception("zero is not allowed"); //only one throw allowed
                // this is the throw kewyword using constructor 
                // we can create custom exception by extending Exception class

            }

        }
        //throw is the keyword used to catch /handle exception even if there is no exception generated
        catch(CustomException e) 
        {
            j = 18/1;
            System.out.println("exception handled"+e+j);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

            System.out.println(j);

            //throws : if a method has try catch block -i we want handle those try catch blocks i.e exceptions somewhere else we can use - throws kewyword
            // we throws exception name beside the method name - that method ducking that exceptions and send that over to other class
            // even main method can throw exception but when it ithrows it means to be hadled by jvm - not at all preferrable
            // this only for checked exceptions - for unchecked -- not compulsory to handle exceptions


        
    }
}