package q569;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] ar = new int[5][4];
		int cnt = 0;
		
		for(int i=0;i<5;i++) {
			int sum = 0;
			for(int j=0;j<4;j++) {
				ar[i][j] = sc.nextInt();
				sum +=ar[i][j];
				if(j==3) {
					if(sum/4>=80) {
						System.out.println("pass");
						cnt++;
					}else {
						System.out.println("fail");
					}
				}
			}
		}
		System.out.println("Successful : "+cnt);
	}

}
