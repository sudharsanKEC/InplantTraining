import java.io.*;
public class VideoCopy {
    public static void main(String[] args){
                
        try(
            FileInputStream fis = new FileInputStream("vlipsy-ishowspeed-what-ChAbsFuc.mp4");
            FileOutputStream fos = new FileOutputStream("IShowSpeedVideoCopy.mp4");
        ){
            
            byte[] buffer = new byte[8192]; // 8KB buffer
            int bytesRead = 0;
            while((bytesRead = fis.read(buffer))!=-1){
                fos.write(buffer,0,bytesRead);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
