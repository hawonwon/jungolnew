package q195;

import java.util.Scanner;
import java.util.Set;


class Person{
	private String name;
	private String num;
	private String add;

	Person(){
//		setName(name);
//		setNum(num);
//		setAdd(add);
	};
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
	}


//	Person(String a, String b, String c){
//		this.name =a;
//		this.num = b;
//		this.add = c;
//		
//		
//	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String t = sc.next();
		String a = sc.next();
		
		Person p = new Person();
		p.setName(n);
		p.setNum(t);
		p.setAdd(a);
		
		System.out.println("name : "+p.getName());
		System.out.println("tel : "+p.getNum());
		System.out.println("addr : "+p.getAdd());
		
	}

}
