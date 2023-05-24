package q195;

import java.util.Scanner;


class Person{
	String name;
	String num;
	String add;

	
	Person(String a, String b, String c){
		name =a;
		num = b;
		add = c;
		
		System.out.println("name : "+name);
		System.out.println("tel : "+num);
		System.out.println("addr : "+add);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String t = sc.next();
		String a = sc.next();
		
		Person p = new Person(n, t, a);
		
		
	}

}
