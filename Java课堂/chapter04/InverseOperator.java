//�ǣ�! �� ���^

public class InverseOperator{

	public static void main(String[] args){

		//�� ȡ��
		System.out.println(60 > 90);//f
		System.out.println((60 > 90));//t

		//a^b,�߼���򣬵�a��b��ͬʱ������Ϊtrue������Ϊfalse
		boolean a = (1>2) ^ (2>1);
		System.out.println(a);//t
		System.out.println(10 ^ 8);//2
		System.out.println((60 ^ 60));//0
	}
}