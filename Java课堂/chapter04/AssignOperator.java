//演示赋值运算符的使用

public class Test { 

	//编写一个main方法
	public static void main(String[] args) {

		int n1 = 9;
		n1 += 1;  //-=,*=,/=,%=,
		System.out.println(n1);

		//复合赋值运算符会进行类型转换
		byte b = 3;
		b += 2;//等价于 b = (byte(b + 2));
		b++;  //等价于 b = (byte(b + 1));
	}
}
