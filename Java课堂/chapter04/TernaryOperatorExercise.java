public class TernaryOperatorExercise { 

	//��дһ��main����
	public static void main(String[] args) {
		//ʵ�����������
		
		int n1 = 12;
		int n2 = 123;
		int n3 = 1234;
		int temp = n1 > n2 ? n1 : n2;
		int max = temp >n3 ? temp : n3;
		System.out.println("max = " + max );
		
	}
}