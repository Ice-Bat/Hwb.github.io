
public class MethodExercise02{ 

	public static void main(String[] args) {

		//��дһ������copyPreson�����Ը���һ��Person���󣬷��ظ��ƵĶ���
		//ע��Ҫ��õ����¶����ԭ���Ķ��������������Ķ���ֻ��������ͬ
		
		Mytool arr = new Mytool();
		int res[] = arr.map(12,2);
		System.out.println("��=" + res[0]);
		System.out.println("��=" + res[1]);	

		
		Person p = new Person();
		p.age = 10;
		Mytool tool = new Mytool();		
		Person p2 = tool.copyPerson(p);
		//����������ͬ�����Ƕ���
		System.out.print(p == p2); //FALSE
	}
}

class Person {
	int age;
}

class Mytool{

	public int[] map(int n1,int n2){
		int arr[] = new int[2];
		arr[0] = n1 + n2;
		arr[1] = n1 - n2;
		return arr;
	}
	//��дһ������copyPreson�����Ը���һ��Person���󣬷��ظ��ƵĶ���
	//ע��Ҫ��õ����¶����ԭ���Ķ��������������Ķ���ֻ��������ͬ
	//1.�������� Person
	//2.������ copyPerson
	//3.�����б� (Person p)
	//4.������ ����һ�����󣬲��������ԣ����ؼ���
	public Person copyPerson(Person p){
		Person p2 = new Person();
		p2.age = p.age;
		return p2;
	}
}

