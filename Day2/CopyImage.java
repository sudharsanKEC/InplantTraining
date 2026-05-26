import java.io.*;
import java.util.*;
public class CopyImage {
    public static void main(String[] args) {
        FileInputStream fis;
        FileOutputStream fos;
        try{
            fis = new FileInputStream("JG.png");
            fos = new FileOutputStream("JGcopy.png");
            int data;
            while((data=fis.read()) != -1){
                fos.write(data);
            }
            
            fis.close();
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }    
}
