/****** Learn about finally before this ******/

// Before Java 7, we had to close resources manually in finally.

package TryWithResources;

import java.io.FileInputStream;
import java.util.Scanner;

public class ProblemWithfinally {
    public static void main(String[] args) {

        Scanner sc = null;

        try {
            sc = new Scanner(System.in);

            System.out.println("Enter a number:");
            int num = sc.nextInt();

            System.out.println("You entered: " + num);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            if(sc != null) {
                sc.close();
                System.out.println("Scanner closed");
            }
        }
    }
}

/*
Without Exception:
Input:
Enter a number:
5
Output:
You entered: 5
Scanner closed

With Exception:
Input:
Enter a number:
w
Output:
java.util.InputMismatchException
Scanner closed

*/


/*
Problems:
    Code becomes long
    Easy to forget closing
    More error-prone


*/