//已知有一个升序数组，求插入一个数后，仍然升序
import java.util.Scanner;
public class HomeWork04{

	public static void main(String[] args){

		int arr[] = {12,23,45,56,78,89};
		System.out.println("请输入你需要插入的数");
		Scanner myscanner = new Scanner(System.in);
		int num = myscanner.nextInt();
		int arr1[] = new int[arr.length+1];
		int index = -1;

		for(int i = 0;i < arr.length;i++){
			if(num < arr[i]){							//遍历，判断num与原数组大小
				index = i;								//将大于num的下标返回，并结束循环
				break;
			}
		}
		if(index == -1){								//若果遍历玩，无小于num的值，即num最大
			index = arr.length;							//将长度的值赋予下标
		}												
		for(int j = 0;j < arr1.length ;j++){
			if(j < index){								//小于下标，正常赋值
				arr1[j] = arr[j];				
			} else if(j == index){						//等于下标，将num插入
				arr1[j] = num;
			} else{
				arr1[j] = arr[j-1];						//大于下标，arr[j-1]继续赋值
			}
		}
		for(int k = 0;k < arr1.length;k++){
			System.out.print(arr1[k] + " ");
		}
	}
}