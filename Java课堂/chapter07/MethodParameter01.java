//
public class MethodParameter01{ 

	//编写一个main方法
	public static void main(String[] args) {

		int a = 9;
		int b = 3;
		AA c = new AA();
		c.swap(a,b);
		System.out.print("a = " + a "b = " + b);
	}
}

class AA{
	public void Swap(int a,int b){
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.print("a = " + a "b = " + b);
	}
}