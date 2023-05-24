package q575;

import java.util.Scanner;

//import javax.naming.spi.DirStateFactory.Result;

class Multi {
	
	
	int mul(int x, int y) {
		int result = x;
		if(y==0) {
			return 1;
		}
		for(int i=1;i<y;i++) {
			result = result* x;
		}
		
		return result;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Multi m = new Multi();
		
		System.out.println(m.mul(sc.nextInt(), sc.nextInt()));
		
	}

}
