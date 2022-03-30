abstract class SelfBoundedType<T extends SelfBoundedType<T>> {
	abstract T f(T arg);
	T g(T arg) { 
		System.out.println("g(T arg)");
		return f(arg); 
	}	
}

class D extends SelfBoundedType<D> {
	D f(D arg) { 
		System.out.println("f(D arg)");
		return arg; 
	}	
}


public class Exercise34 {
	public static void main(String[] args) {
		D d = new D();
		d.f(d).g(d);
	}
}