import java.util.*;

/**
 * @author viktorvoltz
 */

class RandomInstrumentGenerator {
	private Random rand = new Random();
	public Instrument next() {
		switch(rand.nextInt(7)) {
			default:
			case 0: return new Wind();
			case 1: return new Percussion();
			case 2: return new Stringed();
			case 3: return new Keyboard();
			case 4: return new Brass();
			case 5: return new Woodwind();
			case 6: return new Piano();
		}
	}
 }


enum Note{
    MIDDLE_C,
    C_SHARP,
    B_FLAT
}

class Instrument {
	void play(Note n) { System.out.println("Instrument.play() " + n); }
	public String toString() { return "Instrument"; }
	void adjust() { System.out.println("Adjusting Instrument"); }
}

class Wind extends Instrument {
	void play(Note n) { System.out.println("Wind.play() " + n); }
	public String toString() { return "Wind"; }
	void adjust() { System.out.println("Adjusting Wind"); }
	void clearSpitValve() { System.out.println("Wind clearing spit valve"); }
}

class Percussion extends Instrument {
	void play(Note n) { System.out.println("Percussion.play() " + n); }
	public String toString() { return "Percussion"; }
	void adjust() { System.out.println("Adjusting Percussion"); } 
}

class Stringed extends Instrument {
	void play(Note n) { System.out.println("Stringed.play() " + n); }
	public String toString() { return "Stringed"; }
	void adjust() { System.out.println("Adjusting Stringed"); } 
}

class Keyboard extends Instrument {
	void play(Note n) { System.out.println("Keyboard.play() " + n); }
	public String toString() { return "Keyboard"; }
	void adjust() { System.out.println("Adjusting Keyboard"); } 
}

class Brass extends Wind {
	void play(Note n) { System.out.println("Brass.play() " + n); }
	public String toString() { return "Brass"; }
	void adjust() { System.out.println("Adjusting Brass"); }
	void clearSpitValve() { System.out.println("Brass clearing spit valve"); }
}

class Woodwind extends Wind {
	void play(Note n) { System.out.println("Woodwind.play() " + n); }
	public String toString() { return "Woodwind"; }
	void clearSpitValve() { System.out.println("Woodwind clearing spit valve"); }
}

class Piano extends Keyboard {
	void play(Note n) { System.out.println("Piano.play() " + n); }
	public String toString() { return "Piano"; }
}

class Music26 {
	// Doesn't care about type, so new types
	// added to the system still work right:
	public static void tune(Instrument i) {
		//...
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();	
	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument[] orchestra = new Instrument[20];
		// fill up orchestra array wth instruments:
		for(int i = 0; i < orchestra.length; i++)
			orchestra[i] = gen.next();
		for(Instrument i : orchestra) {
			if(i instanceof Wind) // get RTTI
				((Wind)i).clearSpitValve();
			i.adjust();
		}
		tuneAll(orchestra);
	}
}