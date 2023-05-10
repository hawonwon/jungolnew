package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		int min = 9999;
		int max = 1;
		int mic = 0;
		int mac = 0;
		
		for(int i =0;i<10;i++) {
			nums[i] = sc.nextInt();
			if(nums[i]<=min&nums[i]>=100) {
				min = nums[i];
				mic++;
			}else if(mic==0&i==9) {
				min = 100;
			}
			
			if(nums[i]>=max&nums[i]<100) {
				max = nums[i];
				mac++;
			}
			else if(mac==0&i==9){
				max = 100;
			}
		}
		sc.close();
		System.out.println(max+" "+min);
	}

}
