import java.util.*;

class VariableSizeStack<T> { 
	private ArrayList<T> storage = new ArrayList<T>();
    	public int count() {
		return storage.size();
    	} 
    	public void push(T item) { 
		storage.add(item); 
    	}
    	public T pop() { 
		return storage.remove(storage.size() - 1);
    	}
}

class GenericCast {
 	public static void main(String[] args) {
        	VariableSizeStack<String> strings =
            		new VariableSizeStack<String>();
        	for(String s : "A B C D E F G H I J".split(" "))
            		strings.push(s);
		int currentCount = strings.count();
		for(int i = 0; i < currentCount; i++) {
            	String s = strings.pop();
            	System.out.print(s + " ");
		}	    
    	}        
}