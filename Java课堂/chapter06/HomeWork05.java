
public class HomeWork05{

	public static void main(String[] args){

		int sum = 0;
		double average = 0;
		int max = 0;
		int index = -1;
		int arr[] = new int[10];
		for(int i = 0;i < arr.length;i++){
			arr[i] = (int)(Math.random() *100) + 1;
		}
		for(int j = arr.length-1;j >= 0;j--){
			System.out.print(arr[j] + " ");
			sum += arr[j];
			if(arr[j] > max){
				max = arr[j];
				index = j;
			} else if(arr[j] == 8){
				System.out.println("随机数里有8");
			}
		}
		average = sum / arr.length;
		System.out.println("average = "+average+" max = "+max+" index = "+index);
	}
}