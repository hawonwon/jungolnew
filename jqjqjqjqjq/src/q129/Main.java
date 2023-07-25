package q129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c;
		do {
			int base = sc.nextInt();
			int height = sc.nextInt();
			System.out.print("Base = ");
			
//			System.out.print(base+"\n");
			
			System.out.print("Height = ");
			
//			System.out.println(height);
			
			System.out.printf("Triangle width = %.1f\n",(double)base*height/2);
			System.out.print("Continue? ");
			c = sc.next().charAt(0);
//			System.out.println(c);
			
		}while(c=='y'|c=='Y');
		
	}

}
