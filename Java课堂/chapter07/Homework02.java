import java.util.Scanner;
public class Homework02{
	public static void main(String[] args){
		System.out.println("请输入一个要查找的字符串str1");
		Scanner myscanner = new Scanner(System.in);
		String str1 = myscanner.next();

		System.out.println("请输入一个数字n");
		int n = myscanner.nextInt();
		String arr[] = new String[n];
		System.out.println("请输入" + n +"个字符串");
		for(int i = 0;i < arr.length;i++){
			String str2 = myscanner.next();
			arr[i] = str2;
		}

		A02 s = new A02();
		int res = s.find(str1,arr);
		if(res != -1){
			System.out.print("字符串下标索引为"+res);
		} else {
			System.out.print("未找到");
		}
		
	}
}
class A02{
	public int find(String str,String arr[]){
		for(int i = 0;i < arr.length;i++){
			if(str.equals(arr[i])){
				return i;
			}
		}
		return -1;
	}
}