public class Exercise20 {
    public static void rmain(String... args){
        for(String i : args){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        rmain("hello", " world", "hhjjj");
    }
}
