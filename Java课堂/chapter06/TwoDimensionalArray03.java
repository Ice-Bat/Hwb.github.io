
public class TwoDimensionalArray03{

	public static void main(String[] args){

		int arr[][] = new int[2][];//������ά���飬���ǻ�δ��һά���鿪�ռ�

		for(int i = 0;i < arr.length;i++){
			//��ÿ��һά���鿪�ռ�
			arr[i] = new int[i+1];

			//����ÿ��Ԫ�أ�����һά�����ÿ��Ԫ�ظ�ֵ
			for(int j = 0;j < arr[i].length;j++){
				arr[i][j] = i + 1;	
			}
		}

		for(int i = 0;i < arr.length;i++){

			for(int j = 0;j < arr[i].length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}