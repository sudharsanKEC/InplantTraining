
import java.io.File;
import java.io.IOException;
public class DeletingFile2 {
    	public static void main(String[] args){
		File file = new File("NewFile2.txt"); // give the exact file name created in the DeletingFile1.java
		if(file.exists()){
			if(file.delete()){
				System.out.println("File deleted successfully");
			}else{
				System.out.println("Problem with deleting file");
			}
		}else{
			System.out.println("File doesn't exists");
		}
	}	
}
