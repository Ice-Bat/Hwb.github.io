
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
	// ���������������ƣ�������ͬ����������������ͬ ->ʹ�ÿɱ����
	// 
	// 1.int... ��ʾ���ܵ��ǿɱ��������int �����ܣ�0-�ࣩ��int
	// 2.ʹ�ÿɱ����ʱ���Ե���������ʹ�ü�num���Ե�������
	// 3.����num�������
	public int sum(int...num){
		int res = 0;
		for(int i = 0;i < num.length;i++){
			res += num[i]; 
		}
		return res;
	}
}