
public class FloatDetail { 
	//��дһ��main����
	public static void main (String[] args){
		//java�ĸ����ͳ���������ֵ��Ĭ��Ϊdouble�ͣ�����float�ͳ������ӡ�f����F��
		
		//float n1 = 21.1; ����: �����ݵ�����: ��doubleת����float���ܻ�����ʧ
		float n1 = 21.1f;
		double n2 = 21.1;
		double n3 = 21.1f;
		System.out.println(n2);
		System.out.println(n1);
		double n4 = .21;//�ȼ���0.21
		double n5 = 21.1e2; //21.1*10�Ķ��η�
		double n6 = 21.1e-2; //21.1*10�ĸ����η�
		System.out.println(n5);
		System.out.println(n6);
		double n7 = 21.12345678901;
		float n8 = 21.12345678901f;
		System.out.println(n7);
		System.out.println(n8);
		//������ʹ������ 0.7��2.1 / 3�Ƚ�
		double n9 = 0.7;
		double n10 = 2.1 / 3;  //һ���ӽ�0.7��С��
		//�õ�һ����Ҫ��ʹ�õ㣺�����Ƕ���������С�������ж�ʱ��ҪС��
		//�������������ֵ�ľ���ֵ����ĳ�����ȷ�Χ���ж�
		System.out.println(n9);
		System.out.println(n10);
		//����ע�ͷ��� ctrl + /,�ٴΰ��¾�ȡ��ע��
	if(Math.abs(n9 - n10)<0.000001){
		System.out.println("��ֵ�ǳ�С����Ϊ���");
	}
	System.out.println(Math.abs(n9 - n10));
	}

}