package q124;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();

		if (m == 2) {
			System.out.println(28);
		} else if (m == 8) {
			System.out.println(31);
			
		}else if (m % 2 == 0) {
			if (m<8) {
				System.out.println(30);
			}else {
				System.out.println(31);
			}
			
		} else if (m % 2 != 0) {
			if(m<8) {
				System.out.println(31);
			}else {
				System.out.println(30);
			}
			
		}

	}

}
