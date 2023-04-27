package q9006;

import java.math.BigDecimal;
import java.text.DecimalFormat;
//import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("수를 출력할 때는 따옴표를 생략합니다.");
		System.out.println(123);
//		System.out.print(6.5+ "00000");
		
		DecimalFormat dFormat = new DecimalFormat("#.000000");
		System.out.println(dFormat.format(new BigDecimal(6.5)));
//		System.out.println(6.5);
		
		double a = 6.5;
		System.out.println(a);
		
		System.out.printf("%f\n", a);
		
		double b = 1236.5078;
		System.out.printf("%10.3f\n", b);
	}

}
