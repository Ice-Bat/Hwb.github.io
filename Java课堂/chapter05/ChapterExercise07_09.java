//7.输出小写的a~z,和Z~A
//8.输出1/1-1/2+1/3-.....-1/100
//求 1+(1+2)+(1+2+3)....(1+...100)
import java.util.Scanner;
public class ChapterExercise07_09 { 

	//编写一个main方法
    public static void main(String[] args){

    	for(int c1 = 97;c1 <= 122;c1++){
    		System.out.print((char)c1);
    	}
    	for(int c2 = 90;c2 >= 65;c2--){
    		System.out.print((char)c2);
    	}
//8.
    	double sum = 0;
    	double flag = 1;
    	for(int k = 1;k <= 100;k++){
    		sum = sum +(double)1/k*flag;
    		flag = -flag;
    	}
    	System.out.println("sum = " + sum);

//9.
		int sum1 = 0;
    	int sum2 = 0;
    	for(int t = 1;t <= 100;t++){
    		
    		sum1 = sum1 + t;
    		sum2 = sum2 + sum1;
    	}
    	System.out.println("sum2 = "+ sum2);
    }
}