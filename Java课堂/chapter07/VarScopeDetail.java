
public class VarScopeDetail { 

	//编写一个main方法
	public static void main(String[] args) {
		Person p = new Person();
		p.say();
		T t = new T();
		//细节4.作用于范围不同
		//全局变量、属性可以给本类使用，或给其他类使用
		//局部变量只能在对应方法中使用
		t.test1();  //第一类跨类访问属性的方法
		t.test2(p);  //第二种跨类访问对象属性的方法
	}
}

class T {
	//细节5.全局变量、属性可以加修饰符(public,protected,private)，局部变量不可以加
	public int sum = 10;
	public void test1(){
		//public int sum = 10;  错误
		Person p = new Person();
		System.out.println("p.name = " + p.name);
	}
	public void test2(Person p){
		System.out.println("p.name = " + p.name);
	}
}

class Person{
	//细节1.局部变量属性可以和全局变量重名，访问时遵循就近原则
	//细节2.在同一个作用域中，比如同一个方法中，两个局部变量不能重名
	//细节3.属性生命周期较长，伴随着对象的创建而创建，销毁而销毁
	//局部变量生命周期较短，伴随着代码块的执行而创建，结束而销毁
	String name = "huang";
	public void say(){
		String name = "wei";
		System.out.println("name = "+name); //name = wei
	}
}