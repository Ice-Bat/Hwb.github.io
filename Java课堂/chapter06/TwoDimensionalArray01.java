//��̬��ʼ��
public class TwoDimensionalArray01{

	public static void main(String[] args){
		//��ά������ʽ�� int [][]
		//��ά�����ÿ��Ԫ�ض���һ��һά����
		int arr[][] = {{1,2,3,4},{5,6,7,8},
					   {1,2,3,4},{5,6,7,8}};

		for(int i = 0;i < arr.length;i++){  //������ά�����ÿ��Ԫ��
			//������ά�����ÿһ��Ԫ��
			//1.arr[i]��ʾ��ά����ĵ�i��Ԫ��
			//arr[i].length �õ���Ӧ��һά����ĳ���
			for(int j = 0;j < arr[i].length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}