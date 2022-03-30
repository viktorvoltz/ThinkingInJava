class CountedObject {
    private static long counter = 0;
    private final long id = counter++;

    public long id() {
        return id;
    }

    public String toString() {
        return "CountedObject " + id;
    }
}

class Main{
    public static void main(String[] args) {
        CountedObject countedObject = new CountedObject();
        CountedObject countedObject2 = new CountedObject();
        CountedObject countedObject3 = new CountedObject();

        System.out.println(new CountedObject());
    }
}