//打印杨辉三角
import java.util.Scanner;
public class TwoDimensionalExercise{

	public static void main(String[] args){

		Scanner myscanner = new Scanner(System.in);
		System.out.print("请输入层数");
		int layer = myscanner.nextInt();

		int arr[][] = new int[layer][];
		int temp = 0;
		for(int i = 0;i < arr.length;i++){
			arr[i] = new int[i+1];

 				for(int j = 0;j < arr[i].length;j++){
					if(j == 0 || j == arr[i].length-1){
						arr[i][j] = 1;
					} else {
						arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
					// 	for(int k = 0;k < i - 1;k++){
							
					// 		temp = arr[i-1][k] + arr[i-1][k+1];							
					// 		arr[i][j] = temp;
					// 		j++;
					// 	}
					// 	j -= 1;
					 }	

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