import java.util.Random;

interface Generator<T>{
    T next();
}

enum Cartoon implements Generator<Cartoon>{
    SLAPPY, SPANKY, SILLY, NUTTY;
    private Random rand = new Random(47);
    @Override
    public Cartoon next() {
        return values()[rand.nextInt(values().length)];
    }
    
}
