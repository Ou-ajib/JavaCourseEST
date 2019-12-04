import java.io.IOError;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

class Sockett extends Thread{
    int from , to;
    public run(int from, int to){
        Socket sock = null;
            for (int i = from; i<to; i++){
                try{
                sock = new Socket(InetAddress.getLocalHost(), i);
            if(sock != null)
                System.out.println(i);
            }
            catch(UnknownHostException e){
                
            } catch(IOException e){
                
            }
            finally{
                try {
                if(sock != null)
                    sock.close();}
                catch(IOException e){

                }
            }
        }
    }
}
//     public static void main(String[] args) {

         
// }