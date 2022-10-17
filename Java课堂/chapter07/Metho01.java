
public class Metho01 { 

	//编写一个main方法
	public static void main(String[] args) {

		//使用方法
		//1.方法写好后，如果不去调用，就不会输出
		//2.先创建对象，在调用方法
		Person p = new Person();
		p.speak();  	//调用方法
		p.cal01();
		p.cal02(5);
		p.cal02(10);
		int res = p.getsum(14,16);
		System.out .println(res);
	}
}

class Person{

	//方法（成员方法）
	//添加speak方法 输出"我是一个帅哥"
	//
	//1.public 是表示方法公开
	//2.void 表示无返回值
	//3.speak() speak：方法名 ():表示形参列表
	//4.{} 表示方法体，写我们要执行的代码
	public void speak (){
		System.out.println("我是一个帅哥");
	}
	int sum = 0;
	public void cal01(){
		for(int i = 1;i <= 1000;i++){
			sum += i;
		}
		System.out.println("sum = " + sum);
		sum = 0;
	}
	public void cal02(int n){
		for(int i = 1;i <= n;i++){
			sum += i;
		}
		System.out.println("sum = " + sum);
		sum = 0;
	}
	//添加getsum的成员方法
	//
	//1.public 是表示方法公开
	//2.int 表示执行后，返回一个int值
	//3.getsum 方法名
	//4.(int num1 , int num2) 两个形参，接收用户数据
	//5.return res； 表示把res值返回
	public int getsum(int num1 , int num2){
		int res = num1+num2;
		return res;
	}
}
