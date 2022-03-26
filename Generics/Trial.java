public class Trial {
    private int size = 1;

    public int next(){
        int b = size * 2;
        return b;
    }

    class Checker{
        int count = size;

        public int next(){
            return Trial.this.next();
        }
    }

    public static void main(String[] args) {
        Trial trial = new Trial();
        Checker checker = trial.new Checker();

        System.out.println(checker.next());

    }
}
