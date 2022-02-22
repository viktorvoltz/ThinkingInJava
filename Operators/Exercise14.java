public class Exercise14 {
    private static void comparator(String arg1, String arg2){
        System.out.println(arg1 == arg2);
        System.out.println(arg1 != arg2);
        System.out.println(arg1.equals(arg2));
    }

    public static void main(String[] args){
        String Chinonso = "Chinonso";
        String Chinyeaka = "Chinyeaka";
        comparator(Chinonso, Chinyeaka);
    }
}
