public class _17MethodOverLoading 
{
    //taking multiple methods with same name but changing number of paramaeters and type of params passing into them
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3; //three params of int data type
    }
    public double add(double n1, double n2, double n3)
    {
        return n1+n2+n3; //number of params same but datat type changed
    }
    public int add(int n1, int n2)
    {
        return n1+n2; //data type same as first but number of params changed
    }
    
}
class Practice
{
    public static void main(String args[])
    {
        _17MethodOverLoading obj = new _17MethodOverLoading();
        int i= obj.add(1,2,3);
        double d= obj.add(3.67,6.77,8.56);
        int i1= obj.add(5,89);

        Example ex = new Example(); //here the object is created by jvm of class type 
        /*the moment object is created corresponding class is called and executed
         * only to call method objected is used
         * but class unlike method gets called and executed the moment objected is created
         * also the class need not be public
         * we can have multiple classes
         * but atleast one class must have main method
         * and only that class with main method is executed during running by jvm 
         * no other clss is executed
         * so to execute other class we need to call them int the class where main method is located
         */

        System.out.println(i+" "+"/n"+" "+d+" "+"/n"+" "+i1);
    }

}
class Example
{
     public static void main(String args) //Main method OverLoading 
     /* we can have multiple main methods
      * but only one main method with(String args[]) signature
      this is called method overloading
      */
    {System.out.println("in example");}
}
