/**
 * @author viktorvoltz
 */

class Outer{
    public class Inner{
        public Inner(String stringouter){
            System.out.println("in.leech");
        }
    }
}

class SecondOuter{
    public SecondOuter(Outer outer){
        new SecondInner(outer);
    }
    public class SecondInner extends Outer.Inner{

        public SecondInner(Outer outer) {
            outer.super("outer");
        }     
    }

    public static void main(String[] args){
        Outer outer1 = new Outer();
        SecondOuter so = new SecondOuter(outer1);
        //SecondInner si = so.new SecondInner(outer1);
        
    }
}