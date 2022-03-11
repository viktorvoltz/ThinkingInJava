/**
 * @author viktorvoltz
 */

import java.util.*;

class Gerbil{
    int gerbilNumber;
    Gerbil(){
        gerbilNumber = 3;
    }

    int hop(){
        return gerbilNumber++;
    }

    public static void main(String[] args){
        ArrayList<Gerbil> g = new ArrayList<Gerbil>();
        Gerbil gerbil = new Gerbil();
        g.add(gerbil);
        g.add(gerbil);
        g.add(gerbil);
        g.add(gerbil);
        for(int i = 0; i < g.size(); i++){
            System.out.println(g.get(i).hop());
        }
    }
}