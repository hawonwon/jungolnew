package q604;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String[] str = new String[10];
		
		for(int i=0;i<str.length;i++) {
			str[i] = sc.next();
			
		}
		char c = sc.next().charAt(0);
		
//		System.out.println();
		for(int i=0;i<str.length;i++) {
			if(c==str[i].charAt(str[i].length()-1) ) {
				System.out.println(str[i]);
			}
			
		}
	}

}
