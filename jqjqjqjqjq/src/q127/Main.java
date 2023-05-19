package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		while(true) {
			i = sc.nextInt();
			if(i>100|i<0) {
				avg = (double)sum/cnt;
				break;
			}
			
			sum += i;
			cnt++;
			
		}
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f",avg);
			
			
			
		
	}

}
