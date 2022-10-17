
public class ThisDetail{
	public static void main(String[] args){

		Y y = new Y();
		y.f1();
		Y y1 = new Y(15);
		y1.f3();
	}
}

class Y{
	int age = 14;
	public void f1(){
		System.out.println("f1()方法");
		//方法1.
		f2();
		//方法2.细节，访问成员方法的语法 this.方法名(参数列表)
		this.f2();

	}
	public void f2(){
		System.out.println("f2()方法");
	}

	public void f3(){
		int age = 12;
		System.out.println("age  = " + age);
		System.out.println("this.age  = " + this.age); //0 -> 13 -> 14 ->15
	}

	//访问构造器语法  this(参数列表)
	//注意 只能在构造器中使用（即只能在构造器中访问另一个构造器
	// 对this的调用必须是构造器中的第一个语句
	public Y(int age){
		this.age = age;
		System.out.println("this.age = " + this.age);
	}
	public Y(){
		// 对this的调用必须是构造器中的第一个语句
		this(13);
		System.out.println("无参构造器");
	}
}