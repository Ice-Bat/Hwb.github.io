//��ʾ�����������ʹ��

public class ArithmeticOperator{

	public static void main(String[] args){
		//1. / ʹ��
		System.out.println(10 / 3);//3
		System.out.println(10.0 / 3);//3.333

		double d1 = 10 / 4;// 10 / 2 = 2;2->2.0
		System.out.println(d1);//2.0

		//2. %ʹ��
		// ctrl + /ע�� ��ȡ��ע��
		// ��Java�У�%�ı��� ��ʽ��a % b = a - a / b *b;
		System.out.println(11 % 9);  //2
		System.out.println(-11 % 9);  //-11 - -11 / 9 * 9 = -11 - (-9) = -2;
		System.out.println(11 % -9);  //2
		System.out.println(-11 % -9);  //-2

		//3. ������++ ʹ��
		int i = 10;
		i++;//�������ȼ��� i = i + 1;
		++i;//�������ȼ��� i = i + 1;
		System.out.println("i = " + i);//12

		/*
		��Ϊ���ʽʹ��
		ǰ++��++i��������ֵ
		��++��i++�ȸ�ֵ������
		 */ 
		int j = 8;
		int k = ++j;
		System.out.println("j = " + j + "\t" + "k = " + k);//j = 9;k = 9;
		int m = j++;
		System.out.println("j = " + j + "\t" + "m = " + m);//j = 10;m = 9;
	}
}