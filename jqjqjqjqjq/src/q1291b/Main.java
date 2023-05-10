package q1291b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x > 1 & x < 10 & y > 1 & y < 10) {

				if (x > y) {

					for (int i2 = 1; i2 < 10; i2++) { //총 9줄 써야함

						for (int i3 = x; i3 >= y; i3--) { // 입력한 값을 이용함

							System.out.printf("%d * %d = %2d   ", i3, i2, i3 * i2);

							if (i3 == y) {
								System.out.println(); // 단을 변경 해야함

							}
						}

					}
					break;

				} else {
					for (int i2 = 1; i2 < 10; i2++) {

						for (int i3 = x; i3 <= y; i3++) {

							System.out.printf("%d * %d = %2d   ", i3, i2, i3 * i2);

							if (i3 == y) {
								System.out.println();
							}
						}

					}
					break;
				}

			} else {
				System.out.println("INPUT ERROR!");
				continue;
			}

		}

	}
}

//if (x > y) {
//for (int i = x; i >= y; i--) {
//	
//	for (int i2 = 1; i2 < 10; i2++) {
//		System.out.println(i + " * " + i2 + " = " + i * i2);
//
//	}
//}
//}else {
//for (int i = x; i <= y; i++) {
//
//	for (int i2 = 1; i2 < 10; i2++) {
//		System.out.println(i + " * " + i2 + " = " + i * i2);
//
//	}
//}
//}//
