import java.util.*;

class ArraySearching {
    public static void main(String[] args) {
        Random rand = new Random(20);
        Integer[] a = new Integer[rand.nextInt(30)];
        for(int i = 0; i < a.length; i++){
            a[i] = new Integer(i * rand.nextInt(22));
        }
        //Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
        while (true) {
            int r = rand.nextInt(a.length);
            int location = Arrays.binarySearch(a, r);
            if (location >= 0) {
                System.out.println("Location of " + r + " is " + location +
                        ", a[" + location + "] = " + a[location]);
                break; // Out of while loop
            }
        }
    }
}
