package q513b;

public class Main {
	public static void main(String[] args) {
		double yd = 91.44;
		double in = 2.54;
		
		
		//2
		System.out.printf("%4.1f%s = %.1f%s\n", 2.1, "yd", 2.1 * yd,"cm");
		System.out.printf("%.1f%s = %5.1f%s\n", 10.5, "in", 10.5 * in,"cm");
		
		//선생님
		System.out.printf(" 2.1yd = %.1fcm\n", yd * 2.1);
		System.out.printf("10.5in = %5.1fcm\n", in * 10.5);
		
	}
}
