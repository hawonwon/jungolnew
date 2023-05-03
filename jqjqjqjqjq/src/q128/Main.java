package q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int count35 = 0;
		

		while (true) {
			int i = sc.nextInt();
			if (i == 0) {

				break;
			}
			++count;
			if (i%5 ==0|i % 3 == 0 | i==3) {
				count35++;
			}
			
			

		}
		System.out.println(count - count35);
	}

}
