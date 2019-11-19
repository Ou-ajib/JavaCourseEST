class RunnableTest implements Runnable{
    int counter;
    boolean isIncrementing;
    int val;

    RunnableTest(int counter, boolean isIncrementing, int val){
        this.counter = counter;
        this.isIncrementing = isIncrementing;
        this.val = val;
    }

    @Override
    public void run() {
        try{
        while(isIncrementing && this.counter <= this.val){
            System.out.println(this.counter);
            this.counter++;
            Thread.sleep(10);
        }
        while(!isIncrementing && this.counter >= this.val){
            System.out.println(this.counter);
            this.counter--;
            Thread.sleep(10);
        }}
        catch(InterruptedException e){
            return;
        }
    }

    public static void main(String[] args) {
        Runnable TA = new RunnableTest(1, true,1000);
        Runnable TB = new RunnableTest(1000, false, 1);
        new Thread(TA).start();
        new Thread(TB).start();
    }
}