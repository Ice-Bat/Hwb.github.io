
public class ConstructorDetail{
	public static void main(String[] args){
		Person p = new Person("jj",8);
		Person p1 = new Person("vv");
		System.out.println(p.name + " " + p1.name);
	}
}
//ϸ��5.����Աû�б�д��������ϵͳ���Զ���������һ���޲ι�������Ҳ��Ĭ�Ϲ�����
//ʹ��javap������ javap Dog.class
/*
	Ĭ�Ϲ�����
	Dog(){
	
	}
 */
//ϸ��6.һ�������Լ��Ĺ�������Ĭ�ϵĹ������͸����ˣ��Ͳ���ʹ��Ĭ�ϵ��޲ι�����
//�����Լ���ʾ����
class Dog{
	int age;
	public Dog(int page){
		age = page;
	}
	Dog(){// ��ʾ���� �޲ι�����

	}
}

class Person{
	String name;
	int age;
	//ϸ��1.������������
	//ϸ��2.����������������ͬ
	//ϸ��3.û�з���ֵ
	//ϸ��4.����������ɶ���ĳ�ʼ���������Ǵ�������
	//��һ��������
	public Person(String pname,int page){
		name = pname;
		age = page;
	}
	//�ڶ���������
	public Person(String pname){
		name = pname;
	}
	
}