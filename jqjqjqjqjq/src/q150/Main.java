package q150;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] ar = new char[10];
		for(int i =0;i<10;i++) {
			ar[i] = sc.next().charAt(0);
		}
		for(int i=9; i>=0; i--) {
			System.out.print(ar[i]+" ");
		}
	}

}
