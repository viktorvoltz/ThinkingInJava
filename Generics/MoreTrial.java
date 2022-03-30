import java.util.*;

class GenericArray<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(int sz) {
        array = (T[]) new Object[sz];
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    // Method that exposes the underlying representation:
    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<Integer>(10);
        // This causes a ClassCastException:
        // ! Integer[] ia = gai.rep();
        // This is OK:
        Object[] oa = gai.rep();
    }
}

interface Fruit{

}
class Apple implements Fruit{

}

class Pear extends Apple{

}

class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Pear());
        Apple a = (Apple) flist.get(0); // No warning
        flist.contains(new Pear()); // Argument is ‘Object’
        flist.indexOf(new Pear()); // Argument is ‘Object’
    }
}