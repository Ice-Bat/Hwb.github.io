import java.util.Scanner;  //��Ҫ�ֺ�

public class NestedIfExercise{
	public static void main(String[] args){
		Scanner myscanner = new Scanner(System.in);

		System.out.println("�����·ݣ�");
		int month = myscanner.nextInt();
		System.out.println("���������䣺");
		int age = myscanner.nextInt();
		if(month >=4 && month <= 10){

			if(age >= 18 && age <=60){
				System.out.println("����(18-60):60Ԫ");	
			} else if (age >= 0 && age <=17){
				System.out.println("С��(0-17):30Ԫ");
			}else{
				System.out.println("����(>60):20Ԫ");	
			}
		} else if((month >=1 && month <= 3) || (month >= 11 && month <= 12)){
		if(age >= 18 && age <=60){
			System.out.println("����(18-60):40Ԫ");
		} else {
			System.out.println("����:20Ԫ");	
		}
		} else {
			System.out.println("������������ȷ�·�");
		}
	}
}