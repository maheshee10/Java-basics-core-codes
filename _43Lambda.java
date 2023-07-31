// Lambda - can be used only with SAM
// thst is functional interface - with only one abstract method
// syntax : ->
// (argument-list) -> {body}  

@FunctionalInterface
interface A 
{
    void show();
}
interface B 
{
    void show(int x);
}
interface C
{
    int add();
}
class Test 
{
    public int sub()
        {
            return 2;
        }
}
public class _43Lambda 
{
    public static void main(String args[])
    {
        A obj =  () -> System.out.println("interface method implemented");
        // this is lambda expression -- used to reduce code
        obj.show();
        A obj1 = () -> {System.out.println("run"); System.out.println("go for exercise");};
        obj1.show();
        B objB = (int x) -> System.out.println(2*x);
        objB.show(5);
        C objC = () -> {
            
           
            return 2;
        };
        int r = objC.add();
         System.out.println("returned value is "+":"+r);
        
    }
}
