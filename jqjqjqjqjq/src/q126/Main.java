package q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		while (true) {
			int i = sc.nextInt();
			if (i==0){
				System.out.println("odd : " + odd + "\neven : " + even);
				break;
			}
			if (i % 2 == 0) {
				even++;
				
			} else if (i % 2 == 1) {
				odd++;
			
			}

		}

	}

	}
