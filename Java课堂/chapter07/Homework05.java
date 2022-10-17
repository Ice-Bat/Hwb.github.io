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
		System.out.print("周长为"+l);
	}
	public void showArea(int r){
		double s = Math.PI*r*r;  //Π为Math.PI
		System.out.print("面积为"+s);
	}
}