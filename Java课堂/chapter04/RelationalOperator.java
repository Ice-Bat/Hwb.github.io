//关系运算符操作
public class RelationalOperator{

	public static void main(String[] args){
		int a = 3;
		int b = 4;
		System.out.println(a > b);//f
		System.out.println(a >= b);//f
		System.out.println(a < b);//t
		System.out.println(a <= b);//f
		System.out.println(a == b);//f
		System.out.println(a != b);//t
		boolean flag = a >b;
		System.out.println("flag  =" + flag);//f

	}
}