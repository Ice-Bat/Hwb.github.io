import java.util.Scanner;

public class Switch01{
	public static void main(String[] args){

		System.out.println("�������ַ�a-g��");
		Scanner myscanner = new Scanner (System.in);
		char character = myscanner.next().charAt(0);
		switch(character){
			case 'a':System.out.println("����һ");break; 
			case 'b':System.out.println("���ڶ�");break;
			case 'c':System.out.println("������");break;
			case 'd':System.out.println("������");break;
			case 'e':System.out.println("������");break;
			case 'f':System.out.println("������");break;
			case 'g':System.out.println("������");break;
			default :System.out.println("���ڷ�Χ��");break;
		}

	}
}