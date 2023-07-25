package q1304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = 1;
		int[][] ar = new int[n][m];
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				for(int j=0;j<m;j++) {
					ar[i][j] = c;
					c++;
				
				}
			}
			else {
				for(int j=m-1;j>=0;j--) {
					ar[i][j] =c++;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
