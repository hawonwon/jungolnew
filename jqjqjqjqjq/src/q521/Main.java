package q521;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int i2 = scanner.nextInt();
	    i++;
	    --i2;
		System.out.printf("%d %d %d",i,--i2,i*i2);
	}

}
