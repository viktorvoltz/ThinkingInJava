import java.util.Arrays;

/**
 * @author viktorvoltz
 */

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class Exercise1 {

    public static String arrayMethod(BerylliumSphere[] berylliumSpheres) {
        return Arrays.toString(berylliumSpheres);
    }

    public static void main(String[] args) {
        //arg passed dynamically
        arrayMethod(new BerylliumSphere[] { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() });

        BerylliumSphere[] b = {new BerylliumSphere()}; //ordinary aggregate initialization
        BerylliumSphere[] d;
        d = new BerylliumSphere[]{new BerylliumSphere()};//dynamic aggregate initialization


        System.out.println(arrayMethod(b));
        System.out.println(arrayMethod(d));
    }
}