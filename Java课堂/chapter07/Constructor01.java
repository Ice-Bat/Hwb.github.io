
public class Constructor01{
	public static void main(String[] args){
		//当我们new一个对象时，直接通过构造器初始化
		Person p = new Person("cc",90);
		System.out.println(p.name + " " + p.age);
	}
}

class Person{
	String name;
	int age;
	//构造器
	//1.构造器没有返回值，也不要加void
	//2.构造器名字和类名一致
	//3.(String pname,int page)是构造器形参列表，规则和成员方法一样
	public Person(String pname,int page){
		name = pname;
		age = page;
	}
}