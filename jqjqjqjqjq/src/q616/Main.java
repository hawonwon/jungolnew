package q616;

import java.util.Scanner;

class Tri {
	int x, x2, x3, y, y2, y3;
	double result1;
	double result2;
	
	Tri(int x, int y, int x2, int y2, int x3, int y3){
		result1 = (double)(x+x2+x3)/3;
		result2 = (double)(y+y2+y3)/3;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int[][] ar = new int[3][2];
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<2;j++)
//			ar[i][j] = sc.nextInt();
//		}
		int x = sc.nextInt();
		int y = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		Tri r = new Tri(x, y, x2, y2, x3, y3);
		
		System.out.printf("(%.1f, %.1f)",r.result1,r.result2);
	}

}
