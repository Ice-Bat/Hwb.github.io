
import java.util.Scanner;  //需要分号

public class NestedIf{
	public static void main(String[] args){
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入歌手的成绩：");
		double score = myscanner.nextDouble();

		System.out.println("请输入歌手的性别：");
		char gender = myscanner.next().charAt(0);//先通过myscanner获得一个字符串，在获取第0位
		if(score > 8.0){
			System.out.println("通过");
			if(gender == '女'){
				System.out.println("选手进入女子组");
			} else {
				System.out.println("选手进入男子组");
			}
			
		} else {
			System.out.println("淘汰");
		}
		
	}
}