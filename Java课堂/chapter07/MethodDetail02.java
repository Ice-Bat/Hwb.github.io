public class MethodDetail02 { 

	//��дһ��main����
	public static void main(String[] args) {

		A a = new A();
		a.sayOk();
		a.m1();
	}
}

class A{

	//��ͬһ�����е��÷���ʱ��ֱ�ӵ��ü���
	public void print(int n){
		System.out.print("n = " + n);
	}

	public void sayOk(){
		print(10);
		System.out.print("����ִ��");
	}

	//������õķ�����A�����B����Ҫͨ������������
	public void m1(){
		B b = new B();
		b.d1();
	}
}

class B{
	public void d1(){
		System.out.println("test");
	}
}