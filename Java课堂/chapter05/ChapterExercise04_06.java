//4.判断一个数是个否为水仙花数
//6.输出1-100之间不能被5整除的数，没5个一行
import java.util.Scanner;
public class ChapterExercise04_06 { 

	//编写一个main方法
    public static void main(String[] args){

    	Scanner myscanner = new Scanner(System.in);

    	System.out.println("请输入一个三位数整数");
    	int num1 = myscanner.nextInt();
        int num2 = 0;
        int num3 = num1;  //存放num1的值，用来对比
    	int sum = 0;
        int temp = 0;

    	for(int i = 1;i <= 3;i++){
    		num2 = num1 % 10;
    		num1 /= 10;
            temp = num2;
    		for(int j = 1;j <= 2;j++){
                
    			num2 = num2*temp;                			
    		}
            sum += num2;
            if(sum == num3){
                System.out.println("该数是水仙花数 sum = " + sum);
            }

    	}	
//6.
        int count = 0;
        for(int k = 1;k <= 100;k++){
            if(k % 5 != 0){
                System.out.print("k = " + k);
                count++;                
            }
            if(count == 5){
                System.out.println();
                count = 0; 
            }
            
        }
    }

}

//5.
class Demo{
    public static void main (String[] args){

        int m = 0,n = 3;
        if(m > 0){
            if(n > 2)
                System.out.println("ok1");
            else
                System.out.println("ok2");
        }
    }
}

