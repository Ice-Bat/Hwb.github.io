//演示字符串转基本数据类型的细节
public class StringToBasic{

	public static void main (String[] args){
		String s1 = "hello";
		int n1 = Integer.parseInt(s1);
		System.out.println(n1);  //出现异常

	}
}