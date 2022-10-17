
public class SwitchDetail{
	public static void main(String[] args){

		//细节1.表达式数据类型应和case后常量数据类型一致
		//或者可以自动转换成可以相互比较的类型比如输入的字符，而常量是int
		//
		//细节2.switch（表达式）中表达式的返回值必须是：
		//（byte,shaot,int,char,enum,String）
		//
		//细节3.case子句中的值必须是常量或常量表达式，而不能是变量
		//
		//细节4.default子句可选，也可不选
		//
		//细节5.break语句用来执行完一个case分支结束后程序跳出switch语句
		//如果没有break，程序会执行到switch结尾,除非遇到break；
		//
		char c1 = 'a';
		switch(c1){
			case 'a':
				System.out.println("ok1");
				//break;
			case 20 :
				System.out.println("ok2");
				break;
			case 2 :
				System.out.println("ok3");		
				break;
		}
	}
}