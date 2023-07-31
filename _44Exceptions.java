/** Exceptions
 * types of errors : compile time -- run time-- logical
 * compile time - error due to syntax - error due to any missing file or class - shows during a compiling process 
 * logical time - expected outcome vs real outcome - code is ok - syntax and concept is right - but due to logic in math errors - called
 * as bugs - tough to solve these errors but not impossible -- takes lot of testing - check everything 
 * both compile time and logical issues are taken care by developers
 * but runtime is unexcpected error that might come during runtime of the code somewhere
 * it may be due to clients missing file in system or versions 
 * these at runtime end issues cannot be taken care by developers so they have to be handled
 * runtime errors - that have to be hadled - Exceptions
 * Exceptions / run time errors cannot be stopped but can be handled
 * if they are not handled app stops so to avoid app stop running becasue of such exceptions
 * they are handled with try catch methodology there by allowing 
 * rest of the code to work irrespective of the exception occur
 * 
 */

/* two types of statements - normal and critical
 * critical statements are something that might give exceptions
 * such crirtical statements need to handled
 * we use try-catch blocks for that
 */





public class _44Exceptions 
{ 
    public static void main(String args[])
    {
       int i = 0;
       int j = 0;
       // we can have multiple try catch blocks
      try
      {
        // its better to put on;y critical statements inside try block
         j = 10/i; // gives runtime exception -- ArithmeicExcption 
         // the moment one exception is found in this try block it comes out of this block so no other statements
         // are executed
         int nums[] = new int[5];
        System.out.println(nums[1]);
        System.out.println(nums[5]);
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
          System.out.println(e);
      }
      catch(ArithmeticException a) // this block executes only if there is an exception in try block if not its skipped 
      {
           System.out.println("some thing wrong"+ ":"+a);
      }
      catch(Exception E) //parent class 
      {
        System.out.println("something unknown exception");
      }
       System.out.println(j); // if exception hahdled it is executed 
       System.out.println("bye");

       /*Exception is a class 
     * so exceptions that occurs are objects of Exception class
     * so we catch exceptions - runtime erros - as - objects
     */


     /*Exception is the parent class of all exceptions - 
      * so it must be written at last in catch block like return statement written at end of code
      Exception has throwable as its parent which will have Object class as parent

      */

      /*RuntimeException extends Exception
       * RuntimeException} and its subclasses are <em>unchecked
 * exceptions</em>.  Unchecked exceptions do <em>not</em> need to be
 * declared in a method or constructor's {@code throws} clause if they
 * can be thrown by the execution of the method or constructor and
 * propagate outside the method or constructor boundary.
       */
      /*RuntimeException} is the superclass of those
 * exceptions that can be thrown during the normal operation of the
 * Java Virtual Machine.
 *  */

 /*The class Exception and its subclasses are a form of Throwable that indicates conditions that a reasonable application might want to catch.

The class Exception and any subclasses that are not also subclasses of RuntimeException are checked exceptions. Checked exceptions need to be declared in a method or constructor's throws clause if they can be thrown by the execution of the method or constructor and propagate outside the method or constructor boundary.

 */

 //*hierarchy of exceptions
 /*Object - Throwable9most words end with able are interfaces except this)
  * throwable - errors and Exception
  errows - we cant handle - example io error, jvm error, out of memory error, threaddead - canot be handled
  Exceptions - can be handled - Runtime Exception, SQL,IO exceptions
  Runtime exceptions - Arirhmetic,Nullpoint,Arrayout of bound - are called - unchecked exceptions
  Exception and other subclases , non subclasses of runtime - Chceked exceptions
  unchecked exceptions need not be throw clause
  but checked exceptions - forced to write throws clause

  "checked exceptions - must be handled - else compile wont happen"



   */


      
    }
    
    

}
