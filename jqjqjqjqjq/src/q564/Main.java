package q564;

//import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[26];
		int num =0;
		
		while(true) {
			char c = sc.next().charAt(0);
			if(c>64&c<91) {
				num = c-65;
				ar[num] += 1;
				
			}else {
				break;
			}
		}
//		System.out.println(Arrays.toString(ar));
		for(int i =0 ;i<26;i++) {
			if(ar[i]!=0) {
				System.out.println((char)(i+65)+" : "+ ar[i]);
			}
			
		}
		
	}

}
