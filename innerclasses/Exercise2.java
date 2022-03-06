class Big{
    private String name;
    public Big(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
}

class Sequence{
    private Big[] items;
    private int next;
    public Sequence(int size){
        items = new Big[size];
        add();
    }

    Big b = new Big("nonso");
    public void add(){
        for(next = 0; next < items.length; next++){
            items[next] = b;
        }
    }

    public static void main(String[] args){
        Sequence sequence = new Sequence(5);
        System.out.println(sequence.b);
    }
}
