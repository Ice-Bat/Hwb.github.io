
public class ConstructorExercise{
	public static void main(String[] args){
		Person p = new Person();  //�޲ι�����
		System.out.println(p.name + " " + p.age);
		Person p1 = new Person("cc",8);
		System.out.println(p1.name + " " + p1.age);		
	}
}
class Person{
	String name;
	int age;
	public Person(){
		age = 18;
	}
	public Person(String pname,int page){
		name = pname;
		age = page;
	}
}