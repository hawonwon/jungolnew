package q563;

//import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
//		int[] ar2 = new int[10];
		int tmp =0;
		
		for(int i =0; i<10;i++) {
			ar[i] = sc.nextInt();
			}
		
		
		for(int i =0; i<10;i++) {
			
			for(int j=i+1; j<10;j++) {
				if(ar[i]<ar[j]) {
					tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
		}
		
		for(int i = 0;i<10;i++) {
			System.out.print(ar[i]+" ");
		}
		
	}

}
