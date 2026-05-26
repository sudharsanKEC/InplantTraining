import java.io.*;
public class PDFcopy {
    public static void main(String[] args)    {
        FileInputStream fis;
        FileOutputStream fos;
        try{
            fis  = new FileInputStream("JavaPDF.pdf");
            fos = new FileOutputStream("JavaPDFCopy.pdf"); // creates JavaPDFCopy.pdf if not there, if already exists then overwrites

        
            // int data = 0;
            // while((data = fis.read())!=-1){
            //     fos.write(data);
            // }
            // the above commented part is very inefficient
        
            byte[] buffer = new byte[4096]; // 4KB
            int bytesRead;
            while((bytesRead = fis.read(buffer)) != -1){
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
