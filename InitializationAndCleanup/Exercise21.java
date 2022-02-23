enum Currency{
    NAIRA, DOLLAR, POUNDS, YEN, EURO, KUWAIT
}

public class Exercise21 {
    public static void main(String[] args){
        for(Currency c : Currency.values()){
            System.out.println(c + ", ordinal " + c.ordinal());
        }
    }
}
