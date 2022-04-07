import java.util.*;
import java.util.concurrent.*;

/**
 * @author viktorvoltz
 */

interface Generator<T> {
    T next();
}

class Genx implements Generator<String> {

    String[] d = ("home away hello there lot nolax prod " + "twenty teo po op ex").split(" ");
    int i;

    public String next() {
        return d[i++];
    }

}

class QueueBehavior {
    private static int count = 10;

    static <T> void test(Queue<T> queue, Generator<T> gen) {
        for (int i = 0; i < count; i++)
            queue.offer(gen.next());
        while (queue.peek() != null)
            System.out.print(queue.remove() + " ");
        System.out.println();
    }

    static class Gen implements Generator<String> {
        String[] s = ("one two three four five six seven " +
                "eight nine ten").split(" ");
        int i;

        public String next() {
            return s[i++];
        }
    }
    

    public static void main(String[] args) {
        test(new LinkedList<String>(), new Gen());
        test(new LinkedList<String>(), new Genx());
        test(new PriorityQueue<String>(), new Gen());
        test(new PriorityQueue<String>(), new Genx());
        test(new ArrayBlockingQueue<String>(count), new Gen());
        test(new ArrayBlockingQueue<String>(count), new Genx());
        test(new ConcurrentLinkedQueue<String>(), new Gen());
        test(new ConcurrentLinkedQueue<String>(), new Genx());
        test(new LinkedBlockingQueue<String>(), new Gen());
        test(new LinkedBlockingQueue<String>(), new Genx());
        test(new PriorityBlockingQueue<String>(), new Gen());
        test(new PriorityBlockingQueue<String>(), new Genx());
    }
}