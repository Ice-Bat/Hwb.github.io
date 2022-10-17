
public class TestPerson{
	public static void main(String[] args){

		Person p1 = new Person("cc",8);
		Person p2 = new Person("gg",77);
		System.out.print(p1.compareTo(p2));
	}
}

class Person{
	String name;
	int age;
	public Person(String name,int age){
		this.age = age;
		this.name = name;
	}
	public boolean compareTo(Person p){
		// if(this.name.equals(p.name) && this.age == p.age){  //this.name是p1的对象
		// 	return true;
		// } else {
		// 	return false;
		// }
		return this.name.equals(p.name) && this.age == p.age;
	}
}
