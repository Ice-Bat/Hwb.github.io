import java.util.Scanner;

public class SwitchExercise{
	public static void main(String[] args){

		Scanner myscanner = new Scanner (System.in);
		System.out.println("������Сд��ĸ��");
		char character = myscanner.next().charAt(0);

		//1.
		switch(character){
			case 'a':
				System.out.println("A");
				break;
			case 'b':
				System.out.println("B");
				break;
			case 'c':
				System.out.println("C");
				break;
			case 'd':
				System.out.println("D");
				break;
			case 'e':
				System.out.println("E");
				break;
			default :
				System.out.println("other");
		}
		//2.
		System.out.println("������ɼ�(0-100)��");
		int score = (int)myscanner.nextDouble() / 60;
		if(score >=0 && score<=100){
			switch(score){
				case 0:
					System.out.println("���ϸ�");
					break;
				case 1:
					System.out.println("�ϸ�");
					break;
			}	
		} else {
			System.out.println("������ɼ���0-100��");
		}


		//3.
		System.out.println("�������·ݣ�");
		int month = myscanner.nextInt();

		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
		}

	}
}