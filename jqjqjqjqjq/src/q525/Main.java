package q525;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int r2 = (x==y)&(x==z) ? 1:0;
		int r = (x > z)&(x>y) ? 1:0;
		
		System.out.print(r+" "+r2);
	}

}
