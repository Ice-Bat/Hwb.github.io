
public class CharDetail01 {
	//��дһ��main����
	public static void main (String[] args) {

		//��java�У�char�ı�����һ�������������ʱ����Unicode��Ӧ���ַ�
		//Ҫ�����Ӧ������(int)�ַ�
		char c1 = 97;
		System.out.println(c1);  //a
		

		char c2 = 'a';
		System.out.println((int)c2);  //���'a'��Ӧ������

		char c3 = 40644;
		System.out.println(c3);  //��

		char c4 = '��';
		System.out.println((int)c3);  //40644

		//char�����ǿ��Խ�������ģ��൱��һ����������Ϊ������Ӧ��Unicode��
		
		System.out.println(c2 + 10);  //107

		//����С����
		char c5 = 'b' + 1;
		System.out.println(c5);  //c
		System.out.println((int)c5);  //99->��Ӧ���ַ�->ASCII�����

	}
}