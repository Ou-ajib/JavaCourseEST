class Compteur extends Thread{
    int maxValue;
    String nom;

    Compteur(String nom,int maxValue){
        this.maxValue = maxValue;
        this.nom = nom;
        this.start();
    }

    public void run() {
        int val = 1;
        try{
        while(val <= this.maxValue){
            System.out.println("Nom : " + nom + " Value : " + val);
            val++;
            Thread.sleep(Math.round(Math.random()));
        }
        }
        catch(InterruptedException e){
            return;
        }
    }
}