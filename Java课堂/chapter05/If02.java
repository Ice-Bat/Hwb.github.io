import java.util.Scanner;  //��Ҫ�ֺ�

public class If02{
	public static void main(String[] args){
		
		System.out.println("�����뱦������÷֣�");
		Scanner myscanner = new Scanner (System.in);
		double credit_Point = myscanner.nextDouble();
		if(credit_Point >= 1 && credit_Point <=100){
			if(credit_Point == 100){
				System.out.println("���ü���");
			} else if(credit_Point <= 99 && credit_Point > 80){
				System.out.println("��������");
			}else if(credit_Point <= 80 && credit_Point > 60){
				System.out.println("����һ��");
			} else {
				System.out.println("���ò�����");
			}
		} else {
			System.out.println("���������룺��");
		}

		
		boolean b = true;
		if(b = false){
			System.out.println("���������룺��");
		} else if(b == false){
			System.out.println("zz ");
		}
	}

}