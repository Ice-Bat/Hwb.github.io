import java.util.Scanner;
public class Homework01{
	public static void main(String[] args){
		System.out.println("请输入一个数字n");
		Scanner myscanner = new Scanner(System.in);
		int n = myscanner.nextInt();
		double arr[] = new double[n];

		System.out.println("请输入" + n +"个浮点型数字");
		for(int i = 0;i < arr.length;i++){
			double num = myscanner.nextDouble();
			arr[i] = num;
		}
		
		A01 t = new A01();
		double res = t.max(arr);	
		System.out.print(n + "个数中最大数为" + res );	
	}
}

class A01{
	public double max(double arr[]){
		double temp = 0;
		for(int i = 0;i < arr.length-1;i++){
			if(arr[i] > arr[i+1]){
				temp = arr[i];
			} else {
				temp = arr[i+1];
			}
		}
		return temp;
	}
}