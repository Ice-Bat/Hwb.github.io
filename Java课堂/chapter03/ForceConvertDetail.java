
public class ForceConvert{

	public static void main (String[] args){
		//��ʾǿ������ת��
		//ǿת����ֻ�������Ĳ�������Ч��������ʹ��С�����������ȼ�
		//int n1 = (int)10*2 + 12*1.1;  //����Ϊdouble
		int n1 = (int)(10*2 + 12*1.1);
		System.out.println(n1);  //1��������ʧ

		char c1 = 10;
		int n2 = 100;
		//char c2 = n2;
		char c2 = (char)n2;
		System.out.println(c2);  //100��Ӧ���ַ�
}
