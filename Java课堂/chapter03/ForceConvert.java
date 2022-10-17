//强制类型转换  数据从大->小
public class ForceConvert{

	public static void main (String[] args){
		//演示自动转换
		int n1 = (int)1.1;//double->int
		int n2 = 2000;
		byte b1 = (byte) n2;  
		System.out.println(n1);  //1，精度损失
		System.out.println(b1);  //-48，数据溢出
	}
}
