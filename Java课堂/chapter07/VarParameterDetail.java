
public class VarParameterDetail{
	public static void main(String[] args){

		int arr[] = {1,1,1,1,1};
		Method m = new Method();
		m.a(arr);
	}
}

class Method{
	//ϸ��1.�ɱ������ʵ�ο���Ϊ�������
	//ϸ��2.�ɱ������ʵ�ο���Ϊ����
	public void a(int...nums){
		System.out.print(nums.length);
		for(int i = 0;i < nums.length;i++){
			System.out.print(nums[i] + " ");
		}
	}
	//ϸ��3.�ɱ������ʵ�ʾ�������
	//ϸ��4.�ɱ�������Ժ���ͨ��������һ���β��б�������뱣֤�ɱ�����ں�
	public void sum (String str,int...nums){

	}
	//ϸ��5.�β��б�ֻ�ܳ���һ���ɱ����
	//���´���
	// public void h(int...nums,int...num){
		
	// }
}