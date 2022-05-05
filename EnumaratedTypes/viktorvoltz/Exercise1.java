package viktorvoltz;
import static viktorvoltz.Signal.*;

public class Exercise1 {

    Signal color = RED;
    public void change(){
        switch(color){
            case RED: color = GREEN; break;
            case GREEN: color = YELLOW; break;
            case YELLOW: color = RED; break;
        }
    }
    @Override
    public String toString() {
        return "Traffic Light is: " + color;
    }
    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        for (int i = 0; i < 7; i++){
            System.out.println(exercise1);
            exercise1.change();
        }
    }
}
