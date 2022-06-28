interface Generator<T> {
    T next();
}

class Fibonacci1 implements Runnable, Generator<Integer> {

    private int count = 0;

    @Override
    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2)
            return 1;
        return fib(n - 2) + fib(n - 1);
    }

    @Override
    public void run() {
        Fibonacci1 gen = new Fibonacci1();
        for (int i = 0; i < 18; i++)
            System.out.print("fib1: " + gen.next() + " ");
    }

}

class Fibonacci2 implements Runnable, Generator<Integer> {

    private int count = 0;

    @Override
    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2)
            return 1;
        return fib(n - 2) + fib(n - 1);
    }

    @Override
    public void run() {
        Fibonacci2 gen = new Fibonacci2();
        for (int i = 0; i < 5; i++)
            System.out.print("fib2: " + gen.next() + " ");
    }

}

public class Exercise2 {
    public static void main(String[] args) {
		Thread t1 = new Thread(new Fibonacci1());
        Thread t2 = new Thread(new Fibonacci2());
		t1.start();
        t2.start();
	}
}
