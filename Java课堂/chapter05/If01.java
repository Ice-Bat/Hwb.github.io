
import java.util.Scanner;  //��Ҫ�ֺ�

public class If01{
	public static void main(String[] args){

		//��дһ����������������䣬��������18
		//��������̸������
		System.out.println("������������䣺");
		Scanner myscanner = new Scanner (System.in);
		int age = myscanner.nextInt();

		if(age > 18){
			System.out.println("�����̸�����ˡ�");
		} else {
			System.out.println("Сѧ����");
		}

	}
}