
public class Recursion01{ 

	public static void main(String[] args) {

		T t = new T();
		t.test(4);
		T f = new T();
		int sum = f.factoria(7);
		System.out.print(sum);
	}
}

class T{

	public void test(int n){
		if(n > 2){
			test(n - 1);
		}
		System.out.println("n = "+ n);
	} 

	public int factoria(int n){
		if(n == 1){
			return 1;
		} else {
			return factoria(n-1) * n;
		}
	}
}