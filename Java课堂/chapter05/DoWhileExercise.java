
public class DoWhileExercise { 

	//��дһ��main����
	public static void main(String[] args) {

		int i = 1;
		do{
			System.out.println("i = " + i);
			i++;
		} while (i <= 100);
		int sum = 0;
		int num = 1;
		do{
			sum += num;
			num++;
		} while (num <= 100);
		System.out.println("sum = " + sum);

		int num1 = 1;
		int count = 0;
		do{
			if(num1 % 5 ==0 && num1 % 3 !=0){
				count++;
			}
			num1++;
		} while (num1 <=200);
		System.out.println("count = " + count);

		int Hp = 3000;
		do{
			System.out.println("��Ǯ������Ǯ��һֱ��");
			Hp -=500;
		} while (Hp >= 0);
		System.out.println("�绹Ǯ�Ͳ��ð�����");
	}
}