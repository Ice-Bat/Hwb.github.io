import java.util.Scanner;

public class Starts { 

	//编写一个main方法
    public static void main(String[] args){

    	Scanner myscanner = new Scanner(System.in);
    	System.out.print("请输入金字塔层数：");
    	int totalLevel = myscanner.nextInt();

    	for(int i = 1;i <= totalLevel;i++){  //金字塔总层数
    		for(int j = 1;j <= totalLevel-i;j++){  //空格数 为总层数—该层
    			System.out.print(" ");
    		}
    		for(int k = 1;k <= 2*i-1;k++){       //* 的个数 为 该层两倍数-1
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
