
public class Constructor01{
	public static void main(String[] args){
		//������newһ������ʱ��ֱ��ͨ����������ʼ��
		Person p = new Person("cc",90);
		System.out.println(p.name + " " + p.age);
	}
}

class Person{
	String name;
	int age;
	//������
	//1.������û�з���ֵ��Ҳ��Ҫ��void
	//2.���������ֺ�����һ��
	//3.(String pname,int page)�ǹ������β��б�����ͳ�Ա����һ��
	public Person(String pname,int page){
		name = pname;
		age = page;
	}
}