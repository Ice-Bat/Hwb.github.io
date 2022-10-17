import java.util.Scanner;
public class BinSearch{
	public static void main(String[] args){

		int arr[] = {12,45,56,78,89,90,99,100};
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入你需要查找的数");
		int num = myscanner.nextInt();

		int head = 0;
		int trail = arr.length;
		int bin = (head + trail)/2;
		int count = 0;
		while(head != trail){
			bin = (head + trail)/2;
			if(num > arr[bin]){
				head = bin + 1;
			} else if(num < arr[bin]){
				trail = bin - 1;
			} else {
				System.out.println("相等");
				break;
			}
			count++;
		}
		System.out.println(count+ " " + arr[bin]);
	}
}