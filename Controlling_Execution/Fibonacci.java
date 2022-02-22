public class Fibonacci {
    static void fibonacci(int range){
        int sum = 0;
        int i = 1;
        int j = 1;
        System.out.println('1');
        System.out.println('1');
        for(int k = 0; k < range; k++){
            sum = i + j;
            i = j;
            j = sum;
            System.out.println(sum);
        }
    }

    public static void main(String[] args){
        fibonacci(20);
    }
}
