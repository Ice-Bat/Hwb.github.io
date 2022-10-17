
import java.util.Scanner;  //需要分号

public class If01{
	public static void main(String[] args){

		//编写一个程序，输入你的年龄，若果大于18
		//输出你可以谈恋爱了
		System.out.println("请输入你的年龄：");
		Scanner myscanner = new Scanner (System.in);
		int age = myscanner.nextInt();

		if(age > 18){
			System.out.println("你可以谈恋爱了。");
		} else {
			System.out.println("小学生。");
		}

	}
}