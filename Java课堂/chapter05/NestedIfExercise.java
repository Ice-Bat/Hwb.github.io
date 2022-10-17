import java.util.Scanner;  //需要分号

public class NestedIfExercise{
	public static void main(String[] args){
		Scanner myscanner = new Scanner(System.in);

		System.out.println("请输月份：");
		int month = myscanner.nextInt();
		System.out.println("请输入年龄：");
		int age = myscanner.nextInt();
		if(month >=4 && month <= 10){

			if(age >= 18 && age <=60){
				System.out.println("成人(18-60):60元");	
			} else if (age >= 0 && age <=17){
				System.out.println("小孩(0-17):30元");
			}else{
				System.out.println("老人(>60):20元");	
			}
		} else if((month >=1 && month <= 3) || (month >= 11 && month <= 12)){
		if(age >= 18 && age <=60){
			System.out.println("成人(18-60):40元");
		} else {
			System.out.println("其他:20元");	
		}
		} else {
			System.out.println("请重新输入正确月份");
		}
	}
}