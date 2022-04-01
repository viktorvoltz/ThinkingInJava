import java.util.*;

class ArrayReverseSearching {
    public static void main(String[] args) {
        Random rand = new Random(20);
        Integer[] a = new Integer[rand.nextInt(30)];
        for(int i = 0; i < a.length; i++){
            a[i] = new Integer(i * rand.nextInt(22));
        }

        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Reverse Sorted array: " + Arrays.toString(a));
    }
}