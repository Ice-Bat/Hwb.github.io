//��֪��һ���������飬�����һ��������Ȼ����
import java.util.Scanner;
public class HomeWork04{

	public static void main(String[] args){

		int arr[] = {12,23,45,56,78,89};
		System.out.println("����������Ҫ�������");
		Scanner myscanner = new Scanner(System.in);
		int num = myscanner.nextInt();
		int arr1[] = new int[arr.length+1];
		int index = -1;

		for(int i = 0;i < arr.length;i++){
			if(num < arr[i]){							//�������ж�num��ԭ�����С
				index = i;								//������num���±귵�أ�������ѭ��
				break;
			}
		}
		if(index == -1){								//���������棬��С��num��ֵ����num���
			index = arr.length;							//�����ȵ�ֵ�����±�
		}												
		for(int j = 0;j < arr1.length ;j++){
			if(j < index){								//С���±꣬������ֵ
				arr1[j] = arr[j];				
			} else if(j == index){						//�����±꣬��num����
				arr1[j] = num;
			} else{
				arr1[j] = arr[j-1];						//�����±꣬arr[j-1]������ֵ
			}
		}
		for(int k = 0;k < arr1.length;k++){
			System.out.print(arr1[k] + " ");
		}
	}
}