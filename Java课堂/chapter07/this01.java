
public class this01{
	public static void main(String[] args){

		Person p1 = new Person("cc",8);
		p1.info();	
		System.out.println("=========");
		Person p2 = new Person("jj",18);
		p2.info();
	}
}

class Person{
	String name;
	int age;
	//public Person(String pname,int page){
	//	name = pname;
	//	age = page;
	// }
	// 如果我们构造器的形参可以直接写成属性名，就更好了
	// 但是出现了一个问题，，更具变量的作用域原则
	// 构造器name 和age 是局部变量，而不是属性
	// ===》引出this

	public Person(String name,int age){
		//this.name和this.age 就是当前对象的属性name和age
		this.name = name;
		this.age = age;
		//age = age;     0
		//name = name;    null
		//使用hashCode()可以看对象情况
		System.out.println("this.hashCode = " + this.hashCode());
	}
	public void info(){
		System.out.println("p1.name" + name + " " + "p1.age" + age);
		System.out.println("this.hashCode = " + this.hashCode());
	}	
}