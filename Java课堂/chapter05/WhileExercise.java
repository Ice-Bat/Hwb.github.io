import java.util.Scanner;

public class WhileExercise { 

	//��дһ��main����
	public static void main(String[] args) {

		int i = 1;
		while (i <= 100){
			if(i % 3 ==0){
				System.out.println("i = " + i);
			}
			i++;
		}

		int num = 40;
		while(num <=400){
			if(num %2 ==0){
				System.out.println("num = " + num);
			}
			num++;
		}

		Scanner myscanner = new Scanner(System.in);
		System.out.println("�����뿪ʼ����");
		int start = myscanner.nextInt();
		System.out.println("�������������");
		int end = myscanner.nextInt();

		while(start<=end){
			if(start % 5 ==0){
				System.out.println("ok");
			}
			start++;
		}
	}
}