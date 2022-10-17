
public class ConstructorDetail{
	public static void main(String[] args){
		Person p = new Person("jj",8);
		Person p1 = new Person("vv");
		System.out.println(p.name + " " + p1.name);
	}
}
//细节5.程序员没有编写构造器，系统会自动给类生成一个无参构造器（也叫默认构造器
//使用javap反编译 javap Dog.class
/*
	默认构造器
	Dog(){
	
	}
 */
//细节6.一旦定义自己的构造器，默认的构造器就覆盖了，就不能使用默认的无参构造器
//除非自己显示定义
class Dog{
	int age;
	public Dog(int page){
		age = page;
	}
	Dog(){// 显示定义 无参构造器

	}
}

class Person{
	String name;
	int age;
	//细节1.构造器的重载
	//细节2.构造器名和类名相同
	//细节3.没有返回值
	//细节4.构造器是完成对象的初始化，并不是创建对象
	//第一个构造器
	public Person(String pname,int page){
		name = pname;
		age = page;
	}
	//第二个构造器
	public Person(String pname){
		name = pname;
	}
	
}