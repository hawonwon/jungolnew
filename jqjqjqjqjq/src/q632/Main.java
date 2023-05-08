package q632;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		sc.close();
		int n = (i< i2)? i:i2;
		n = (i2< i)? i2:i;
		n= (i2 <i3)? i2:i3;
		n = (i< i3) ? i : i3;
		System.out.println(n);
	}

}
