import java.util.Scanner;

public class SwitchExercise{
	public static void main(String[] args){

		Scanner myscanner = new Scanner (System.in);
		System.out.println("请输入小写字母：");
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
		System.out.println("请输入成绩(0-100)：");
		int score = (int)myscanner.nextDouble() / 60;
		if(score >=0 && score<=100){
			switch(score){
				case 0:
					System.out.println("不合格");
					break;
				case 1:
					System.out.println("合格");
					break;
			}	
		} else {
			System.out.println("请输入成绩（0-100）");
		}


		//3.
		System.out.println("请输入月份：");
		int month = myscanner.nextInt();

		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
		}

	}
}