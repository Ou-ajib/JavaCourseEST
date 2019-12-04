class Ajob implements Runnable{
    Valeur myVal;
    int i;

    public Ajob(Valeur v, int i){
        this.myVal = v;
        this.i = i;
    }
    
    @Override
    public void run() {
        for(int j = 0; j < Math.pow(10, 6); j++)
            this.myVal.add(i);
        System.out.println(" La valeur stocke est : "+this.myVal.getVal());
    }
}