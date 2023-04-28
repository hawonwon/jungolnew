package q530;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();
		if (i >= 20) {
			System.out.println("adult");
		}else {
			System.out.println((20 - i) + " years later");
		}
	}

}
