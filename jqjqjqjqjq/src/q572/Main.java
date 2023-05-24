package q572;

import java.util.Scanner;

//import javax.naming.spi.DirStateFactory.Result;

class Circle{
	double re (int x) {
		double result = x*x*3.14;
		return result;
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		Circle c = new Circle();
		
		System.out.printf("%.2f",c.re(n));
	}

}
