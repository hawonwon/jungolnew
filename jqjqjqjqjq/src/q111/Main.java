package q111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int s = sc.nextInt();
		int d = sc.nextInt();
		int f = sc.nextInt();
		
		System.out.println("sum "+(a+s+d+f));
		System.out.println("avg "+(a+s+d+f)/4);
	}

}
