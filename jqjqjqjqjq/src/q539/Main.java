package q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int c = 0;
		while (true) {
			int i = sc.nextInt();
			n = n+i;
			c++;
			if (i >= 100) {
				
				System.out.println(n);
				System.out.printf("%.1f",(double)n/c);
				break;
				
			} 
			
			
		}
		
	}

}
