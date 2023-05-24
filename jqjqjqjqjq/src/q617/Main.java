package q617;

import java.util.Scanner;

class Person {
	
	String name;
	int height;
	
	
	Person(String a, int b){
		height = Integer.MAX_VALUE;
		
		if (b < height) {
			height = b;
			name = a;
		}
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] s = new String[5];
		int[] h = new int[5];
		
		for(int j=0;j<5;j++) {
			s[j] = sc.next();
			h[j] = sc.nextInt();
			
		}
		
		
		
	}

}
