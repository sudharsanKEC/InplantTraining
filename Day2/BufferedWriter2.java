package BufferReaderAndWriter.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
// Example Using char[]
public class BufferedWriter2 {
    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("BufferReaderAndWriter/BufferedWriter/output.txt",true))) {

            char[] arr = {'J','A','V','A'};
            bw.write(arr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
