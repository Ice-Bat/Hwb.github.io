public class ArrayReserve { 

	//编写一个main方法
	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,9};
		// int arr1[] = new int[arr.length];
		// int i = 0;
		// int j = arr.length;
		// for(i = 0,j = arr.length-1;i < arr.length;i++,j--){
		// 	arr1[j] = arr[i];
		// }
		// for(int k = 0;k < arr.length;k++){
		// 	//arr[k] = arr1[k];  
		// 	arr = arr1;  //将arr1的地址赋予arr
		// 	System.out.print(arr[k]);
		// }

		int temp = 0;
		for(int m = 0;m <arr.length/2;m++){
			temp = arr[arr.length-1-m];
			arr[arr.length-1-m] = arr[m];
			arr[m] = temp;
		}
		for(int n = 0;n <arr.length;n++){
			System.out.print(arr[n]);
		}
	}
}