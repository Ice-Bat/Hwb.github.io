//1.ʹ��char���ͣ��ֱ𱣴�\n \t \r \\ 1 2 3���ַ�������Ӧ���
//2.�����������Ա���۸���'+'ƴ��
//3.ʵ�� ���� ���� �ɼ� �Ա� ����
//       xx   xx   xx  xx   xx
public class Homework{

	public static void main (String[] args){
		char c1 = '\n';//����
		char c2 = '\t';//�Ʊ�λ
		char c3 = '\r';//�س�
		char c4 = '\\';//���\
		char c5 = '1';
		char c6 = '2';
		char c7 = '3';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);

		System.out.println("��¥�� + ��������\t" + "�� + Ů\t" + "25 + 23");
		String s1 = "��¥��";
		String s2 = "��������";
		char n1 = '��';
		char n2 = 'Ů';
		double price1 = 12.3;
		double price2 = 23.89;
		System.out.println(s1 + s2);//��¥����������
		System.out.println(n1 + n2);//52906
		System.out.println(price1 + price2);//36.19

		System.out.println("����\t����\t�ɼ�\t�Ա�\t����\n" + "�ƹ�\t18\t99\t��\t��ʺ");

	}
}


