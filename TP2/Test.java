class Test{
    public static void main(String[] args) {
        Valeur myVal = new Valeur(10);
        Runnable job1 = new Ajob(myVal, 6);
        Runnable job2 = new Ajob(myVal, -10);
        new Thread(job1).start();
        new Thread(job2).start();
        System.out.println(" La valeur stocke est : "+myVal.getVal());
    }
}