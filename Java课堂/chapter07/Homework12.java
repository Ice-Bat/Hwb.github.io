import java.util.Scanner;
public class Homework12{
	public static void main(String[] args){
		Circle c = new Circle(5);
		PassAreas p = new PassAreas();
		p.printAreas(c,5);
		System.out.println("c.findArea = " + c.findArea());
		System.out.println("c.radius = " + c.radius);
	}
}
class Circle{
	double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	public double findArea(){
		double s = Math.PI*radius*radius;  //Π为Math.PI
		return s;
	}
	//设置方法更改半径
	public void setRadius(double radius){
		this.radius = radius;
	}
}
class PassAreas{
	public void printAreas(Circle c,int times){
		System.out.println("Radius\tAreas");
		for(int i = 1;i <= times;i++){
			//double s = Math.PI*i*i;
			c.setRadius(i);
			System.out.println((double)i + "\t" + c.findArea());
		}
	}
}