/**
 * @author viktorvoltz
 */

class MyException extends RuntimeException {
    static String storedValue;

    MyException(String ref) {
        super(ref);
        storedValue = ref;
    }

    public void meth() {
        System.out.println(storedValue);
    }
}

public class Exercise28 {
    public static void f() throws MyException {
        System.out.println("f()");
        throw new MyException("Ouch from f()");
    }

    public static void main(String[] args) {
        f();
    }
}
