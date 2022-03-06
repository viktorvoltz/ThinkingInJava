class Outer{
    Inner outerMethod(){
        return new Inner();
    }
    class Inner{
        Inner(){
            System.out.println("inner class");
        }

    }

    public static void main(String[] args){
        Outer o = new Outer();
        Outer.Inner n = o.outerMethod();
    }
}