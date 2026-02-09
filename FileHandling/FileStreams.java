import java.io.*;

class FileStreams{

    public static void main(String[]args){

       File f = new File("E:\\Core_Java\\File_Handling\\sample.txt");
       f.createNewFile();

       FileOutputStream fos = new FileOutputStream(f);
       String s = "Hello, I'm Kishore";
       byte[] b = s.getBytes();
       fos.flush();
       fos.close();

       FileInputStream fis = new FileInputStream(f);
        int i=0;
        while((i=fis.read())!=-1){
            System.out.print((char)i);
        }
        fis.close();
    }
}