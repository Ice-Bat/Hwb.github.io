
//д��ð������
public class HomeWork06{

	public static void main(String[] args){

		int temp = 0;
		int arr[] = new int[10];
		for(int i = 0;i < arr.length;i++){
			arr[i] = (int)(Math.random() *100) + 1;
		}
		System.out.println("������ɵ���ֵ");
		for(int n = 0;n < arr.length;n++){
			System.out.print(arr[n] + " ");
		}

		for(int j = 0;j < arr.length-1;j++){
			for(int k = 0;k < arr.length-1-j;k++){
				if(arr[k] > arr[k+1]){
					temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("ð��������ֵ");
		for(int m = 0;m < arr.length;m++){
			System.out.print(arr[m]+ " ");
		}
	}
}
