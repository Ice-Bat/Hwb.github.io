
public class ArithmeticOperatorExercise{

	public static void main(String[] args){

		//1.规则使用临时变量temp ：(1)temp = i;(2)i = i + 1;(3)i = temp;
		int i = 1;
		i = i++;
		System.out.println("i = " + i );  //1
		//2.规则使用临时变量temp ：(1)j = j + 1;(2)temp = j;(3)j = temp;
		int j = 1;
		j = ++j;
		System.out.println("j = " + j );  //2

		//3. 还有59天放假，合几个星期零几天
		int day1 = 59;
		int data = day1 / 7;
		int day2 = day1 % 7;
		System.out.println("星期 = " + data + "\t" + "天 = " + day2 );

		//4.定义一个变量保存华氏温度，华氏转摄氏：5/9*(华氏温度-100)，求摄氏温度
		double Fahrenheit = 233.6;
		double Celsius = 5.0 / 9 * (Fahrenheit - 100); //5.0
		System.out.println("Celsius = " + Celsius);
	}
}