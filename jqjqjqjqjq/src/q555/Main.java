package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		char[] s = new char[10];

		for (int i = 0; i < 10; i++) {
			s[i] = sc.next().charAt(0);
			System.out.printf("%c", s[i]);
		}
		sc.close();
	}

}
