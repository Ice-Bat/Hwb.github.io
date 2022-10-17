
public class ForceConvert{

	public static void main (String[] args){
		//演示强制类型转换
		//强转符号只针对最近的操作数有效，往往会使用小括号提升优先级
		//int n1 = (int)10*2 + 12*1.1;  //类型为double
		int n1 = (int)(10*2 + 12*1.1);
		System.out.println(n1);  //1，精度损失

		char c1 = 10;
		int n2 = 100;
		//char c2 = n2;
		char c2 = (char)n2;
		System.out.println(c2);  //100对应的字符
}
