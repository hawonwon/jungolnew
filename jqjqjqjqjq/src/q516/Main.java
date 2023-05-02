package q516;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		char c =' ';
		c = sc.next().charAt(0);
		sc.close();
		System.out.printf("%.2f\n%.2f\n%s",d1,d2,c);
		
				
	}

}
