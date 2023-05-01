package q110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Double yard;
		Double in;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("yard?");
		
		in = sc.nextDouble();
		yard = 91.44*in;
//		System.out.println(in + "yard"+" = " + yard + "  ");
		System.out.printf("%.1fyard = %.1fcm", in, yard);
		
		sc.close();
	}
}
