package q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i[] = new int[100];
		int count = 0;
		for (int n = 0;n<100;n++) {
			i[n] = sc.nextInt();
			count++;
			if(i[n]==0) {
				count--;
				break;
			}	
		}
		while(count>0) {
			--count;
			System.out.print(i[count]+" ");
			
		}
		
//		System.out.println(i[0]);
//		System.out.println(i[1]);
//		System.out.println(i[2]);
//			
		}
	}


