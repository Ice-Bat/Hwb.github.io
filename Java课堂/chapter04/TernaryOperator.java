//��Ԫ�����ʹ��

public class TernaryOperator { 

	//��дһ��main����
	public static void main(String[] args) {

		int a = 9;
		int b = 99;
		int result = a > b ? a++ : b--;
		//
		//1.a > b Ϊfalse
		//2.����b--������b��ֵ���ڼ�1
		//3.���ؽ��Ϊ99
		System.out.println("result = " + result );
		System.out.println("a = " + a );
		System.out.println("b = " + b );

		//��Ԫ�����ϸ��
		//���ʽ1��2ҪΪ���Ը�ֵ�����ձ���������
		//�Զ�ת����ǿ��ת��
		int a = 3;
		int b = 4;
		int c = a > b ? a++ : (int)(b + 1.1);
		System.out.println(c);
	}
}