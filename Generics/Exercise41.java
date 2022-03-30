/**
 * @author viktorvoltz
 */


import java.util.*;

interface Addable<T> { void add(T t); }

interface Generator<T> {T next();}

class Pet{

}

class SimpleQueue<T> implements Iterable<T> { 
    private LinkedList<T> storage = new LinkedList<T>(); 
    public void add(T t) { storage.offer(t); } 
    public T get() { return storage.poll(); } 
    public Iterator<T> iterator() { 
    return storage.iterator(); 
    } 
   } 

class Manx extends Pet{

}

class Pug extends Pet{

}

class Gerbil extends Pet{
    
}

class Fill41 {
	// Classtoken version:
	public static <T> void fill(Addable<T> addable, 
	Class<? extends T> classToken, int size) {
		for(int i = 0; i < size; i++) 
			try {
				addable.add(classToken.newInstance());
			} catch(Exception e) {
				throw new RuntimeException(e);
			}
	}
	// Generator version:
	public static <T> void fill(Addable<T> addable, 
	Generator<T> generator, int size) {
		for(int i = 0; i < size; i++)
			addable.add(generator.next());
	}
}

// To adapt a base type, your must use composition.
// Make any Collection Addable using composition:
class AddableCollectionAdapter<T> implements Addable<T> {
	private Collection<T> c;
	public AddableCollectionAdapter(Collection<T> c) {
		this.c = c;
	}
	public void add(T item) { c.add(item); }
}

// A helper to capture the type automatically:
class Adapter {
	public static <T> 
	Addable<T> collectionAdapter(Collection<T> c) {
		return new AddableCollectionAdapter<T>(c);		
	}
}

// To adapt a specific type, you can use inheritance.
// Make a SimpleQueue Addable using inheritance:
class AddableSimpleQueue<T>
extends SimpleQueue<T> implements Addable<T> {
	public void add(T item) { super.add(item); }
}

class Fill41Test {
	public static void main(String[] args) {
		// Adapt a collection:
		List<Pet> pets = new ArrayList<Pet>();
		Fill41.fill(
			new AddableCollectionAdapter<Pet>(pets),
			Pet.class, 3);
		// Helper method captures the type:
		Fill41.fill(Adapter.collectionAdapter(pets), Manx.class, 2);
		for(Pet p : pets) System.out.println(p);
		System.out.println("---------------");
		// Use an adapted class:
		AddableSimpleQueue<Pet> petQueue = 
			new AddableSimpleQueue<Pet>();
		Fill41.fill(petQueue, Pug.class, 4);
		Fill41.fill(petQueue, Gerbil.class, 1);
		for(Pet p : petQueue) System.out.println(p);		
	}
}