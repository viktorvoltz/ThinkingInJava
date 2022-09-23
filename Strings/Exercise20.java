import java.util.*;

class Scanner20 {
	int i;
	long L;
	float f;
	double d;
	String s;
	Scanner20(String s) {
		Scanner sc = new Scanner(s);
		i = sc.nextInt();
		L = sc.nextLong();
		f = sc.nextFloat();
		d = sc.nextDouble();
		this.s = sc.next(); 		
	}
	public String toString() {
		return i + " " + L + " " + f + " " + d + " " + s;
	}
	public static void main(String[] args) {
		Scanner20 s20 = new Scanner20("17 56789 2.7 3.61412 hello");
		System.out.println(s20);
	}
}