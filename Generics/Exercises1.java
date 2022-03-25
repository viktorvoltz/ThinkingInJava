class Pet{
    Pet(){
        System.out.println("general Pet class");
    }

    @Override
    public String toString() {
        return "general Pet class";
    }
}

class Dog extends Pet{
    private String name;
    Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}




class Holder3<T>{
    private T a;
    public Holder3(T a){
        this.a = a;
    }

    public void set(T a){
        this.a = a;
    }

    public T get(){
        return a;
    }

    public static void main(String[] args) {
        Holder3<Pet> h3 = new Holder3<Pet>(new Pet());

        Pet a  = h3.get();
        System.out.println(h3.get());

        //h3 can also hold a subclass of pet
        h3.set(new Dog("Bingo"));
        System.out.println(h3.get());
    }
}