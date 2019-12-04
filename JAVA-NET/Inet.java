import java.net.InetAddress;
import java.net.UnknownHostException;

import sun.tools.java.Scanner;

public class Inet{
    public static void main(String[] args) throws UnknownHostException {
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.print("Input an IP Address: ");
        String ip = scanner.nextLine();
        InetAddress add = InetAddress.getByName(ip);
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("Nom: "+ address.getHostName());
        System.out.println("Address:"+ address.getHostAddress());
        System.out.println("Nom Canonique:"+ address.getCanonicalHostName());
    }
}