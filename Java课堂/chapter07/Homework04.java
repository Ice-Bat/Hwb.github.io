import java.util.Scanner;
public class Homework04{
	public static void main(String[] args){

		int[] oldArr = {1,2,3,4,5};
		A04 a04 = new A04();
		
		int[] newArr = a04.copyArr(oldArr);
		for(int i = 0;i < newArr.length;i++){
			System.out.print(newArr[i]);
		}
	}
}
class A04{
	public int[] copyArr(int[] oldArr){
		int[] newArr = new int[oldArr.length];

		for(int i = 0;i < oldArr.length;i++){
			newArr[i] = oldArr[i];
		}
		return newArr;
	}
}