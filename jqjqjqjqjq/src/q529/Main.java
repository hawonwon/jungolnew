package q529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int ih, iw, x = 0;
		int ih = sc.nextInt();
		int iw = sc.nextInt();
		sc.close();
		int x = iw + 100 - ih;
		System.out.println(x);
		if (ih<= 0 ) {
			return;
		}
		if (x >0) {
			System.out.println("Obesity");
		}
		
	}

}
