/**
 * @author viktorvoltz
 */

class SimpleException extends Exception{
    public SimpleException(String msg){
        super(msg);
    }
}

class TestClass{

    public static void g() throws SimpleException{
        throw new SimpleException("i'm in g()");
    }
    public static void main(String[] args){
        try{
            g();
        }catch(SimpleException e){
            e.printStackTrace(System.out);
        }finally{
            System.out.println("is this real?");
        }
    }

}