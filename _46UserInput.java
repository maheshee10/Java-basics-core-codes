import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
import java.io.BufferedReader;

public class _46UserInput 
{
    public static void main(String args[]) throws IOException // throwing exception to main method not preferred
    {
        
    //     // system.out.print - used to print output on console
    //     // println() - method - of PrintStream class - out is the object of PrintStream class - which is subclass of System class
    //     // java.lang automatic loaded no need to import 
    //     // all other packages class methhods must be imported
    //     //now out is a Static final object of class System ==> out can be accesed using System class directly
    //     // out -- console
    //     // in - takes input - object of InputStream class -- used to call method to take input of user
         // first way//
    //     int num = System.in.read(); // throws IOException
    //     System.out.println(num);
    //     int i = 48;
    //    //by default in.read() gives ASCI value of the input given -- for 0 it is 48 say now if i sub 48 from num

    //    System.out.println(num-i); // for large numbers it work // for double digits also give error

    //    // BufferedReader is used to solve this problem - class works with java.io 
    //    // to work withBufferedReader we have to import io package
    //    // java.lang is auto import
    // second way//
    //     InputStreamReader  in = new InputStreamReader(System.in); // InputStreamReader accepts a param of InputStream obj
    // //    //InputStream object is static of System class so System.in is used
    //     BufferedReader bf = new BufferedReader(in); //BufferedReader obj accepts a param of Reader obj
    //     //Buffered reader is class of io package
    //    // BufferedReader extends Reader -- BFR is a subclass of Reader
    //    // Reader implements Readable, Closeable -- instances 
    //    //int num1 = bf.readLine(); // readline() method reads string input -- converted to int uusing Integer class
    //    int num1 = Integer.parseInt(bf.readLine());
    //    System.out.println(num1);
    //    // buffer is a resource -- like file connectionn we have to close thi resource
    //    bf.close();

       // third way - scanner


       Scanner sc = new Scanner(System.in); // System.in is the place we re getting input -- else we should mention where we get the input from
       int n = sc.nextInt();
       System.out.println(n);

       // Scanner is a class in java.util package used for obtaining the input of the primitive types like int, double, etc. and strings.
       








    }
}
