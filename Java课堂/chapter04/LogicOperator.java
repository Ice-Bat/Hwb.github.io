//演示逻辑运算符使用

public class LogicOperator{

	public static void main(String[] args){
		//短路与：&& 和逻辑与：&
		
		int age = 50;
		//短路与：&&
		if(age > 20 && age<90){
			System.out.println("ok1");
		}
		//逻辑与：&
		if(age > 20 & age<90){
			System.out.println("ok2");
		}

		//区别
		int a = 2;
		int b = 9;
		//对于短路与而言，如果第一个判断为false，后面的条件不在判断
		if(a < 1 && ++b > 90){
			System.out.println("ok3");
		}
		System.out.println("a = " + a + "b = " + b);//2,9

		//对于逻辑与而言，如果第一个判断为false，后面的条件仍然判断
		if(a < 1 & ++b > 90){
			System.out.println("ok3");
		}
		System.out.println("a = " + a + "b = " + b);//2,10

		//短路或：|| 和逻辑或：|
		

		int day = 50;
		//短路或：||
		if(day > 20 || day<90){
			System.out.println("ok1");
		}
		//逻辑或：|
		if(day > 20 | day<90){
			System.out.println("ok2");
		}

		//区别
		int c = 2;
		int d = 9;
		//对于短路或而言，如果第一个判断为true，后面的条件不在判断
		if(c < 1 && ++d > 90){
			System.out.println("ok3");
		}
		System.out.println("c = " + c + "d = " + d);//2,9

		//对于逻辑或而言，如果第一个判断为true，后面的条件仍然判断
		if(c < 1 & ++d > 90){
			System.out.println("ok3");
		}
		System.out.println("c = " + c + "d = " + d);//2,10

	}
}