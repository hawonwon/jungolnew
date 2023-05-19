package q115;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int h =sc.nextInt();
		int w = sc.nextInt();
		int h2 =sc.nextInt();
		int w2 = sc.nextInt();
		
		int r =(h>h2)&(w>w2) ? 1:0;
		System.out.println(r);
	}

}
