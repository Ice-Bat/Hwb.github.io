import java.util.Scanner;
public class Homework07{
	int count = 9;
	public void count1(){
		count = 10;
		System.out.println("count1 = " + count);
	}
	public void count2(){
		System.out.println("count2 = " + count++); //��++������ʾ
	}	
	//�κ�һ���඼������main
	public static void main(String[] args){
		//1.new Test() ������������������ʹ�ú󣬾Ͳ�����ʹ��
		//2.new Test().count1() ������������󣬾͵���count1
		new Homework07().count1();

		Homework07 t = new Homework07();
		t.count2();
		t.count2();
	}
}