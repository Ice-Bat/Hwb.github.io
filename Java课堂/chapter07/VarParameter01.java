
public class VarParameter01{
	public static void main(String[] args){

		Method m = new Method();
		System.out.print(m.sum(2,4));
	}
}

class Method{
	// public void sum (int n1,int n2){
	// 	System.out,print(n1+n2);
	// }
	// public void sum (int n1,int n2,int n3){
	// 	System.out,print(n1+n2+n3);
	// }
	// 	public void sum (int n1,int n2,int n3,int n4){
	// 	System.out,print(n1+n2+n3+n4);
	// }
	// 上面三个方法名称，功能相同，除开参数个数不同 ->使用可变参数
	// 
	// 1.int... 表示接受的是可变参数类型int 即接受（0-多）个int
	// 2.使用可变参数时可以当作数组来使用即num可以当作数组
	// 3.遍历num即可求和
	public int sum(int...num){
		int res = 0;
		for(int i = 0;i < num.length;i++){
			res += num[i]; 
		}
		return res;
	}
}