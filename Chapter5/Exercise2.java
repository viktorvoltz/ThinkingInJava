import java.util.Random;

public class Exercise2 {
    public static void main(String[] args){
        Random rand = new Random();
        int newRand = 0;
        int randStore;
        for(int i = 1; i <= 25; i++){
            randStore = newRand;
            newRand = 1 + rand.nextInt(20);
            System.out.println("new Rand: " + newRand);
            if(newRand > randStore)
                System.out.println("next is greater than " + newRand + ", " + randStore);
            else if(newRand < randStore)
                System.out.println("former is greater than " + randStore + ", " + newRand);
            else if(newRand == randStore)
                System.out.println("equality " + randStore + ", " + newRand);
        }
    }
}
