package q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i[] = new int[100];
		int a = 0;
		for (int n = 0; n < 100; n++) {
			i[n] = sc.nextInt();
			a++;
			if (i[n] == 0) {
				a--;
				break;
			}
		}
		while (a > 0) {
			--a;
			System.out.print(i[a] + " ");
		}

	}
}
