package q566;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[100];
		ar[0] = 100;
		ar[1] = sc.nextInt();
		int cnt = 2;
		
		
		while(true) {
			ar[cnt] = ar[cnt-2]-ar[cnt-1];
			if(ar[cnt]<0) {
				break;
			}
			cnt++;
		}
		for(int i=0;i<=cnt;i++) {
			
			System.out.print(ar[i]+" ");
		}
	}

}
