package q538;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		
		while(true) {
			System.out.print("number? ");
			int i = sc.nextInt();
			if (i>0) {
				System.out.println("positive integer");
				continue;
			}else if (i<0) {
				System.out.println("negative number");
				continue;
			}else {
				break;
			}
		}
		
	}

}
