//��ʾ�߼������ʹ��

public class LogicOperator{

	public static void main(String[] args){
		//��·�룺&& ���߼��룺&
		
		int age = 50;
		//��·�룺&&
		if(age > 20 && age<90){
			System.out.println("ok1");
		}
		//�߼��룺&
		if(age > 20 & age<90){
			System.out.println("ok2");
		}

		//����
		int a = 2;
		int b = 9;
		//���ڶ�·����ԣ������һ���ж�Ϊfalse����������������ж�
		if(a < 1 && ++b > 90){
			System.out.println("ok3");
		}
		System.out.println("a = " + a + "b = " + b);//2,9

		//�����߼�����ԣ������һ���ж�Ϊfalse�������������Ȼ�ж�
		if(a < 1 & ++b > 90){
			System.out.println("ok3");
		}
		System.out.println("a = " + a + "b = " + b);//2,10

		//��·��|| ���߼���|
		

		int day = 50;
		//��·��||
		if(day > 20 || day<90){
			System.out.println("ok1");
		}
		//�߼���|
		if(day > 20 | day<90){
			System.out.println("ok2");
		}

		//����
		int c = 2;
		int d = 9;
		//���ڶ�·����ԣ������һ���ж�Ϊtrue����������������ж�
		if(c < 1 && ++d > 90){
			System.out.println("ok3");
		}
		System.out.println("c = " + c + "d = " + d);//2,9

		//�����߼�����ԣ������һ���ж�Ϊtrue�������������Ȼ�ж�
		if(c < 1 & ++d > 90){
			System.out.println("ok3");
		}
		System.out.println("c = " + c + "d = " + d);//2,10

	}
}