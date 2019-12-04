import java.io.BufferedInputStream;
import java.io.IOError;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class ServerTest{
    public static void main(String[] args) throws IOException {
        ServerSocket serverSock = null;
        Socket sock = null;
        try{
            serverSock = new ServerSocket(5555);
            System.out.println("ServerSocket Created Succefully");
            
            
        }catch(IOException e){
            e.printStackTrace();
        }
        while(true)
        try{
            sock = serverSock.accept();
            System.out.println("Un client c'est connecte!");
            BufferedInputStream bis = new BufferedInputStream(sock.getInputStream());
            System.out.println(bis.read());
        }
        catch(IOException e){}
        finally {
            sock.close();
            serverSock.close();
        }
    }
}