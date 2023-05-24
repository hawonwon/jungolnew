package q570;

//import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ar = new int[5][5];
		
		for(int j=0;j<5;j++) {
			ar[0][j]=1;
			ar[j][0]=1;
			
		}
		
		for(int i =0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i>0&j>0) {
					ar[i][j] = ar[i][j-1]+ar[i-1][j];
				}
				
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
//		 System.out.println(Arrays.deepToString(ar));
		
	}
}
