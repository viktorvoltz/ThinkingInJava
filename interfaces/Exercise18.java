interface Cycle{
    void ride();
}

interface CycleFactory{
    Cycle getCycle();
}

class Unicycle implements Cycle{
    @Override
    public void ride(){
        System.out.println("unicycle ride");
    }

    public String toString(){
        String d = "unicycle";
        return d;
    }
}

class UnicycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
    
}

class Bicycle implements Cycle{
    @Override
    public void ride(){
        System.out.println("bicycle ride");
    }

    public String toString(){
        String d = "Bicycle";
        return d;
    }
}

class BicycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
    
}

class Tricycle implements Cycle{
    @Override
    public void ride(){
        System.out.println("tricycle ride");
    }

    public String toString(){
        String d = "Tricycle";
        return d;
    }
}

class TricycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
    
}

public class Exercise18 {
    public static void rideCycle(CycleFactory factory) {
		Cycle c = factory.getCycle();
		c.ride();
	}
	public static void main(String [] args) {
		rideCycle(new UnicycleFactory());
		rideCycle(new BicycleFactory());
		rideCycle(new TricycleFactory());	
	}
}
