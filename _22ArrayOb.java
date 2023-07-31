class Student
{
    int roll;
    String name;
}
public class _22ArrayOb 
{
    public static void main(String args[])
    { 
        Student s1 = new Student(); //obj creation
        Student s2 = new Student();
        Student s3 = new Student();
        s1.roll = 1; //accesing instance variables using objects and storing values in objects
        s1.name = "nmk";
        s2.roll =2;
        s2.name ="mkn";
        s3.roll =3;
        s3.name ="mahesh";
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] =s3;
        for(int i = 0;i<students.length;i++)
        {
            System.out.println(students[i]+" "); // prints object address
            System.out.println(students[i].roll+" "+students[i].name);
        }

        for(Student s : students)
        {
            System.out.print(s.name+""+":"+s.roll);
        }





    }
    
}
