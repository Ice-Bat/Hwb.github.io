
import java.util.Scanner;
public class BubbleSore { 

	//编写一个main方法
	public static void main(String[] args) {

		int bubble[] = {1,2,3,4,5,6};
		int temp = 0;
		int count = 0;							//代码优化

		for(int j = 0;j < bubble.length-1;j++){	//总体比较总长度—1次
			for(int i = 0;i < 4-j;i++){  //每次比较完后，最后一个数已经不需要在比较，次数减一次
				if(bubble[i] > bubble[i+1]){	//如果前一个大于后一个，进行更换
					temp = bubble[i];
					bubble[i] = bubble[i+1];
					bubble[i+1] = temp;
					count++;						
				}				
			}
			if(count == 0){   				//count == 0;表示代码一次没有交换，直接退出
				break;
			}
			
		}
		System.out.println(count);
		for(int k = 0;k < bubble.length;k++){
			System.out.println(bubble[k]);
		}

	}
}
