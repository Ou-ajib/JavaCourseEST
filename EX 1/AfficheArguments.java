class AfficheArguments {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("vous n'avez entrer aucun argument.");
            return;
        }
        for(int i=0;i<args.length;i++)
            System.out.println("L'argument "+i+" est : "+args[i]);
    }
}