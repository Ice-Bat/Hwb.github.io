import java.util.Scanner;
public class Homework03{
	public static void main(String[] args){
		System.out.println("������ñ���ļ۸�");
		Scanner myscanner = new Scanner(System.in);
		double price = myscanner.nextDouble();

		book p = new book(price);
		double res = p.updatePrice();
		System.out.print("���ĺ�ļ۸�" + res);
	}
}
class book{
	double price;
	public book(double price){
		this.price = price;
	}
	public double updatePrice(){
		if(this.price > 150){
			this.price = 150;
		} else if(this.price >100){
			this.price = 100;
		}
		return price;
	}
}