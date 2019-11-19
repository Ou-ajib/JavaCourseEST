class Ajob implements Runnable{
    Valeur myVal;
    int i;
    static int k = 0;

    public Ajob(Valeur v, int i){
        this.myVal = v;
        this.i = i;
        if (k == 0){
            this.k += (i +v.getVal()) ;
        }
    }
    
    @Override
    public void run() {
        if (i<0){
        for(int j = 0; j < Math.pow(10, 6); j++){
            this.myVal.add(i);
            if(i < 0 && this.k < 0){
                this.myVal.add(k);
            }
            if(i > 0 && this.k > 0){
                this.myVal.add(k);
            }
    }
    }}
}