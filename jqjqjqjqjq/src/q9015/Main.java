package q9015;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하시오. ");
		int i = sc.nextInt();
		int i2 = sc.nextInt();
		System.out.println(i + " + " + i2 + " = " + (i+i2));
		System.out.println(i + " * " + i2 + " = " + (i*i2));
		sc.close();
	}

}
