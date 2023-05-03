package q110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("yard? ");
		sc.close();
		
		double in = sc.nextDouble();
		double yard = 91.44*in;
//		System.out.println(in + "yard"+" = " + yard + "  ");
		System.out.printf("%.1fyard = %.1fcm", in, yard);
		
		
	}
}
