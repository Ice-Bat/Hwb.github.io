public class TernaryOperatorExercise { 

	//编写一个main方法
	public static void main(String[] args) {
		//实现三个数最大
		
		int n1 = 12;
		int n2 = 123;
		int n3 = 1234;
		int temp = n1 > n2 ? n1 : n2;
		int max = temp >n3 ? temp : n3;
		System.out.println("max = " + max );
		
	}
}