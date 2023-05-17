package q614;

import java.util.Scanner;

class School {
	String name;
	int grade;
	
	public School() {
		// TODO Auto-generated constructor stub
		name = "Jejuelementary";
		grade = 6;
	}
	
	School(String s, int g) {
		name = s;
		grade = g;
	}
}


public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		School s1 = new School();
		
		String name = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		School s2 = new School(name, grade);
		
		System.out.println(s1.grade+" grade in "+s1.name+" School");
		System.out.println(s2.grade +" grade in "+s2.name+" School");
	}

}
