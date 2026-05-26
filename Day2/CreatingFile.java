import java.io.File;
import java.io.IOException;
public class CreatingFile{
	public static void main(String[] args){

		File file = new File("NewFile.txt");
		// In the above, you can pass both relative paths like "NewFile.txt" and absolute paths like "C:/Users/Documents/file.txt"
		// Note if you give absolute path, and if any directory doesn't really exists, for example if Documents is not there then an IOException will be thrown
		try{			
			// .createNewFile() method returns a boolean value, if successfully created then returns true else false.
			// true: The named file did not exist and was successfully created.
			// false: The named file already exists. (In this case, the method does nothing to the existing file; it doesn't overwrite it or open it).
			// file.createNewFile() - it throws an IOException if it cannot even perform the check or creation.
			if(file.createNewFile()){
				// created the new file in the current directory
				System.out.println("File successfully created");
			}else{
				System.out.println("File already exists");
			}
            /*
            Output (first run):
	            File created successfully
            Output (second run):
	            File already exists
            */
		}catch(IOException e){
			e.printStackTrace();
		}

		System.out.println("-------------------------------------------------------------------");
	
		// .exists() - this method is used to check whether a file exists or not.
		if(file.exists()){
			System.out.println("File already exists");
		}else{System.out.println("File doesn't exists");}
		
		System.out.println("-------------------------------------------------------------------");

		// other methods to get the information about the files.
		if(file.exists()){
			System.out.println("File name: "+file.getName()); // returns the name of the file
			System.out.println("File Absolute path: "+file.getAbsolutePath()); // returns the absolute path of the file
			System.out.println("Writable: "+file.canWrite()); //  returns true if writable else false
			System.out.println("Readable: "+file.canRead()); // returns true if file is readable else false
			System.out.println("File size: "+file.length()); // returns the size of the file
			System.out.println("Is this a file: "+file.isFile()); // returns true if the file object is holding a reference to the file
			System.out.println("Is this a folder(directory): "+file.isDirectory()); // returns true if the file object is holding a reference to the folder

		}
	}
}

/*
What happens in this line?
    File file = new File("test.txt");
    Two things happen here:
        1️⃣ A File object is created in memory
        2️⃣ The object represents the path "test.txt"
    Important:
        It does NOT create the physical file on the disk.
        Think of it like a file reference.
    Example idea:
        Java Object  →  Represents →  "test.txt"
        But the actual file may or may not exist.


Real-world analogy
    Imagine you write an address on paper.
        "221B Baker Street"
        Just writing the address does not build the house.
        It only represents a location.
    Similarly:
        File file = new File("test.txt");
    means:
        "Here is a reference to a file located at test.txt"
    But the file might not exist yet.

When the file is actually created
    The real file is created when you call:
        file.createNewFile();
    Now Java tells the operating system:
        "Create a file at this path if it doesn't exist."


Why Java designed it this way
    Because the File class is meant to represent both:
        1️⃣ Existing files
        2️⃣ Files that might be created later
    Example:
        File file = new File("data.txt");
        if(file.exists()){
            System.out.println("File already exists");
        }
    If Java forced creation in the constructor, you couldn't just check a file without creating it.

Step 1
    File file = new File("test.txt");

Memory:
    [File Object] → "test.txt"

Disk:
    (no file yet)
---------------------

Step 2
    file.createNewFile();

Memory:
    [File Object] → "test.txt"

Disk:
    test.txt created

*/