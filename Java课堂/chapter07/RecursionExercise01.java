import java.util.Scanner;
public class RecursionExercise01{ 

	public static void main(String[] args) {
		T t = new T();
		Scanner myscanner = new Scanner(System.in);
		System.out.print("������һ����");
		int n = myscanner.nextInt();
		if(t.fibonacci(n) != -1){
			System.out.print("��" + n + "��쳲���������" + t.fibonacci(n));
		}
		System.out.println();
		System.out.print("һ����"+t.monkey(10)+"����");
	}
}

class T{
	public int fibonacci(int day){
		if(n >= 1){
			if(n == 1 || n == 2){
				return 1;
			} else {
				return fibonacci(n - 1) + fibonacci(n-2);
			}
		} else {
			System.out.println("���������0��ֵ");
			return -1;
		}
	}
	//˼·
	//1.�������� int
	//2.������ monkey
	//3.�����б� ����
	
	public int monkey(int n){
		if(n == 1){
			return 1;
		} else {
			return (monkey(n-1)+1)*2;
		}
	}
}