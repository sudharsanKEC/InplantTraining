package BufferReaderAndWriter.BufferedReader;
// This is about readLine() in BufferedReader
import java.io.*;
public class BufferedReader3 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("BufferReaderAndWriter/BufferedReader/sample1.txt"))){
            String line = null;
            /*
                .readLine():
                    Reads one full line
                    Returns the entire line as a string 
                    Returns null when file ends
            */
            while((line = br.readLine()) != null){
                System.out.println(line);
                System.out.println(br.ready()); // .ready() is used to check if data is available, returns true if data is available else false.
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
