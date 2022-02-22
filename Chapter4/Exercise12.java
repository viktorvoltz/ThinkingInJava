public class Exercise12 {
	public static void main(String [] args) {
		int j = -1;
		System.out.println(Integer.toBinaryString(j));
		j <<= 10;
		System.out.println(Integer.toBinaryString(j));
		for(int i = 0; i < 32; i++) {
			j >>>= 1;
			System.out.println(Integer.toBinaryString(j));
		}
	}
}
