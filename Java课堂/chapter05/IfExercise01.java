import java.util.Scanner;  //需要分号

public class IfExercise01{
	public static void main(String[] args){
		double d1 = 12.2;
		double d2 = 15.3;
		if(d1 > 10 && d2 < 20){
			double Sum = d1 + d2;
			System.out.println("Sum = " + Sum);
			System.out.println("Sum = " + (d1 + d2));
		}
		int n1 = 12;
		int n2 = 3;
		if( (n1 + n2) % 3  ==0  && (n1 + n2) % 5 ==0){
		System.out.println("可以被3，和5整除");
		} else {
			System.out.println("不可以可以被3，和5整除");
		}
		System.out.println("请输入年份：");
		Scanner myscanner = new Scanner (System.in);
		int year = myscanner.nextInt();

		if((year % 4 ==0 ) && (year % 100 !=0)||(year % 400 ==0)){
		System.out.println("闰年");
		}
	}
}