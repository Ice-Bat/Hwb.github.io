import java.util.Scanner;

public class Switch01{
	public static void main(String[] args){

		System.out.println("请输入字符a-g：");
		Scanner myscanner = new Scanner (System.in);
		char character = myscanner.next().charAt(0);
		switch(character){
			case 'a':System.out.println("星期一");break; 
			case 'b':System.out.println("星期二");break;
			case 'c':System.out.println("星期三");break;
			case 'd':System.out.println("星期四");break;
			case 'e':System.out.println("星期五");break;
			case 'f':System.out.println("星期六");break;
			case 'g':System.out.println("星期七");break;
			default :System.out.println("不在范围内");break;
		}

	}
}