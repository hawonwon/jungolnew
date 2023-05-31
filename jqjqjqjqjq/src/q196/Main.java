package q196;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//import javax.naming.spi.DirStateFactory.Result;

class Person{
	String name;
	String tel;
	String addr;
	
	
	Person(){};
	Person(String name, String tel, String addr){
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		
	}
//	String Result(String n1, String n2, String n3
//			) {
//		
//		List<String> ar = Arrays.asList(n1,n2,n3);
//		return new ArrayList<>(a);
//		for(int i=0;i<3;i++) {
//			
//			if(n1.charAt(i)<n2.charAt(i)&n1.charAt(i)<n3.charAt(i)) {
//				System.out.println("name : " + n1);
//				System.out.println("tel : " + t1);
//				System.out.println("addr : " + a1);
//				break;
//			} else if(n2.charAt(i)<n1.charAt(i)&n2.charAt(i)<n3.charAt(i)) {
//				System.out.println("name : " + n2);
//				
//				System.out.println("tel : " + t2);
//				System.out.println("addr : " + a2);
//				break;
//			} else {
//				System.out.println("name : " + n3);
//				System.out.println("tel : " + t3);
//				System.out.println("addr : " + a3);
//				break;
//			}
//			
//			
//		}
	}
//}




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Person[] p = new Person[3];
		p[0] = new Person();
		p[1] = new Person();
		p[2] = new Person();
		
		for(int i =0;i<3;i++) {
			p[i].name = sc.next();
			p[i].tel = sc.next();
			p[i].addr = sc.next();
		}
		Person r = new Person();
//		r.Result(p[0].name, p[1].name, p[2].name
//				);
		
		
		
		
	}

}
