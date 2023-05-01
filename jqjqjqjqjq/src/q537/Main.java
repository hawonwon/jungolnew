package q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		sc.close();
		//1.while
//		int x = 0;
//		int y = 0;
//		
//		while(x < input & input <101){
//			x++;
//			y = y+x;
//			
//		};
//		System.out.println(y);
		
		//2.for
//		int num = 0;
//		for(int i=0; i<=input; i++) {
//			num = num+i;
//		};
//		System.out.println(num);
//		
		//3.do~while
		int z = 0;
		int p = 0;
		do {
			p++;
			z += p;
			
		}while(p<input);
		System.out.println(z);
	}

}
