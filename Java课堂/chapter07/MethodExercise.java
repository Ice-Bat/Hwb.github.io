
public class MethodExercise { 

	//��дһ��main����
	public static void main(String[] args) {

		AA a = new AA();
		boolean b = a.isOdd(10);
		System.out.println(b);
		a.print(2,2,'#');
	}
}

class AA{
	//1.��������Ϊ boolean
	//2.������ idOdd
	//3.�β� ��int n��
	//4.������ �ж�
	public boolean isOdd(int n){
		// boolean res = false;
		// if(n % 2 == 0){
		// 	res = true;
		// }
		// return res;
		//return n % 2 != 0? false:true;
		return n % 2 == 0;
	}
	//1.�������� ��
	//2.������ print
	//3.�β� (int row , int col , char c)
	//4.������ ѭ�����
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