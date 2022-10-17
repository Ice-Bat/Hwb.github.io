import java.util.Scanner;
public class Homework11{
	public static void main(String[] args){


	}
}
class Employee{
	String name;
	String gender;
	int age;
	String career;
	int sal;
	//要求复用构造器
	public Employee(String career,int sal){
		this.career = career;
		this.sal = sal;

	}
	public Employee(String name,int age,String gender){
		this.name = name;
		this.age = age;		
		this.gender = gender;		
	}
	public Employee(String career,int sal,String name,int age,String gender){
		this(name,age,gender);
		this.career = career;
		this.sal = sal;			
	}
}