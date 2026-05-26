import java.io.File;
public class CreatingFolder {
	public static void main(String[] args){
		File folder = new File("DummyFolder");

		// You can pass absolute path like "E:/Java/DummyFolder", this is still valid, but the Java folder must be available in the E drive.
		// .mkdir() returns false if folder creation filed but it will not throw any exception.
		// .mkdir() returns true if folder creation is successfull.
		if(folder.mkdir()){
			// creates folder in the current directory
			System.out.println("Folder created successfully");
		}
		else{
			System.out.println("Folder creation failed! Possible reasons: Any of the directories of the parent and grandparent of the creation folder might not exists");
		}
	}
}
