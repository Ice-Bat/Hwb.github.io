
public class ThisDetail{
	public static void main(String[] args){

		Y y = new Y();
		y.f1();
		Y y1 = new Y(15);
		y1.f3();
	}
}

class Y{
	int age = 14;
	public void f1(){
		System.out.println("f1()����");
		//����1.
		f2();
		//����2.ϸ�ڣ����ʳ�Ա�������﷨ this.������(�����б�)
		this.f2();

	}
	public void f2(){
		System.out.println("f2()����");
	}

	public void f3(){
		int age = 12;
		System.out.println("age  = " + age);
		System.out.println("this.age  = " + this.age); //0 -> 13 -> 14 ->15
	}

	//���ʹ������﷨  this(�����б�)
	//ע�� ֻ���ڹ�������ʹ�ã���ֻ���ڹ������з�����һ��������
	// ��this�ĵ��ñ����ǹ������еĵ�һ�����
	public Y(int age){
		this.age = age;
		System.out.println("this.age = " + this.age);
	}
	public Y(){
		// ��this�ĵ��ñ����ǹ������еĵ�һ�����
		this(13);
		System.out.println("�޲ι�����");
	}
}