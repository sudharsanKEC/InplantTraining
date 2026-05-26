import java.io.File;
/*
// Deleting folders is a little complicated than just deleting a file.
// If we try to delete a folder all the contents in the file should be deleted first, so we follow a recursive approach to delete the contents in it first.
// This is a legacy way to delete the folders.


*/
public class DeletingFolders {
    public static void main(String[] args) {
        File folder = new File("DummyFolder2");
        deleteRecursive(folder);
    }

    public static void deleteRecursive(File fileOrDirectory) {
        if (fileOrDirectory.isDirectory()) {
            // Get all files/folders inside
            File[] contents = fileOrDirectory.listFiles();
            
            if (contents != null) {
                for (File child : contents) {
                    // Recursive call to empty sub-folders
                    deleteRecursive(child);
                }
            }
        }
        
        // After cleaning contents (or if it's just a file), delete it
        if (fileOrDirectory.delete()) {
            System.out.println("Deleted: " + fileOrDirectory.getName());
        } else {
            System.out.println("Failed to delete: " + fileOrDirectory.getName());
        }
    }
}
