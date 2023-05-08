package q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		int m = 1000;
		for(int i =0;i<10;i++) {
			nums[i] = sc.nextInt();
			if(nums[i]<m)
			m = nums[i];
		}
		System.out.println(m);
			
	}

}
