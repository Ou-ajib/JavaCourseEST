import java.util.Scanner;

class TestOrder{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); 
        for(int i = 0;i<n;i++){
          new Compteur("Compteur " + (i+1), 110);  
        }
    }
}