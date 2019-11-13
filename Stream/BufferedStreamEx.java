import java.io.*;

import jdk.jfr.events.ExceptionThrownEvent;
import sun.tools.tree.FinallyStatement;
public class BufferedStreamEx 
{ public static void main(String[] args) 
    { DataInputStream dis;
      DataOutputStream dos;
        try {
             dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("data.txt"))));
             dos.writeByte(100);
             dos.writeChar('C');
             dos.writeDouble(12.05);
             dos.writeFloat(34.5f);
             dos.writeInt(1748);
             dos.close();
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("data.txt"))));
            
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            System.out.println(dis.readFloat());
            System.out.println(dis.readInt());
            dis.close(); }
            catch (FileNotFoundException e)
                {e.printStackTrace();} 
            catch (IOException e) {e.printStackTrace();}
            }
            }
