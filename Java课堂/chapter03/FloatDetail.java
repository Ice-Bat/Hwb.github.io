
public class FloatDetail { 
	//编写一个main方法
	public static void main (String[] args){
		//java的浮点型常量（具体值）默认为double型，声明float型常量需后加‘f’或‘F’
		
		//float n1 = 21.1; 错误: 不兼容的类型: 从double转换到float可能会有损失
		float n1 = 21.1f;
		double n2 = 21.1;
		double n3 = 21.1f;
		System.out.println(n2);
		System.out.println(n1);
		double n4 = .21;//等价于0.21
		double n5 = 21.1e2; //21.1*10的二次方
		double n6 = 21.1e-2; //21.1*10的负二次方
		System.out.println(n5);
		System.out.println(n6);
		double n7 = 21.12345678901;
		float n8 = 21.12345678901f;
		System.out.println(n7);
		System.out.println(n8);
		//浮点数使用陷阱 0.7和2.1 / 3比较
		double n9 = 0.7;
		double n10 = 2.1 / 3;  //一个接近0.7的小数
		//得到一个重要的使用点：当我们对运算结果是小数进行判断时，要小心
		//因该是两个数插值的绝对值，在某个精度范围内判断
		System.out.println(n9);
		System.out.println(n10);
		//集体注释方法 ctrl + /,再次按下就取消注释
	if(Math.abs(n9 - n10)<0.000001){
		System.out.println("差值非常小，认为相等");
	}
	System.out.println(Math.abs(n9 - n10));
	}

}