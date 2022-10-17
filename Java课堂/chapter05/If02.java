import java.util.Scanner;  //需要分号

public class If02{
	public static void main(String[] args){
		
		System.out.println("请输入宝哥的信用分：");
		Scanner myscanner = new Scanner (System.in);
		double credit_Point = myscanner.nextDouble();
		if(credit_Point >= 1 && credit_Point <=100){
			if(credit_Point == 100){
				System.out.println("信用极好");
			} else if(credit_Point <= 99 && credit_Point > 80){
				System.out.println("信用优秀");
			}else if(credit_Point <= 80 && credit_Point > 60){
				System.out.println("信用一般");
			} else {
				System.out.println("信用不及格");
			}
		} else {
			System.out.println("请重新输入：）");
		}

		
		boolean b = true;
		if(b = false){
			System.out.println("请重新输入：）");
		} else if(b == false){
			System.out.println("zz ");
		}
	}

}