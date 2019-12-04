class Valeur{
    private int val;

    Valeur(int val){
        this.val = val;
    }
    public int getVal(){
        return this.val;
    }
    public synchronized void add(int i){
        this.val +=i;
    }
    public String toString(){
        return "Valeur : " + this.val;
    }
}