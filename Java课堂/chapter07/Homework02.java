import java.util.Scanner;
public class Homework02{
	public static void main(String[] args){
		System.out.println("������һ��Ҫ���ҵ��ַ���str1");
		Scanner myscanner = new Scanner(System.in);
		String str1 = myscanner.next();

		System.out.println("������һ������n");
		int n = myscanner.nextInt();
		String arr[] = new String[n];
		System.out.println("������" + n +"���ַ���");
		for(int i = 0;i < arr.length;i++){
			String str2 = myscanner.next();
			arr[i] = str2;
		}

		A02 s = new A02();
		int res = s.find(str1,arr);
		if(res != -1){
			System.out.print("�ַ����±�����Ϊ"+res);
		} else {
			System.out.print("δ�ҵ�");
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