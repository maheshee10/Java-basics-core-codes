class Const
{
    //every time object create -- class load/called--constructor is execute
    //even if we dont write any constroctor by default java loads a default existing constructor
    private int age;
    private String name;
    //constructor -- same like method except no return type
    //constructor name should be same as class name
    public Const()
    {
        //if I dont specify anything here this will be a  default constructor
        //assigning values to instance variables =one way
        age = 25;
        name = "MaheshKumar";
        //if I dont specify anything here this is default constructor
        System.out.print("int the constructor"+"  ");
        System.out.print(age+" "+name+" ");
    }
    //method overloading concept for constructor is used wiill check if it works
    public Const(int a, String s) //parameterised constructor
    {
        age = a;
        name = s;
        System.out.print("int the parameterised constructor"+"  ");
        System.out.print(age+" "+name+" ");
    }
    //public Const(int age, String name)
    //{
        //this.age = age;
        //this.name = name;
        //System.out.print("int the parameterised using this keyword constructor"+"  ");
        //System.out.print(age+" "+name+" ");
    //}
}


public class _28Constructor 
{
    public static void main(String args[])
    {
      Const con = new Const(30,"mkn");//it will only call parameterised constructor
      Const con1 = new Const();

    }
}
