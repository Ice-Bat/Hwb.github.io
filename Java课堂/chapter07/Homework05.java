import java.util.Scanner;
public class Homework05{
	public static void main(String[] args){

		Circle a05 = new Circle();
		a05.showPerimeter(5);
		a05.showArea(6);
	}
}
class Circle{
	int radius;
	public void showPerimeter(int r){
		double l = 2*Math.PI*r;
		System.out.print("�ܳ�Ϊ"+l);
	}
	public void showArea(int r){
		double s = Math.PI*r*r;  //��ΪMath.PI
		System.out.print("���Ϊ"+s);
	}
}