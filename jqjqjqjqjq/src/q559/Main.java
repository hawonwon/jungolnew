package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] s = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int i2 = sc.nextInt();
		double sum = (s[i-1]+s[i2-1]);
		System.out.printf("%.1f",sum);
	}

}
