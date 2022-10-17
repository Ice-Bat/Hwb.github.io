
public class Boolean01{
	public static void main (String[] args){
		boolean pass = true;  //false 不可用0或非0代替false和true
		if(pass = true){
			System.out.println("ok");
		} else {
			System.out.println("err");
		}
	}
}