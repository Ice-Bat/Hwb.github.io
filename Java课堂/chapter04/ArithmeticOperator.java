//演示算术运算符的使用

public class ArithmeticOperator{

	public static void main(String[] args){
		//1. / 使用
		System.out.println(10 / 3);//3
		System.out.println(10.0 / 3);//3.333

		double d1 = 10 / 4;// 10 / 2 = 2;2->2.0
		System.out.println(d1);//2.0

		//2. %使用
		// ctrl + /注释 和取消注释
		// 在Java中，%的本质 公式：a % b = a - a / b *b;
		System.out.println(11 % 9);  //2
		System.out.println(-11 % 9);  //-11 - -11 / 9 * 9 = -11 - (-9) = -2;
		System.out.println(11 % -9);  //2
		System.out.println(-11 % -9);  //-2

		//3. 自增：++ 使用
		int i = 10;
		i++;//自增，等价于 i = i + 1;
		++i;//自增，等价于 i = i + 1;
		System.out.println("i = " + i);//12

		/*
		作为表达式使用
		前++：++i先自增后赋值
		后++：i++先赋值后自增
		 */ 
		int j = 8;
		int k = ++j;
		System.out.println("j = " + j + "\t" + "k = " + k);//j = 9;k = 9;
		int m = j++;
		System.out.println("j = " + j + "\t" + "m = " + m);//j = 10;m = 9;
	}
}