//自动类型转换细节
public class AutoConvertDetail{

	public static void main (String[] args){
		//细节1：有多种数据类型混合运算时
		//系统首先自动将所有数据转换成容量最大的那种类型，然后进行运算
		int n1 = 1;
		//float n2 = n1 + 1.1; 错误，n1 + 1.1结果类型为double
		float f1 = n1 + 1.1F;// 正确，n1 + 1.1F结果类型为float
		double d2 = n1 +1.1;

		//细节2：当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型是
		//就会报错，反之就会进行自动类型转换
		//
		//int n2 = 1.1;  错误 double->int
		//
		//细节3：(byte,short)和char类型之间不发生相互自动转换
		//当把具体数赋给 byte 时，先判度该数是否在byte范围内，如果是就可以
		byte b1 = 10;  //ok,-128-127
		//byte b1 = n1;  错误，原因：如果是变量赋值，判断类型
		//char c1 = b1;  错误，(byte,short)和char类型之间不发生相互自动转换
		//
		//细节4：byte，short，char，他们三者可以计算，在计算时首先转换为int型
		byte b2 = 2;
		byte b3 = 3;
		short s1 = 1;
		//short s2 =s1 + b2; 错 s1 + b2-》为int型
		////byte b4 = b2 +b3; 错 b2 + b3-》为int型
		int n2 =s1 + b2;

		//细节5：Boolean类型不参与转换
		boolean pass = true;
		//int n = pass;  错
		
		//细节6：自动提升原则：表达式结果的类型自动提升为，操作数中最大的类型
		byte b4 = 1;
		int n3 = 3;
		short s2 = 4;
		double d2 = 2;
		num = b4 + n3 + s2 + d2;  //double型
	}
}
	