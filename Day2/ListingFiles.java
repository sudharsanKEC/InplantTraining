// This program is for the demonstration of listing 
import java.io.File;
public class ListingFiles {
    public static void main(String[] args) {
        File dir = new File("."); // . means current directory

	// The return type of the .list() method is a String[] (an array of Strings).
	// It provides the names of all files and directories found within the directory represented by the File object. It's important to note that these are just the names (e.g., "notes.txt"), not the full paths.
	String[] files = dir.list();

	// Returns: A String[] containing the names of files and folders.
	// Order: There is no guaranteed order (it depends on the underlying Operating System).
	// If the folder is empty: It returns an empty array (new String[0]).
	// If the path is not a directory: It returns null.
	
	for(String file : files){
		System.out.println(file);
	}
    }
}
