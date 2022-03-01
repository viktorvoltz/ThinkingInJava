class Cycle {
    private String name = "Cycle";
    public void move(Cycle c){
        System.out.println("Cycle " + c);
    }
    public String toString(){
        return this.name;
    }
}

class Unicycle extends Cycle{
    private String name = "UNICYCLE";
    public String toSring(){
        return this.name;
    }
}

class Bicycle extends Cycle{
    private String name = "BICYCLE";
    public String toSring(){
        return this.name;
    }
}

class Tricycle extends Cycle{
    private String name = "TRICYCLE";
    public String toSring(){
        return this.name;
    }
}

public class Exercise1{
    public static void ride(Cycle i){
        i.move(i);
    }

    public static void main(String[] args){
        Tricycle tricycle = new Tricycle();
        Bicycle bicycle = new Bicycle();
        ride(tricycle);
        ride(bicycle);
    }
}