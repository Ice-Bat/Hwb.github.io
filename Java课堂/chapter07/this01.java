
public class this01{
	public static void main(String[] args){

		Person p1 = new Person("cc",8);
		p1.info();	
		System.out.println("=========");
		Person p2 = new Person("jj",18);
		p2.info();
	}
}

class Person{
	String name;
	int age;
	//public Person(String pname,int page){
	//	name = pname;
	//	age = page;
	// }
	// ������ǹ��������βο���ֱ��д�����������͸�����
	// ���ǳ�����һ�����⣬�����߱�����������ԭ��
	// ������name ��age �Ǿֲ�����������������
	// ===������this

	public Person(String name,int age){
		//this.name��this.age ���ǵ�ǰ���������name��age
		this.name = name;
		this.age = age;
		//age = age;     0
		//name = name;    null
		//ʹ��hashCode()���Կ��������
		System.out.println("this.hashCode = " + this.hashCode());
	}
	public void info(){
		System.out.println("p1.name" + name + " " + "p1.age" + age);
		System.out.println("this.hashCode = " + this.hashCode());
	}	
}