package q536;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. while
		int i = 1;
		while (i <= 14) {
			System.out.print(i++ +" ");
			if (i==15) {
				System.out.print(i);
			}
			//i++; 위에다 작성해도됌. print하고 증감 시키겠다는 뜻.
		}
		
		
//		//2. for
		for (int x= 1; x < 16; x++ ) {
			System.out.print(x+" ");
		}
//		
//		//3. dowhile
		int y = 1;
		do {
			System.out.print(y++ +" ");
		} while (y < 16);
		
	}

}
