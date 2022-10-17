import java.util.Scanner;
public class Homework07{
	int count = 9;
	public void count1(){
		count = 10;
		System.out.println("count1 = " + count);
	}
	public void count2(){
		System.out.println("count2 = " + count++); //后++，先显示
	}	
	//任何一个类都可以有main
	public static void main(String[] args){
		//1.new Test() 是匿名对象，匿名对象使用后，就不能在使用
		//2.new Test().count1() 创建匿名对象后，就调用count1
		new Homework07().count1();

		Homework07 t = new Homework07();
		t.count2();
		t.count2();
	}
}