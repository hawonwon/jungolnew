package q557;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s[] = new String[10];
		for(int i =0; i<10; i++) {
			s[i] = sc.next();
			
			
		}
		sc.close();
		System.out.print(s[0]+" ");
		System.out.print(s[3]+" ");
		System.out.print(s[6]);
	}

}
