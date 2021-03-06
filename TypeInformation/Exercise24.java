/**
 * @author viktorvoltz
 */

import java.util.*;


interface Factory<T> { T create(); } 

interface Null {}

class Part {
	public String toString() {
		return getClass().getSimpleName();
	}
	static List<Factory<? extends Part>> partFactories = 
		new ArrayList<Factory<? extends Part>>();
	static {
		// Collections.addAll() gives an "unchecked generic
		// array creation ... for varargs parameter" warning.
		partFactories.add(new FuelFilter.nFactory());
		partFactories.add(new AirFilter.nFactory());
		partFactories.add(new CabinAirFilter.nFactory());
		partFactories.add(new OilFilter.nFactory());
		partFactories.add(new FanBelt.nFactory());
		partFactories.add(new PowerSteeringBelt.nFactory());
		partFactories.add(new GeneratorBelt.nFactory());
		partFactories.add(new NullPart.nFactory());
	}
	private static Random rand = new Random();
	public static Part createRandom() {
		int n = rand.nextInt(partFactories.size());
		return partFactories.get(n).create();		
	} 
	
	
}

class NullPart extends Part implements Null {
	private NullPart() { super(); }	
	public static final Part NULL = new NullPart();
	public static class nFactory implements Factory<NullPart> {
		public NullPart create() { return (NullPart)NULL; }
	}
	public String toString() { return "NULL"; }
}

class Filter extends Part {}


class FuelFilter extends Filter {
	// Create a Class Factory for each specific type:
	public static class nFactory implements Factory<FuelFilter> {
		public FuelFilter create() { return new FuelFilter(); }
	}
}

class AirFilter extends Filter {
	public static class nFactory implements Factory<AirFilter> {
		public AirFilter create() { return new AirFilter(); }
	}
}

class CabinAirFilter extends Filter {
	public static class nFactory implements Factory<CabinAirFilter> {
		public CabinAirFilter create() { return new CabinAirFilter(); }
	}
}

class OilFilter extends Filter {
	public static class nFactory implements Factory<OilFilter> {
		public OilFilter create() { return new OilFilter(); }
	}
}

class Belt extends Part {}

class FanBelt extends Belt {
	public static class nFactory implements Factory<FanBelt> {
		public FanBelt create() { return new FanBelt(); }
	}
}

class GeneratorBelt extends Belt {
	public static class nFactory implements Factory<GeneratorBelt> {
		public GeneratorBelt create() { return new GeneratorBelt(); }
	}
}

class PowerSteeringBelt extends Belt {
	public static class nFactory implements Factory<PowerSteeringBelt> {
		public PowerSteeringBelt create() { return new PowerSteeringBelt(); }
	}
}

class RegisteredFactories {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++)
			System.out.println(Part.createRandom());
	}
}