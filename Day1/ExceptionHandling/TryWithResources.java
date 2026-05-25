package TryWithResources;

import java.io.FileInputStream;
import java.util.Scanner;

/*
Try-with-resources Solution
    Java introduced a cleaner syntax.
    try(Resource declaration) {
        // use resource
    }
    Java automatically closes the resource when the try block finishes.

    Same Program Using Try-with-Resources (Modern Way)
    Now look how simple it becomes.

*/
public class TryWithResources {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a number:");
            int num = sc.nextInt();

            System.out.println("You entered: " + num);
        }
        catch(Exception e) {
            System.out.println(e);
        }


    }
}
/*
Java automatically does:
    sc.close();
after the try block finishes.



*/


/*

Important Interview Point
This code:
        try(FileInputStream fis = new FileInputStream("file.txt")) {

        }
    is internally similar to:
        try {
        }
        finally {
            fis.close();
        }
    Java compiler automatically generates the closing code.

Important Rule
    You can use try-with-resources only for classes that implement:
        AutoCloseable
    Scanner implements it, so it works.
*/