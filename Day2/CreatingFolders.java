import java.io.IOException;
import java.io.File;
public class CreatingFolders {
	public static void main(String[] args){
	
		File folder = new File("DummyFolder2/dummyfolder2");
		if(folder.mkdirs()){
			System.out.println("Folders created successfully");
		}
		else if(folder.exists()){
			System.out.println("Folder already exists");
		}
		else{
			System.out.println("Problem arised (e.g., permissions or invalid path)");
		}

	}    
}
