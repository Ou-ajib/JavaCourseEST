import java.io.*;
public class FileToConsoleObj {
    public static void main (String[] args){
        ObjectInputStream ois;
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("game.txt"))));
            oos.writeObject(new Game("Fifa20", "Sports", 60.5));
            oos.writeObject(new Game("NBA2k20", "Sports", 45.75));
            oos.writeObject(new Game("Farkhanite" , "PlayGround" , 0.00));
            oos.close();
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("game.txt"))));
            try{
                System.out.print(((Game)ois.readObject()).toString());
                System.out.print(((Game)ois.readObject()).toString());
                System.out.print(((Game)ois.readObject()).toString());
            }
            catch (ClassNotFoundException e){
                e.printStackTrace();
            }
            ois.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e){e.printStackTrace();}
    }
}