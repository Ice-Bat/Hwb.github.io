
public class ArithmeticOperatorExercise{

	public static void main(String[] args){

		//1.����ʹ����ʱ����temp ��(1)temp = i;(2)i = i + 1;(3)i = temp;
		int i = 1;
		i = i++;
		System.out.println("i = " + i );  //1
		//2.����ʹ����ʱ����temp ��(1)j = j + 1;(2)temp = j;(3)j = temp;
		int j = 1;
		j = ++j;
		System.out.println("j = " + j );  //2

		//3. ����59��ż٣��ϼ��������㼸��
		int day1 = 59;
		int data = day1 / 7;
		int day2 = day1 % 7;
		System.out.println("���� = " + data + "\t" + "�� = " + day2 );

		//4.����һ���������滪���¶ȣ�����ת���ϣ�5/9*(�����¶�-100)���������¶�
		double Fahrenheit = 233.6;
		double Celsius = 5.0 / 9 * (Fahrenheit - 100); //5.0
		System.out.println("Celsius = " + Celsius);
	}
}