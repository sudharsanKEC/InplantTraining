/*
What is FileWriter?
    FileWriter is a character stream class used for writing text files.
    Package:
        java.io.FileWriter
    It is mainly used for:
        .txt
        .csv
        .xml
        .json
        log files
        configuration files
    It should not be used for binary files like images or videos.
    
    Class Hierarchy
            Object
            ↓
            Writer (abstract class)
            ↓
            OutputStreamWriter
            ↓
            FileWriter
    So internally FileWriter is built on top of byte streams.

*/
import java.io.*;
public class FileWriter1 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("sample.txt",true); // creates a new file if not exists, overwrites the existing characters in the file, pass true in constructor to append
            // fw.write(int c)
            // this takes int as an argument and writes the respective unicode representation of that number in the file
            fw.write(1000); // writes Ϩ in the file
            fw.write('A'); // appends A
            fw.write('B'); // appends B


            // fw.write(char[] arr)
            // Writes a character array to the file
            char[] arr = {'H','e','l','l','o'};
            fw.write(arr);

            // fw.write(char[] arr, int offset, int length)
            char[] arr2 = {'J','A','V','A','P','R','O','G'};
            fw.write(arr2, 4, 4); // Meaning: Start at index 4 of the array and write 4 characters from index 4 to the sample.txt file.
            // writes PROG at the end of the file.

            // fw.write(String str)
            // writes the String str to the file
            fw.write("\nHello Guys, I am under the water!\n");


            // fw.write(String str,int offset, int length)
            // writes the part of a string to the file
            fw.write("HelloWorld",5,5);// starts from the 5th index of the string and writes 5 characters from the 5th index to the sample.txt file
            // writes World to the file

            // fw.close() automatically the fw.flush()
            fw.close();
            System.out.println("Writing completed!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }    
}
/*
| Feature    | FileWriter         | FileOutputStream |
| ---------- | ------------------ | ---------------- |
| Type       | Character stream   | Byte stream      |
| Used for   | Text files         | Binary files     |
| Conversion | Characters → Bytes | No conversion    |

Real-World Best Practice
    Most real programs use BufferedWriter. 
    Because it is much faster thean FileWriter

All the necessary methods of FileWriter:
write(int)
write(char[])
write(char[], offset, length)
write(String)
write(String, offset, length)
flush()
close()

*/

/*
Why FileWriter is slow?
    The main reason is:
        Too many direct disk operations (system calls)
    What happens when you write using FileWriter?
        fw.write('A');
        fw.write('B');
        fw.write('C');
    Internal flow:
        'A' → OS → Disk
        'B' → OS → Disk
        'C' → OS → Disk
    Each write() can trigger a system call to the OS.

    Problem: Disk is VERY slow
    Compared to RAM:
        | Resource       | Speed     |
        | -------------- | --------- |
        | CPU            | Very fast |
        | RAM            | Fast      |
        | Disk (HDD/SSD) | Slow      |
    So this is expensive:
        Program → Disk (again and again)

Why BufferedWriter is Much Faster
        Now let’s see the optimized version.
        Example:
            BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"));
            bw.write('A');
            bw.write('B');
            bw.write('C');
            bw.flush();

        What changes?
            Instead of writing to disk every time:
                'A' → RAM buffer
                'B' → RAM buffer
                'C' → RAM buffer
            Nothing goes to disk yet.
    
        When does disk write happen?
            Buffer becomes full OR
            flush() is called OR
            close() is called
        Then:
            Buffer (many chars) → ONE write → Disk
        
        Key Difference
            FileWriter:
                1000 writes → 1000 disk operations ❌
            BufferedWriter:
                1000 writes → 1 or few disk operations ✅

        Visual Comparison
            FileWriter:
                Program → Disk
                Program → Disk
                Program → Disk
                Program → Disk
            BufferedWriter
                Program → RAM buffer → RAM buffer → RAM buffer
                                            ↓
                                    One big write → Disk

        Real Performance Impact
            Let’s say you write 1 million characters.
            FileWriter:
                1,000,000 system calls 😬
            BufferedWriter:
                ~100–1000 system calls 😎
            That’s why:
                BufferedWriter is 10× to 50× faster

        Why System Calls Are Expensive
            When Java writes to disk:
                JVM calls OS
                OS switches context
                Disk operation happens
                Control returns
            This is called:
                User mode → Kernel mode → User mode
            This switching is slow.

            Simple Benchmark Example
                ❌ FileWriter
                    FileWriter fw = new FileWriter("file.txt");

                    for(int i = 0; i < 100000; i++){
                        fw.write("A");
                    }
                    fw.close();
                
                ✅ BufferedWriter
                    BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"));
                    for(int i = 0; i < 100000; i++){
                        bw.write("A");
                    }
                    bw.close();
                👉 The second one will be dramatically faster.

Important Insight (Interview Level)
    FileWriter is not designed for performance
    It is a low-level stream
    BufferedWriter is a high-level optimized wrapper

When Should You Use Each?
    Use FileWriter when:
        Writing small data
        Learning basics
        Simple scripts
    Use BufferedWriter when:
        Writing large files
        Performance matters
        Real-world applications
*/
















