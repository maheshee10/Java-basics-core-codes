class Cal // class name
{
    int a; //instance variable
    public int add(int n1, int n2) // method name with access modifier and return type
    // public is access modiefier and int is return type of method
    //public implies can be called from anywhere
    // int n1 and int n2 are parameters passing to method add() through obj created in main method
    
    {
       //System.out.println("in add");
       int r = n1+n2;
       return r; //returns r to the method 
    }
}

public class _15AddClass // if a class is public it should match with file name
{
    static int st;// static variable
    public static void main(String args[]) // main method where execution begins // static here implies it doesnt require any obj to call it
    {
        int num1 = 10; //local variable
        int num2 = 20;

        //object creation
        Cal obj = new Cal(); // obj is a reference vaariable of non primitive class type Cal

        int reslut = obj.add(num1,num2); //calling method through obj and storing result method returning

        System.out.println(reslut);


        //Cal is Class type(non primitive data type)
        //obj is refernce of class type Cal
        //just like num1, num2.. obj is a variable except its a reference variable


       // System.out.println("Hello JavaTelusuko");

       
    }
}
