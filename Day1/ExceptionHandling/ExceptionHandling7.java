// Here we are going to learn about the finally block with try-catch
/*
What is finally?
    finally is block that's always got executed whether an exception occurs or not.
    Its used with try-catch
  Syntax:
    try{
    
    }catch(Exception e){
    
    }finally{
        // No matter whether an exception occurs or not, this block will get executed.
    }

    Why do we need finally?
        finally is mainly used for cleanup codes, such as
            Closing files that was opened during the execution of this file
            Closing database connections
            Releasing resources associated with this file
        These actions should must happen whether an exception occurs or not.

*/
import java.util.*;
public class ExceptionHandling7 {
    static int test() {
        try {
            return 10;
        } finally {
            System.out.println("Finally runs before return");
        }
    }

    /*
    even if there was return statement in the try block, that won't get returned because the of the return in the finally block, the finally block's return will override the try and catch block's return
    static int test() {
        try {
            return 10;
        } finally {
            return 20; // this gets returned not the return 10
        }
    }

    static int test() {
        try {
            int x = 10 / 0;
            return 10;
        } catch (Exception e) {
            return 30;
        } finally {
            return 40;
        }
    }
    */

    public static void main(String[] args) {

        try {
            int a = 10 / 2;   // no exception
            System.out.println("Result: " + a);
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("Finally block executed");
        }
        // finally runs even when everything is normal.

        try {
            int a = 10 / 0;   // exception
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally block executed");
        }
        // finally gets executed when exception occured

        // This is valid in java, even without a catch, we can use only finally followed by a try
        //Useful when you don’t want to handle the exception, but still want cleanup.
        try {
            System.out.println("Inside try");
        } finally {
            System.out.println("Inside finally");
        }
        
        // the code in the finally block will be executed even after the return is in the try statement which was before finally block
        System.out.println(test());

        // finally doesn't run only in rare cases like:
        // System.exit(0);
        // JVM crash power failure

        /*
        In this type of code the sc will automatically closed by java, so using try like this is called try-with-resources and it closes the resources opened automatically no needed to do it manually
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println(sc.nextInt());
            }
        
        */
    }
}


/*

Applications of finally:
    Resources are objects that must be closed after use (otherwise they may cause memory/resource leaks).
    Common examples:
        FileInputStream
        FileOutputStream
        BufferedReader
        Scanner
        Database connections
        Network streams
    All the above should be closed in finally and thats what finally is for.

    We want to close everything manually in finally and thats the disadvantage in this.
    So to overcome this try-with-resources is introduced.
    Refer the folder TryWithResources for learning try-with-resources.


*/