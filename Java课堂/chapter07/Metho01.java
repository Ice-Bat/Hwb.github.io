
public class Metho01 { 

	//��дһ��main����
	public static void main(String[] args) {

		//ʹ�÷���
		//1.����д�ú������ȥ���ã��Ͳ������
		//2.�ȴ��������ڵ��÷���
		Person p = new Person();
		p.speak();  	//���÷���
		p.cal01();
		p.cal02(5);
		p.cal02(10);
		int res = p.getsum(14,16);
		System.out .println(res);
	}
}

class Person{

	//��������Ա������
	//���speak���� ���"����һ��˧��"
	//
	//1.public �Ǳ�ʾ��������
	//2.void ��ʾ�޷���ֵ
	//3.speak() speak�������� ():��ʾ�β��б�
	//4.{} ��ʾ�����壬д����Ҫִ�еĴ���
	public void speak (){
		System.out.println("����һ��˧��");
	}
	int sum = 0;
	public void cal01(){
		for(int i = 1;i <= 1000;i++){
			sum += i;
		}
		System.out.println("sum = " + sum);
		sum = 0;
	}
	public void cal02(int n){
		for(int i = 1;i <= n;i++){
			sum += i;
		}
		System.out.println("sum = " + sum);
		sum = 0;
	}
	//���getsum�ĳ�Ա����
	//
	//1.public �Ǳ�ʾ��������
	//2.int ��ʾִ�к󣬷���һ��intֵ
	//3.getsum ������
	//4.(int num1 , int num2) �����βΣ������û�����
	//5.return res�� ��ʾ��resֵ����
	public int getsum(int num1 , int num2){
		int res = num1+num2;
		return res;
	}
}
