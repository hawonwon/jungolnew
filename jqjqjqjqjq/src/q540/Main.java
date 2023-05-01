package q540;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			int i = sc.nextInt();
			
			if (i % 3 ==0) {
				System.out.println(i/3);
			}else if(i == -1) {
				break;
			}
		}
	}

}
