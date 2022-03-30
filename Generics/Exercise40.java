/**
 * @author viktorvoltz
 */
import java.lang.reflect.*;
import java.util.*;

class Pet{

}

class Apply40 {
	public static <T,S extends Iterable<? extends T>> void apply(S seq, Method f, Object... args) {
		try {
			for(T t : seq)
				f.invoke(t, args);
		} catch(Exception e) {
			// Failures are programmer errors
			throw new RuntimeException(e);
		}
	}
}

class FilledList<T> extends ArrayList<T> {	
	public FilledList(Class<? extends T> type, int size) {
		try {
			for(int i = 0; i < size; i++)
				// Assumes default constructor:
				add(type.newInstance());
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}

class ApplyTest40 {
	public static void main(String[] args) throws Exception {
		List<Pet> pets = new ArrayList<Pet>(10);
		System.out.println("Random pets: " + pets);

		Apply40.apply(pets, Pet.class.getMethod("speak"));

		Apply40.apply(new FilledList<Pet>(Dog.class, 5), Pet.class.getMethod("speak"));
	}
}