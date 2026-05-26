package BufferReaderAndWriter.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter1 {
     public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("BufferReaderAndWriter/BufferedWriter/output.txt"))) {
            // the output.txt file will be created.
            // Writes one character 'Z' to the file
            bw.write('Z');

            // Writes the entire string to the file
            bw.write("Hello World");
            bw.newLine(); // adds a newline to the file

            bw.write("Java is powerful");
            bw.newLine();

            bw.write("BufferedWriter is fast");
            // When we use BufferedWriter with try-with resources, it automatically flushes the buffer and closes the stream
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
