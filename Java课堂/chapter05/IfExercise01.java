import java.util.Scanner;  //��Ҫ�ֺ�

public class IfExercise01{
	public static void main(String[] args){
		double d1 = 12.2;
		double d2 = 15.3;
		if(d1 > 10 && d2 < 20){
			double Sum = d1 + d2;
			System.out.println("Sum = " + Sum);
			System.out.println("Sum = " + (d1 + d2));
		}
		int n1 = 12;
		int n2 = 3;
		if( (n1 + n2) % 3  ==0  && (n1 + n2) % 5 ==0){
		System.out.println("���Ա�3����5����");
		} else {
			System.out.println("�����Կ��Ա�3����5����");
		}
		System.out.println("��������ݣ�");
		Scanner myscanner = new Scanner (System.in);
		int year = myscanner.nextInt();

		if((year % 4 ==0 ) && (year % 100 !=0)||(year % 400 ==0)){
		System.out.println("����");
		}
	}
}