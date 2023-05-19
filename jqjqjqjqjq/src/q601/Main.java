package q601;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] c = new char[str.length()];
		char tmp;
		
		
		for(int i=0;i<str.length();i++) {
			c[i] = str.charAt(i);
		}
		
		for(int i=0;i<str.length();i++) {
			
			for(int j=0;j<str.length();j++) {
				tmp = c[j];
				c[j] = c[str.length()-1]  ;
				c[str.length()-1] = tmp;
				
				System.out.print(c[j]);
			}
//			System.out.println(Arrays.toString(c));
			System.out.println();
		}
	}

}
