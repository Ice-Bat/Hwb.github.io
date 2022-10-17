
public class Object01 { 

	//编写一个main方法
	public static void main(String[] args) {

		//创建一个Person对象、
		//p1是对象名（对象引用）
		//new Person 创建一个对象空间（数据），才是真的对象
		//对象的默认属性值遵守数组的规则
		Person p1 = new Person();
	}
}

class Person{
	String name;
	int age;
	boolean ispass;
}