package q609;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] strar = new String[3];
		strar[0] = sc.next();
		strar[1] = sc.next();
		strar[2] = sc.next();
		
		Arrays.sort(strar);
		System.out.println(strar[0]);
	}
			

}
