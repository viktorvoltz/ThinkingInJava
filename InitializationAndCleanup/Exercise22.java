enum Currency{
    NAIRA, DOLLAR, POUNDS, YEN, EURO, KUWAIT
}

public class Exercise22 {

    static void describe(Currency currency){
        switch(currency){
            case NAIRA: System.out.println("currency for Nigeria"); break;
            case DOLLAR: System.out.println("currency for US"); break;
            case POUNDS: System.out.println("currency for UK"); break;
            case YEN: System.out.println("currency for Japan"); break;
            case EURO: System.out.println("currency for Europe"); break;
            case KUWAIT: System.out.println("currency for Kuwait"); break;
            default: System.out.println("Invalid currency");
        }
    }
    public static void main(String[] args){
        describe(Currency.DOLLAR);
        describe(Currency.NAIRA);
        describe(Currency.KUWAIT);
    }
}
