import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

class ClientTest{
    public static void main(String[] args) {
        Socket sock = null;
        try{
            sock = new Socket(InetAddress.getByName("192.168.1.3"), 1234);
            BufferedOutputStream bos = new BufferedOutputStream(sock.getOutputStream());
            bos.write("Plz dir ds sahel baliiiiiiz\n".getBytes());
            bos.flush();
            sock.close();
        }catch(UnknownHostException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}