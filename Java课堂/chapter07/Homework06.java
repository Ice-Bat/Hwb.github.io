import java.util.Scanner;
public class Homework06{
	public static void main(String[] args){

		Cale a06 = new Cale(4,2);
		System.out.println("��Ϊ" + a06.add());
		System.out.println("��Ϊ" + a06.reduce());
		System.out.println("��Ϊ" + a06.multiply());
		Double divRes = a06.divide();
		if(divRes !=null){
			System.out.println("��Ϊ" + a06.divide());
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
	public Double divide(){   //����һ��double��װ��
		if(n2 == 0){
			System.out.print("��ĸ����Ϊ0");
			return null;
		}else{
			return n1 / n2;
		}
		
	}	
}