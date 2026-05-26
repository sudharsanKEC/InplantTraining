import java.io.File;
import java.io.IOException;
public class DeletingFile1 {
	public static void main(String[] args){
		// Creating a file for deleting, after running this go to DeletingFile2.java
		File file = new File("NewFile2.txt");
		try{
			if(file.createNewFile()){
				System.out.println("File Created successfully");
			}else{
				System.out.println("File already exists!");
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
