class ClasssExample
{
 int a = 10;
 int b = 10;
 int r = a^b; // all these (a,b,r) are instance variables
 public static void main(String args[])
 {
   System.out.println("This is not a public class");
 }
 
}
// SUMMARY : 1. HERE I CREATED A JAVA FILE THAT IS NOT SAME AS CLAS NAME BECAUSE CLASS IS NOT PUBLIC
// 2. NOW WHEN COMPILED THIS CLASS IT GENERATED A CLASS FILE I.E BYTE CODE TO BE LOADED TO JVM
// 3. NOW TO RUN THIS PROGRAM USING JVM ONLY THAT CLASS FILE IS USED i.e "class name" in this example it is "ClasssExample"