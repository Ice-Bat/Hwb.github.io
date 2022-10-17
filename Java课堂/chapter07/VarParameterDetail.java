
public class VarParameterDetail{
	public static void main(String[] args){

		int arr[] = {1,1,1,1,1};
		Method m = new Method();
		m.a(arr);
	}
}

class Method{
	//细节1.可变参数的实参可以为零个或多个
	//细节2.可变参数的实参可以为数组
	public void a(int...nums){
		System.out.print(nums.length);
		for(int i = 0;i < nums.length;i++){
			System.out.print(nums[i] + " ");
		}
	}
	//细节3.可变参数的实质就是数组
	//细节4.可变参数可以和普通参数放在一个形参列表里，但必须保证可变参数在后
	public void sum (String str,int...nums){

	}
	//细节5.形参列表只能出现一个可变参数
	//以下错误
	// public void h(int...nums,int...num){
		
	// }
}