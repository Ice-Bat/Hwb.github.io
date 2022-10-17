
public class TwoDimensionalArray03{

	public static void main(String[] args){

		int arr[][] = new int[2][];//创建二维数组，但是还未给一维数组开空间

		for(int i = 0;i < arr.length;i++){
			//给每个一维数组开空间
			arr[i] = new int[i+1];

			//遍历每个元素，并给一维数组的每个元素赋值
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