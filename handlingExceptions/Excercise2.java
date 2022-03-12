/**
 * @author viktorvoltz
 */

class HelloClass{
    int b = 1;
    int sin(){
        return b;
    }
}

class ErrorHandler{
    static HelloClass helloClass = new HelloClass();
    public static void main(String[] args){
        helloClass = null;
        try{
        System.out.println(helloClass.sin());
        }catch(Exception e){
            e.printStackTrace(System.out);
        }
    }
}
