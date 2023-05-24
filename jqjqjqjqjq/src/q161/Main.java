package q161;

//import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[][] ar = new int[12][2];
		int sco = 0;
		int n = 0;
		
		do {
			n = sc.nextInt();
			if(n>=10) {
				sco = n/10;
				ar[sco][1]+=1;
			}else {
				
				ar[0][1] +=1;
			}
			
		}while(n>0);
		ar[0][1] = ar[0][1] -1;
//		System.out.println(Arrays.deepToString(ar));
	
		
		for(int i=11;i>=0;i--) {
			if(ar[i][1]>0) {
				System.out.println(i*10+" : "+ar[i][1]+" person");
			}
		}
	}
	
	
}
