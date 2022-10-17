public class MethodDetail02 { 

	//编写一个main方法
	public static void main(String[] args) {

		A a = new A();
		a.sayOk();
		a.m1();
	}
}

class A{

	//在同一个类中调用方法时，直接调用即可
	public void print(int n){
		System.out.print("n = " + n);
	}

	public void sayOk(){
		print(10);
		System.out.print("继续执行");
	}

	//跨类调用的方法，A类调用B类需要通过对象名调用
	public void m1(){
		B b = new B();
		b.d1();
	}
}

class B{
	public void d1(){
		System.out.println("test");
	}
}