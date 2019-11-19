import java.util.Date;

class Counter extends Thread {
    int counter;
    Date date;

    Counter(int val ){
        this.counter = val;
        date = new Date();
    }

    public void run(){
        try{
            for(;;){
                System.out.println(this.counter);
                Date date2 = new Date();
                System.out.println((date2.getTime()-date.getTime()));
                this.date = new Date();
                sleep(1000);
                this.counter++;
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Counter c1 = new Counter(0);
        Counter c2 = new Counter(10);
        c1.start();
        c2.start();
    }
}