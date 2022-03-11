/** 
* @author viktorvoltz
*/

interface Contents{
    int value();
}

class Anon {
    class Mycontents implements Contents{
        int i = 5;
        @Override
        public int value(){
            return i;
        }
    }
}
