import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.io.IOException;
import java.lang.reflect.Array;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class FileTest{
    public static void main(String[] args) {


        File file = new File("C:\\");
        if(file.exists()){
            int counter = 0;
            for(File s : file.listFiles()){
                counter++;
                String ss = s.isDirectory() ? "%d -/%.5s \t" : "%d -%.5s \t";
                System.out.printf(ss, counter, s.getName());
                if(counter%4 == 0) System.out.println();
            }
        }
        System.out.println();
        // for (String f : file.list()) {
        //     System.out.println(f);   
        // }
        // new File("C:\\Batata").mkdir();
        
        // // String dirName = "C:\\";
        // for (String f : file.list()) {
        //     System.out.println(f);   
        // }
        File f = new File("C:\\Users\\Client11\\Mouaad-Aissam\\Java\\JavaCourseEST\\ExemplesCourJava\\file.txt");
        File f1 = new File("C:\\Users\\Client11\\Mouaad-Aissam\\Java\\JavaCourseEST\\ExemplesCourJava\\file1.txt");
        long t;
        try{
            t = System.currentTimeMillis();
            FileInputStream fis = new FileInputStream(f);
            FileOutputStream fos = new FileOutputStream(f1);
            byte[] buffer = new byte[16];
            int n, i = 0;
            while((n = fis.read(buffer)) != -1){
                while(i < n){
                    fos.write(buffer[i]);
                    System.out.print((char)buffer[i]);
                    i++;
                }
                i=0;             
            }
            fis.close();
            System.out.println(t - System.currentTimeMillis());           
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            t = System.currentTimeMillis();
            BufferedInputStream fis = new BufferedInputStream(new FileInputStream(f));
            BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(f1));
            byte[] buffer = new byte[16];
            int n, i = 0;
            while((n = fis.read(buffer)) != -1){
                while(i < n){
                    fos.write(buffer[i]);
                    System.out.print((char)buffer[i]);
                    i++;
                }
                i=0;             
            }
            fis.close();
            System.out.println(t - System.currentTimeMillis());            
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}