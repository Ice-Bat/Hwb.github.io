//非：! 和 异或：^

public class InverseOperator{

	public static void main(String[] args){

		//！ 取反
		System.out.println(60 > 90);//f
		System.out.println((60 > 90));//t

		//a^b,逻辑异或，当a和b不同时，则结果为true，否则为false
		boolean a = (1>2) ^ (2>1);
		System.out.println(a);//t
		System.out.println(10 ^ 8);//2
		System.out.println((60 ^ 60));//0
	}
}