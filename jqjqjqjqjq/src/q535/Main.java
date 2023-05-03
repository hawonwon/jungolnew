package q535;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		sc.close();
		int score = (int)(d*10)/10;
//		System.out.println(score);
		switch (score) {
		case 4:
			System.out.println("scholarship");
			
			break;
		case 3:
			System.out.println("next semester");
			
			break;
		case 2:
			System.out.println("seasonal semester");
			
			break;
		case 1:
			System.out.println("retake");
			
			break;
		case 0:
			System.out.println("retake");
			
			break;

		default:
			break;
		}
	}

}
