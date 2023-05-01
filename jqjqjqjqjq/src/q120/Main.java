package q120;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int i2 = sc.nextInt();
		sc.close();
		if(i >= i2) {
			System.out.println(i - i2);
		}else {
			System.out.println(i2 - i);
		}
	}

}
