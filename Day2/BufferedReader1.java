package BufferReaderAndWriter.BufferedReader;
// about .read()
import java.io.*;
public class BufferedReader1 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("BufferReaderAndWriter/BufferedReader/sample1.txt"))){
            int ch = 0;
            // read() reads 1 character at a time and returns an integer, and returns -1 if it has reached the end of the file
            while((ch = br.read()) != -1){
                System.out.print((char)ch);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
/*
Note:
    Internally:
        Still uses buffer (fast)
        But processes 1 character at a time
    
    Better version:
        br.readLine()
        Internally:
            Uses buffer
            Returns full line → more efficient usage

*/
