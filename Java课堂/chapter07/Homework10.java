import java.util.Scanner;
public class Homework10{
	public static void main(String[] args){
		Test t = new Test();
		t.a();
	}
		
}
class Test{
	public void a(){
		System.out.println(method(method(10.0,20.0),100));
	}
	public  double method(double num1,double num2){
		return num1 > num2 ? num1:num2;
	}
}