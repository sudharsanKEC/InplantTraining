import java.io.FileReader;
import java.io.IOException;
public class FileReader1 {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("sample.txt");

            // 1️⃣ read() -> read single character
            System.out.println("Reading character by character:");

            int ch;
            while((ch = fr.read()) != -1){
                System.out.print((char)ch);
            }

            fr.close();


            System.out.println("\n\n------------------------");



            // 2️⃣ read(char[])
            FileReader fr2 = new FileReader("sample.txt");

            System.out.println("Reading using char array:");

            char[] buffer = new char[20];

            int charsRead = fr2.read(buffer);

            System.out.println("Characters read: " + charsRead);

            for(char c : buffer){
                System.out.print(c);
            }

            fr2.close();

             System.out.println("\n\n------------------------");



            // 3️⃣ read(char[], offset, length)
            FileReader fr3 = new FileReader("sample.txt");

            System.out.println("Reading using offset and length:");

            char[] arr = new char[30];

            int readCount = fr3.read(arr, 5, 10);
            // read first 10 characters from the sample.txt and place it in the arr from the starting index position 5.

            System.out.println("Characters read: " + readCount);

            System.out.println(arr);

            fr3.close();

            System.out.println("\n\n------------------------");



            // 4️⃣ skip() - skip(n) skips (moves past) n characters from the current position in the file.
            FileReader fr4 = new FileReader("sample.txt");
            // fr4.skip(5) - it skips the first 5 characters (if you call it at the beginning)
            // if the fr4 is pointing to the 3rd character of the file then it skips the 3,4,5,6,7 characters and starts from 8.
            System.out.println("Skipping first 5 characters:");

            fr4.skip(5);

            int c;

            while((c = fr4.read()) != -1){
                System.out.print((char)c);
            }

            fr4.close();

            System.out.println("\n\n------------------------");



            // 5️⃣ ready()
            FileReader fr5 = new FileReader("sample.txt");

            System.out.println("Checking if stream is ready:");
            // Note: // ⚠️ ready() should NOT be used to control reading loops
            if(fr5.ready()){
                System.out.println("Stream is ready to read.");
            }

            fr5.close();

            System.out.println("\n\n------------------------");



            // 6️⃣ mark() and reset()
            FileReader fr6 = new FileReader("sample.txt");

            if(fr6.markSupported()){

                System.out.println("Mark supported.");

                fr6.mark(20);

                System.out.print((char)fr6.read());
                System.out.print((char)fr6.read());

                fr6.reset();

                System.out.println("\nAfter reset:");

                System.out.print((char)fr6.read());
            }
            else{
                System.out.println("Mark not supported by FileReader.");
            }

            fr6.close();


        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
/*
Why does ready() even exist?
    Because not all input comes from files
    
    Some data sources are slow / unpredictable
        Think beyond files
        1) Keyboard input ⌨️
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            User may or may NOT have typed anything
        So:
            br.ready()
        Checks:
            “Did user type something already?”
            “Can I read now without waiting?”

        2) Network streams 🌐
            Example:
                Chat app
                API response
                Socket programming
            👉 Data comes over time
            Server → (delay...) → data arrives
            So:
                ready() = “Has data arrived?”
                Why “blocking” matters
                Without ready():
                    br.read();
                        If no data:
                        Program freezes (waits indefinitely)
                With ready()
                    if(br.ready()){
                        br.read();
                    }
                    Program doesn’t freeze
                    It checks first

        Why it feels useless to YOU
            Because you're using:
                FileReader
            File is already:
                Fully available
                Stored on disk
            So:
                ready() is almost always true
                Real analogy
                File:
                    Like a book in your hand
                    You can read anytime
                Keyboard / Network:
                    Like someone speaking to you
                    You must check if they’ve started talking
                So the real purpose
                    ready() is NOT for files
                    It is for interactive / live data sources
        
        So its literally checks is there anything in the stream read, if anything is there then it returns true

*/


/*
Advanced Reader methods (mark() and reset())

First: What this program is doing?
        It is trying to:
            Check if marking is supported
            Mark a position in the stream
            Read some characters
            Go back (reset) to the marked position
            Read again from that position

But IMPORTANT reality (very important)
        FileReader does NOT support mark() and reset()
        So:
            if(fr6.markSupported())
        This will return:
            false

        Actual Output
            ------------------------
            Mark not supported by FileReader.
        The if block will NEVER execute
        Now let’s understand the methods
            1) markSupported()
                    fr6.markSupported();
                Checks if the stream supports:
                    mark()
                    reset()
                Returns true or false
            2) mark(int readAheadLimit)
                    fr6.mark(20);
                Marks current position in stream
                    20 = how many characters you can read before reset may fail
            3) read()
                    fr6.read();
                Reads one character
            4) reset()
                    fr6.reset();
                Moves pointer back to the last marked position
            
            How it SHOULD work (if supported)
                Let’s assume file:
                    Vanakkam
                Flow:
                    mark() → position at 'V'
                    
                    read() → 'V'
                    read() → 'a'
                    
                    reset() → back to 'V'

                    read() → 'V'
                
                Why FileReader doesn’t support it?
                Because:
                    It reads directly from file
                    No internal buffering for mark/reset

Question:
so FileReader doesn't directly read anything from the disk?
Or how its actually reading if the FIleReader doesn't uses a buffer?


Answer:
    Short answer
        `FileReader DOES read from disk
        But it does NOT provide its own buffering for mark/reset
    Important distinction (this is where confusion happens)
    There are 2 types of buffers involved:
        1) OS-level buffer (always exists)
            Even if you use:
                FileReader fr = new FileReader("sample.txt");
                fr.read();
            The data is NOT read byte-by-byte directly from disk every time.
            The Operating System already loads chunks of the file into memory (buffer)
        So:
            FileReader is actually reading from OS buffer, not directly spinning disk every time.

        2) Java-level buffer (optional)
            Classes like:
                BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            Add an extra buffer inside Java
        
        So what does FileReader actually do?
        Internally:
            Disk → OS Buffer → FileReader → Your program
        It reads character by character
        But OS already gives it chunks
    
        Then why no mark() support?
        Because:
         FileReader:
            Does NOT store previously read characters
            Just passes data forward
        So:
            It cannot “go back”

        What BufferedReader does differently
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        Now:
            Disk → OS Buffer → BufferedReader Buffer → Your program
        BufferedReader:
            Stores data in its own buffer
            Can remember positions
            Can rewind → reset()

        Real-world analogy
        FileReader:
            Like reading a book linearly
                You don’t remember previous pages
                You can’t go back easily
        
        BufferedReader:
            Like reading with a bookmark + notes
                You can jump back
                You remember where you were
    
        Key misunderstanding you had
            “If no buffer, how is it reading?”
        Correction:
            Buffer always exists (OS level)
            But Java-level buffering is optional

        Final answer
            FileReader:
                Reads from disk (via OS buffer)
                Does NOT maintain its own buffer
                So it cannot support mark() / reset()
*/


/*
Note: FileReader uses default system encoding
      FileReader uses default charset (not recommended for precise control)

*/