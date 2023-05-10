package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		int sum = 0;
		int sum2 = 0;
		int cnt = 0;
		
		
		for(int i =0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
			
			if(i%2==1) {
				sum += nums[i]; 
			}else {
				sum2 += nums[i];
				cnt++;
			}
		}
		sc.close();
		double avg = (double)sum2/cnt;
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f",avg);
	}

}
