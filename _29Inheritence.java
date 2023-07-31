class A 
{
  public int add(int n1, int n2)
  {
    int r = n1+n2;
    return r;
  }
}
class B extends A //Class B will have all props of class A so class b is class a
{
    public int mul(int n1, int n2)
    {
        int r = n1*n2;
        return r;
    }
}
class C extends B // multi level inheritence // class c will have B's and A's props
{
    public int pow(int n1, int n2)
    {
        int r = n1^n2;
        return r;
    }
}
public class _29Inheritence 
{
    //Inheritence mean giving one class properties to other class
    //giving class is called superclass
    //recieving class is child class
    //we can have multi level inheritence
    //but multiple inheritence not allowed in java
    public static void main(String args[])
    {
      //obj creation
      A objA = new A(); //objA will be creted in heap and will A's methods
      B objB = new B(); //objB -- heap--A and B methods
      C objC = new C();//objC -- heap -- A, B, C methods in C memory location
      int a = objB.add(4,5); //since B is child class of A objB can have A's method
      int m = objC.mul(6, 9);//since C  is child class of B objC can have B's method
      int p = objC.pow(25,25);
      System.out.println(a+" "+m+" "+p);


    }
}
