
public class MethodParameter02{ 


	public static void main(String[] args) {

		B b = new B();
		// int arr[] = {1,1,1};
		// b.test(arr);
		// System.out.println("test");
		// for(int i = 0;i < arr.length;i++){
		// 	System.out.print(arr[i] + " ");
		// }

		Person p = new Person();
		p.age = 10;
		b.test1(p);
		//测试，test1 中将p = null，下面结果是10
		////测试，test1 中将		p = new Person();p.age = 29;，下面结果是10
		System.out.print(p.age);
	}
}

class Person{
	int age;
}

class B{
	public void test(int arr[]){
		arr[0] = 200;
		System.out.println("test");
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}

	public void test1(Person p){
		// p.age = 100;
		// System.out.print(p.age);
		// 思考
		p = null;
		//思考
		p = new Person();
		p.age = 29;
	}
}
