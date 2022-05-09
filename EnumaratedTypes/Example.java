/**
 * @author viktorvoltz
 */
public enum Example {
    WALK("press to walk"),
    RUN("press to run"),
    JUMP("press to jump"),
    SIT("press to sit");

    private String description;

    private Example(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        String id = name(); //name from java.lang.Enum.name()
        return id;
    }

    public String getDescription(){
        return description;
    }

    public static void main(String[] args) {
        for(Example e : Example.values()){
            System.out.println(e + ": " + e.getDescription());
        }
    }
}
/*
WALK: press to walk
RUN: press to run
JUMP: press to jump
SIT: press to sit
*/