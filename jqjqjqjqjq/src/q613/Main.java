package q613;

import java.util.Scanner;

class Student {
//	String name = "Name : ";
//	String school = "School : ";
//	String grade = "Grade : ";
	
	String name;
	String school;
	int grade;
	
	Student() {}
	Student(String n, String s, int g){
		name =n;
		school = s;
		grade = g;
	}
	
}

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		
		Student s1 = new Student(name, school, grade);
		
		
		name = sc.next();
		school = sc.next();
		grade = sc.nextInt();
		
		Student s2 = new Student(name, school, grade);
	
		
		System.out.println("Name : "+s1.name);
		System.out.println("School : " + s1.school);
		System.out.println("Grade : " + s1.grade);
		
		System.out.println("Name : "+s2.name);
		System.out.println("School : " + s2.school);
		System.out.println("Grade : " + s2.grade);
		
	
	}
}
