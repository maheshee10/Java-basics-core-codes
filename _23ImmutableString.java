public class _23ImmutableString 
{
    public static void main(String args[])
    {
        String name = new String(); //object creation of Class String
        name = "Mahesh";
        System.out.println(name.length()); //calling methods of String Class
        //we can use String class without creating object and use its reference variable as obj;
        String s = "mkn"; //creating and using string like normal data type except s in this case is reference variable

        int i = s.length(); 
        System.out.println(i);
        String str = "nmk";
        /* by deafault String is immutable it is fixed and it doesnot change its value once its is 
         * created. here str is a reference variable of type String class
         * and it has a constant value "nmk"
         * in string we have String Constant Pool in heap memory
         * every time a string is created jvm goes to SC pool and checks if the value is thee
         * if not it creats a new object with data in it with a addressa and give this address to 
         * reference variable in stack memeory
         * now say if a new ref vsriable with same data or existing string is created the reference variable holding 
         * that object adress will be given to new reference variable thats how string value is changed
         * 
         */
        //String S1 and giving str value
        String S1 = "nmk";
        /*now sc pool checked, nmk exists with address referen to str, takes that address and 
        give it to S1 reference variable thats how nmk is stored in S1
         * 
         */
    }    
}
