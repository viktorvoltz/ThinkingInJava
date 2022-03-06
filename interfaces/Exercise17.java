interface Days {
	int SUNDAY = 1, MONDAY = 2, TUESDAY = 3, WEDNESDAY = 4, 
		THURSDAY = 5, FRIDAY = 6, SATURDAY = 7; 
}

class Week implements Days {
	private static int count = 0;
	private int id = count++;
	public Week() { System.out.println("Week() " + id); }
}

public class Exercise17 {
	public static void main(String[] args) {
		// Without any objects, static fields exist:
		System.out.println("MONDAY = " + Days.MONDAY);
		Week w1 = new Week();
		// Error: cannot assign a value to final variable SUNDAY:
		// w1.SUNDAY = 2;
	}
}
