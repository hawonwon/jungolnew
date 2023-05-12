package q544;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		int x = 0;
		for(;i<=100;i++) {
			x= x+i;
		}
		System.out.println(x);
	}

}
