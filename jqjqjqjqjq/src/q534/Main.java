package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		String b = Character.toString(a);
		
		sc.close();
		//1.스위치
		switch (a) {
		case 'A': {
			System.out.println("Excellent");
			break;
		}
		case 'B': {
			System.out.println("Good");
			break;
		}
		case 'C': {
			System.out.println("Usually");
			break;
		}
		case 'D': {
			System.out.println("Effort");
			break;
		}
		case 'F': {
			System.out.println("Failure");
			break;
		}
		default:
			System.out.println("error");
		}
		
		//2.if
		if(b.equals("A")) {
			System.out.println("Excellent");
		}else if(b.equals("B")) {
			System.out.println("Good");
		}else if(b.equals("C")) {
			System.out.println("Usually");
		}else if(b.equals("D")) {
			System.out.println("Effort");
		}else if(b.equals("F")) {
			System.out.println("Failure");
		}else {
			System.out.println("error");
		}
	
	}

}
