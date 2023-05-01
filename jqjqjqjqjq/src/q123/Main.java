package q123;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Number? ");
		int i = sc.nextInt();
		sc.close();
		switch (i){
		
		case 1: 
			System.out.println("dog");
			break;
		case 2: 
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
		default :
			System.out.println("I don't know.");
			break;
		}
		
	}

}
