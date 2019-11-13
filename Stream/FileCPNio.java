import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.File;
public class FileCPNio {
    public static void main (String[] args){
        FileInputStream fis = null;
        FileChannel fc = null;
        File f = new File("fichier.txt");
        try {
            fis = new FileInputStream(f);
            fc = fis.getChannel();
            int size = (int)fc.size();
            ByteBuffer bBuf = ByteBuffer.allocate(size);
            fc.read(bBuf);
            bBuf.flip();
            byte[] a = bBuf.array();
            for(byte b:a) System.out.print((char)b);}
            catch (IOException e){
                e.printStackTrace();
            }
            finally {
                try {
                    fc.close();
                    fis.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
