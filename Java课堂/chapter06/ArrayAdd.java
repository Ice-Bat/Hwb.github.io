import java.util.Scanner;
public class ArrayAdd { 

	//��дһ��main����
	public static void main(String[] args) {
		// //1.��ͨ����һ��
		// int arr1[] = {1,2,3};
		// int arr2[] = new int[arr1.length+1];
		// arr2[arr1.length] = 4;
		// for(int i = 0;i < arr1.length;i++){
		// 	arr2[i] = arr1[i];
		// }
		// arr1 = arr2;
		// System.out.println("������ݺ������");
		// for(int i = 0;i < arr1.length;i++){
		// 	System.out.print(arr1[i] + "\t");
		// }
		
		int arr1[] = {1,2,3,4,5};
		do{		
			int arr2[] = new int[arr1.length+1];
			System.out.println("��������Ҫ��ӵ���");
			Scanner myscanner = new Scanner(System.in);
			int num = myscanner.nextInt();
			arr2[arr1.length] = num;	
			for(int i = 0;i < arr1.length;i++){
				arr2[i] = arr1[i];
			}
			arr1 = arr2;
			System.out.println("�Ƿ���Ҫ�������룬��������y����n");
			char c1 = myscanner.next().charAt(0);
			if(c1 == 'n'){
				break;
			}
					
		}while(true);
		System.out.println("������ݺ������");
		for(int i = 0;i <arr1.length;i++){
			System.out.print(arr1[i] + "\t");
		}		
	}
}