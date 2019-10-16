class TestSolo{
    public static void main(String[] args){
        Solo<Integer> s1 = new Solo(10);
        System.out.println(s1.getValue());
        Solo<String> s2 = new Solo("Hello");
        System.out.println(s2.getValue());
    }
}