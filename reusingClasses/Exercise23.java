class One {
    static int one = printInit("one.initiaalized");
    static int printInit(String s){
        System.out.println(s);
        return 1;
    }
}

class Two extends One{
    static int two = printInit("two.initialized");
    Two(){
        System.out.println("two constructor");
    }
}

class Three {
    static int n = printInit("Three.initialized");
    static One one = new One();
    Three(){
        System.out.println("Three construtor");
    }

    static int printInit(String s){
        System.out.println(s);
        return 3;
    }
}

public class Exercise23 extends Two{
    static int i = printInit("Exercise23.initialized");
    Exercise23(){
        System.out.println("Exercise23 constructor");
    }

    public static void main(String[] args){
        System.out.println("main");
        Exercise23 ex = new Exercise23();
        System.out.println(Three.one);
    }
}
