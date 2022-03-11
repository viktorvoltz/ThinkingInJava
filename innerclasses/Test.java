/** 
* @author viktorvoltz
*/

enum Real{
    dotnet,
    java
}

abstract class TimeView{
    abstract void mean();
    public TimeView timeView(Real real){
        switch(real){
            case dotnet: return new Dotnet();
            case java: return new Java();
            default: return null;
        }
    }
}


class Dotnet extends TimeView{


    @Override
    void mean() {
        System.out.println("dotnet()");
    }
    
}

class Java extends TimeView{
    Java(){
        mean();
    }

    @Override
    void mean() {
        System.out.println("java()");
    }
    
}

public class Test{
    public static void main(String[] args){
        TimeView d = new Dotnet();
        d.timeView(Real.java);
        //d.mean();
    }
}
