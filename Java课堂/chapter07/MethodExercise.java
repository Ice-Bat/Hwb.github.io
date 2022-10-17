
public class MethodExercise { 

	//编写一个main方法
	public static void main(String[] args) {

		AA a = new AA();
		boolean b = a.isOdd(10);
		System.out.println(b);
		a.print(2,2,'#');
	}
}

class AA{
	//1.返回类型为 boolean
	//2.方法名 idOdd
	//3.形参 （int n）
	//4.方法体 判断
	public boolean isOdd(int n){
		// boolean res = false;
		// if(n % 2 == 0){
		// 	res = true;
		// }
		// return res;
		//return n % 2 != 0? false:true;
		return n % 2 == 0;
	}
	//1.返回类型 无
	//2.方法名 print
	//3.形参 (int row , int col , char c)
	//4.方法体 循环输出
	//
	public void print(int row , int col , char c){
		for(int i = 1;i <= row;i++){
			for(int j = 1;j <= col;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}