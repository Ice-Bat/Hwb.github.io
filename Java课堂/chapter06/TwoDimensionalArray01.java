//静态初始化
public class TwoDimensionalArray01{

	public static void main(String[] args){
		//二维数组形式上 int [][]
		//二维数组的每个元素都是一个一维数组
		int arr[][] = {{1,2,3,4},{5,6,7,8},
					   {1,2,3,4},{5,6,7,8}};

		for(int i = 0;i < arr.length;i++){  //遍历二维数组的每个元素
			//便利二维数组的每一个元素
			//1.arr[i]表示二维数组的第i个元素
			//arr[i].length 得到对应的一维数组的长度
			for(int j = 0;j < arr[i].length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}