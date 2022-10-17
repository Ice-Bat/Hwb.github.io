//1.有人有100000元，经过一路口
//>=50000,交%5的钱
//<50000,交1000一次
//累计次数，用while-break
//2.实现判断一个整数，属于哪个范围 >0,<0,=0
//3.判断一个年份是否为闰年
import java.util.Scanner;
public class ChapterExercise01_03 { 

	//编写一个main方法
    public static void main(String[] args){

    	double money = 100000;
    	int count = 0;
    	while (money > 1000){
    		while(money >= 50000){
    			money -=money*0.05;	
    			count++;
    		}
    		while(money >1000){
    			money -=1000;
    			count++;
    		}
    		break;
    	}
        System.out.println("count = " + count);

    Scanner myscanner = new Scanner(System.in);

    System.out.println("请输入整数");
    int num = myscanner.nextInt();
    if(num > 0){
        System.out.println("大于零");
    } else if (num == 0){
        System.out.println("等于零");
    } else{
        System.out.println("小于零");
    }

    int year = myscanner.nextInt();
    System.out.println("请输入年份");
    if(year % 4 ==0 && year % 100 !=0 ||year % 400 == 0){
        System.out.println("闰年");
    }

    }

}


