
import java.util.Scanner;
public class ArrayReduce { 

	//��дһ��main����
	public static void main(String[] args) {		
		int arr1[] = {1,2,3,4,5};
		do{		
			Scanner myscanner = new Scanner(System.in);	

			int arr2[] = new int[arr1.length-1];
			for(int i = 0;i < arr1.length-1;i++){
				arr2[i] = arr1[i];
			}
			arr1 = arr2;
			System.out.println("�Ƿ���Ҫ������������������y����n");
			char c1 = myscanner.next().charAt(0);
			if(c1 == 'n' || arr1.length == 1){
				break;
			}
					
		}while(true);
		System.out.println("������ݺ������");
		for(int i = 0;i <arr1.length;i++){
			System.out.print(arr1[i] + "\t");
		}		
	}
}