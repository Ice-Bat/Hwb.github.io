
public class StringToBasic{

	public static void main (String[] args){

		//�����������͡���>String
		
		int n1 = 2;
		char c1 = 3;
		float f1 = 4f;
		String s1 = n1 + "";
		String s2 = c1 + "";
		String s3 = f1 + "";

		System.out.println(s1 +" " + s2 + " " + s3);

		//String->������������
		String s5 = "122";
		//����OOP ������ͷ�����ʱ����ϸ
		//��� ʹ�� �����������Ͷ�Ӧ�İ�װ�࣬����Ӧ�������õ�������������
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		short num5 = Short.parseShort(s5);
		byte num6 = Byte.parseByte(s5);
		boolean num7 = Boolean.parseBoolean("true");

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);

		//��ô���ַ���ת��char ->������ָ���ַ����ĵ�һ���ַ��õ�
		System.out.println(s5.charAt(0));
	}
}
