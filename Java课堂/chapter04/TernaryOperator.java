//三元运算符使用

public class TernaryOperator { 

	//编写一个main方法
	public static void main(String[] args) {

		int a = 9;
		int b = 99;
		int result = a > b ? a++ : b--;
		//
		//1.a > b 为false
		//2.返回b--，返回b的值后，在减1
		//3.返回结果为99
		System.out.println("result = " + result );
		System.out.println("a = " + a );
		System.out.println("b = " + b );

		//三元运算符细节
		//表达式1和2要为可以赋值给接收变量的类型
		//自动转换或强制转换
		int a = 3;
		int b = 4;
		int c = a > b ? a++ : (int)(b + 1.1);
		System.out.println(c);
	}
}