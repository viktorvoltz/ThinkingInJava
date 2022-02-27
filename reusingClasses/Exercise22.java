class SmallBrain{}

final class Dinosaur{
    int i = 7;
    int j = 1;

    SmallBrain x = new SmallBrain();
    void f(){}
}

public class Exercise22 extends Dinosaur{
    //! error: cannot extend a final class i.e Dinosaur
}
