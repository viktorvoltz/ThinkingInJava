import java.util.Arrays;

/**
 * @author viktorvoltz
 */

class BerylliumSpherex {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class Exercise2{

    static BerylliumSpherex[] b;

    public static BerylliumSpherex[] arraySpherex(int size){
        b = new BerylliumSpherex[size];
        for(int i = 0; i < size; i++){
            b[i] = new BerylliumSpherex();
        }

        return b;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.asList(arraySpherex(30)));
    }
}