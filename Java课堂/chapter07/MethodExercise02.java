
public class MethodExercise02{ 

	public static void main(String[] args) {

		//编写一个方法copyPreson，可以复制一个Person对象，返回复制的对象
		//注意要求得到的新对象和原来的对象是两个独立的对象，只是属性相同
		
		Mytool arr = new Mytool();
		int res[] = arr.map(12,2);
		System.out.println("和=" + res[0]);
		System.out.println("差=" + res[1]);	

		
		Person p = new Person();
		p.age = 10;
		Mytool tool = new Mytool();		
		Person p2 = tool.copyPerson(p);
		//两个属性相同，但是独立
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
	//编写一个方法copyPreson，可以复制一个Person对象，返回复制的对象
	//注意要求得到的新对象和原来的对象是两个独立的对象，只是属性相同
	//1.返回类型 Person
	//2.方法名 copyPerson
	//3.参数列表 (Person p)
	//4.方法体 创建一个对象，并复制属性，返回即可
	public Person copyPerson(Person p){
		Person p2 = new Person();
		p2.age = p.age;
		return p2;
	}
}

