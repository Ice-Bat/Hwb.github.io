import java.util.Scanner;
public class Homework06{
	public static void main(String[] args){

		Cale a06 = new Cale(4,2);
		System.out.println("和为" + a06.add());
		System.out.println("差为" + a06.reduce());
		System.out.println("乘为" + a06.multiply());
		Double divRes = a06.divide();
		if(divRes !=null){
			System.out.println("除为" + a06.divide());
		}
		

	}
}
class Cale{
	double n1;
	double n2;

	public Cale(double n1,double n2){
		this.n1 = n1;
		this.n2 = n2;
	}

	public double add(){
		return n1 + n2;
	}
	public double reduce(){
		return n1 - n2;
	}
	public double multiply(){
		return n1 * n2;
	}
	public Double divide(){   //返回一个double包装类
		if(n2 == 0){
			System.out.print("分母不能为0");
			return null;
		}else{
			return n1 / n2;
		}
		
	}	
}