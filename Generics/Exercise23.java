interface FactoryI<T> {
	T create(Integer i);
}

class Foo2<T> {
	private T x;
	public void get() { System.out.println(x); }
	public <F extends FactoryI<T>> Foo2(F factory, Integer i) {
		x = factory.create(i);
	}
}

class IntegerFactory implements FactoryI<Integer> {
	public Integer create(Integer i) {
		return new Integer(i);
	}
}

class Widget {
	int i;
	public static class Factory implements FactoryI<Widget> {
		public Widget create(Integer i) {
			Widget w = new Widget();
			w.i = i;
			return w;
		}
	}
	public String toString() {
		return "Widget " + i;	
	}
}

class FactoryConstraint23 {
	public static void main(String[] args) {
		Foo2<Integer> f1 = new Foo2<Integer>(new IntegerFactory(), 1);
		Foo2<Widget> f2 = new Foo2<Widget>(new Widget.Factory(), 2);
		f1.get();
		f2.get();
		}
}