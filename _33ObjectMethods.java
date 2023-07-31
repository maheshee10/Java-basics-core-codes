class A 
{
    int age;
    String name;
//    public String toString()
//    {
//     return age+":"+name;
//    }
    public boolean equals(A that)
    {
    //   if((this.name.equals(that.name)) && (this.age==that.age))
    //   {
    //     return true;

    //   }
    //   else 
    //   return false;
      return ((this.name.equals(that.name)) && (this.age==that.age));
    }
    // also ide gives option to generate hashcodes and equals and to strings methods
    // its preferrable to use them instead of our own methods
    // here goto source action
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "A [age=" + age + ", name=" + name + "]";
    }
    
    

}


public class _33ObjectMethods  
{
    public static void main(String args[])
    {
        A obj = new A();
        System.out.println(obj); // -- it turns as obj.toString() by default
         // prints class name it belongs to + @ hashcode
        // to use our own methods we have to over ride methods in Object class
        // because every class by default extends Object class 
        A obj1 = new A();
        obj.age = 25;
        obj1.age = 25;
        obj1.name = "mkn";
        obj.name = "mkn";
        boolean result = obj == obj1;
        System.out.println(result);
         System.out.println(obj1);
         boolean r1 = obj.equals(obj1);
          System.out.println(r1); // false because here also equals is a method that belongs to Object class
          // so we creatre our own equals method
    }
}
