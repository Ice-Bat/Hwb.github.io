
public class CharDetail01 {
	//编写一个main方法
	public static void main (String[] args) {

		//在java中，char的本质是一个整数，在输出时，是Unicode对应的字符
		//要输出对应的数字(int)字符
		char c1 = 97;
		System.out.println(c1);  //a
		

		char c2 = 'a';
		System.out.println((int)c2);  //输出'a'对应的数字

		char c3 = 40644;
		System.out.println(c3);  //黄

		char c4 = '黄';
		System.out.println((int)c3);  //40644

		//char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码
		
		System.out.println(c2 + 10);  //107

		//课堂小测试
		char c5 = 'b' + 1;
		System.out.println(c5);  //c
		System.out.println((int)c5);  //99->对应的字符->ASCII编码表

	}
}