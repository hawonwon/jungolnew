package q135;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		
		if(i>j) {
			int tmp=0;
			tmp = i;
			i = j;
			j = tmp;
		}
		
		for(int x =i;x<=j;x++) {
			if(x%3==0|x%5==0) {
				sum += x;
				cnt++;
			}
			
		}
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f",(double)sum/cnt);
	
	}

}
