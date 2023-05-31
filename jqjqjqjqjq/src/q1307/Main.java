package q1307;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char a = 'A';
		
		char[][] rec = new char[n][n];
		
		for(int i=n-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				
				rec[j][i] = a;
				a++;
				if(a == '[') {
					a ='A';
				}
				
			}
			
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(rec[i][j]+" ");
			}
			System.out.println();
		}
	}

}
