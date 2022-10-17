
//Java快速入门，开发步骤
//对代码的快速说明
//1.public class Hello表示Hello是一个public（公有）类，
//2.Hello{}表示一个类的开始和结束
//3.public static void main (string[] args)表示一个主方法，即我们程序的入口、
//4.main(){}表示方法的开始与结束
//5.System.out.println("Hello,World~")表示输出Hello,World~到屏幕
//6.;表示语句结束

public class Hello {
	//编写一个main方法
	public static void main (String[] args) {
		System.out.println("Hello,World~");
	}
}

//一个源文件中最多只能有一个public类，其他类个数不限
//dog是一个类，编译后有一个dog.class

class dog{
	//也可以将main写在非public类中
	public static void main (String[] args ) {
		System.out.println("Dog is our friends");
	}
}

class cat {
	public static void main (String[] args ){
		System.out.println("cat is very cute");
	}
}
