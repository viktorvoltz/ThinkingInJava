
abstract class Noinstance{
    Noinstance(){
        System.out.println("abstr constr");
    }
    public abstract void meth();

    public abstract void eth();

    public void try4(){

    }
}

interface Test{
    int name = 5;

    void func();
}

interface Test2 extends Test{
    void destroy();
}



class Waveform implements Test{
    public static String name = "name";
    public String toString(){
        String d = "Wave";
        return d;
    }

    @Override
    public void func(){
        System.out.println("func()");
    }
}

class Troy extends Waveform implements Test2{

    @Override
    public void destroy(){
        func();
    }
}

public class Exercise2 extends Noinstance{

    @Override
    public void meth() {
        System.out.println("hello meth");
        
    }

    @Override
    public void eth(){
        System.out.println("hello eth");
    }

    static void upcast(Test g){
        g.func();
    }

    public static void main(String[] args){
        Waveform w = new Waveform();
        Exercise2 ex = new Exercise2();
        upcast(w);
        ex.meth();
        ex.eth();
        System.out.println(w);
    }
    // Error; cant instantiate class
   // Noinstance none = Noinstance();
}
