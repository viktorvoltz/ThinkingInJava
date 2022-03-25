class Pay{
    private String name;
    public Pay(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Exercise2<T>{
    private T a, b, c;

    public Exercise2(T a, T b, T c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(T a){
        this.a = a;
    }
    public void setB(T b){
        this.b = b;
    }
    public void setC(T c){
        this.c = c;
    }

    @Override
    public String toString() {
        return a + ", " + b +", " + c;
    }

    public static void main(String[] args) {
        Pay a = new Pay("master card");
        Pay b = new Pay("visa card");
        Pay c = new Pay("verve card");

        Exercise2<Pay> ex = new Exercise2<Pay>(a, b, c);
        System.out.println("Output: " + ex);
    }
}