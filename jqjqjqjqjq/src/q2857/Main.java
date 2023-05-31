package q2857;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] word = new String[5];
		int c = 0;
		for(int i=0;i<5;i++) {
			word[i]=sc.next();
			if(word[i].length()>c)
				c=word[i].length();
		}
		
		for(int i=0;i<c;i++) {
			
			for(int j=0;j<5;j++) {
				if(word[j].length()<=i) {
					continue;
				}
				System.out.print(word[j].charAt(i));
			}
		}
	}

}
