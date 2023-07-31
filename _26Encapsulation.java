class Allien
{
    private int age = 30; //declare and initialise age variable as private
    private String name;//declare name variable as private
    private int capacity = 45;//declare and initialise capacity variable as private
    double range;//declare double as instance variable
    //setter methods to set values
    public void setName(String s) //setting string name value by passing parameter through method
    {
        name = s;//assigning passed parameter to name variable
      System.out.println(name);

    }
    public void setCapacity(int c)
    {
        capacity = c;
        System.out.println(capacity);

    }
    //getter methods to get data
    public int getAge()
    {
       return age;
    }
    public String getName()
    {
        return name;
    }
    public int getCapacity()
    {
        return capacity;
    }
}
public class _26Encapsulation 
{
    public static void main(String args[])
    {
        //Encapsulation is a concept wraping instance variables around methods
        //methods are used to acces, get data, assign values to instance variables
        //we declare private for instance variables so that they can't be accessed out side that class
        //so encapsulation is binding instance variables with methods
        //we cannot directly access those variables but can oly be through methods
        //ide will provide by default two methods to access them : Getters and Setters
        Allien aln = new Allien(); //creating object there by executing class
        //setting values/data to instance variables using objects and methods
        //objects used for public instance variables
        //methods for private instance variables
        aln.range = 2.0;
        aln.setName("Mahesh"); //passing string as parameter to setname method
        aln.setCapacity(70); //passing int as parameter to setcapacity method
        //getting methods
        int m = aln.getAge();
        String n =aln.getName();
        int o = aln.getCapacity();
        Allien alien[] = new Allien[4];
        alien[0] = aln;
    
        System.out.println(aln.range+" "+m+" "+n+" "+o);


    }
    
}
