
public class VarScopeDetail { 

	//��дһ��main����
	public static void main(String[] args) {
		Person p = new Person();
		p.say();
		T t = new T();
		//ϸ��4.�����ڷ�Χ��ͬ
		//ȫ�ֱ��������Կ��Ը�����ʹ�ã����������ʹ��
		//�ֲ�����ֻ���ڶ�Ӧ������ʹ��
		t.test1();  //��һ�����������Եķ���
		t.test2(p);  //�ڶ��ֿ�����ʶ������Եķ���
	}
}

class T {
	//ϸ��5.ȫ�ֱ��������Կ��Լ����η�(public,protected,private)���ֲ����������Լ�
	public int sum = 10;
	public void test1(){
		//public int sum = 10;  ����
		Person p = new Person();
		System.out.println("p.name = " + p.name);
	}
	public void test2(Person p){
		System.out.println("p.name = " + p.name);
	}
}

class Person{
	//ϸ��1.�ֲ��������Կ��Ժ�ȫ�ֱ�������������ʱ��ѭ�ͽ�ԭ��
	//ϸ��2.��ͬһ���������У�����ͬһ�������У������ֲ�������������
	//ϸ��3.�����������ڽϳ��������Ŷ���Ĵ��������������ٶ�����
	//�ֲ������������ڽ϶̣������Ŵ�����ִ�ж�����������������
	String name = "huang";
	public void say(){
		String name = "wei";
		System.out.println("name = "+name); //name = wei
	}
}