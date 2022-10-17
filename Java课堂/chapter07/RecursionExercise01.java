import java.util.Scanner;
public class RecursionExercise01{ 

	public static void main(String[] args) {
		T t = new T();
		Scanner myscanner = new Scanner(System.in);
		System.out.print("请输入一个数");
		int n = myscanner.nextInt();
		if(t.fibonacci(n) != -1){
			System.out.print("第" + n + "的斐波那契数是" + t.fibonacci(n));
		}
		System.out.println();
		System.out.print("一共有"+t.monkey(10)+"个桃");
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
			System.out.println("请输入大于0的值");
			return -1;
		}
	}
	//思路
	//1.返回类型 int
	//2.方法名 monkey
	//3.参数列表 天数
	
	public int monkey(int n){
		if(n == 1){
			return 1;
		} else {
			return (monkey(n-1)+1)*2;
		}
	}
}