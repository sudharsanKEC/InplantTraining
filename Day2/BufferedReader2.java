package BufferReaderAndWriter.BufferedReader;
// about .read(arr)
import java.io.*;

public class BufferedReader2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new FileReader("BufferReaderAndWriter/BufferedReader/sample1.txt"))) {

            char[] arr = new char[5];
            int charsRead;
            
            /*
                    read(arr) - Read up to arr.length characters
                                Store them in the array
                                Return how many characters were actually read
                            
                                Returns number of characters read (0 to 5 here)
                                Returns -1 ONLY when there is nothing left to read at all
            
            */
            while ((charsRead = br.read(arr)) != -1) {

                System.out.println("Characters read: " + charsRead);

                for (int i = 0; i < charsRead; i++) {
                    System.out.print(arr[i]);
                }

                System.out.println("\n--- chunk end ---");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


/*

Example to Make It Crystal Clear
    File content:
        HelloWorld
    Array:
        char[] arr = new char[5];

    Iteration 1
        Reads: Hello
        Returns: 5
    Iteration 2
        Reads: World
        Returns: 5
    Iteration 3
        Nothing left to read
        Returns: -1

Another Example (VERY IMPORTANT)
    File content:
        Java
    Array size = 5
        Iteration 1
            Reads: Java
            Returns: 4   ✅ (not 5!)
        Iteration 2
            Nothing left
            Returns: -1
    
Key Rules to Remember
    read(arr):
        | Situation         | Return Value   |
        | ----------------- | -------------- |
        | Full array filled | `arr.length`   |
        | Partial data left | `< arr.length` |
        | No data left      | `-1`           |

*/