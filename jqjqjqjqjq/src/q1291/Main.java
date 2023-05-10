package q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
	
		for(int i=x;i<y;i++) {
			for(int i2=1;i2<10;i2++) {
				System.out.println(i+" * "+i2+" = "+i*i2);
				
			}
		}
	}

}
