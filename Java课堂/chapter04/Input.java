import java.util.Scanner; //��ʾ��Java.util�µ�Scanner������
public class Input{
	public static void main(String[] args){

		//��ʾ�����û�������
		//����
		//Scanner���ʾ ���ı�ɨ��������java.util��
		//1.���� Sacaner�����ڵİ�
		//2.���� Scanner ����new ����һ������
		//  myScanner���� Scanner��Ķ���
		Scanner myScanner = new Scanner (System.in);
		//3.�����û�������
		System.out.println("���������֣�");
		String name = myScanner.next();  //�����û������ַ���
		System.out.println("���������䣺");
		int age = myScanner.nextInt();  //�����û�����int
		System.out.println("������нˮ��");
		double sal = myScanner.nextDouble();  //�����û�����double
		System.out.println("�˵���Ϣ��");
		System.out.println("name = " + name + "age = " + age
							+ "sal = " + sal);
	}
}