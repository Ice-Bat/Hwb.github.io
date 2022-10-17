import java.util.Scanner;
public class Array02 { 

	//编写一个main方法
	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		//第一种动态分配方式
		//
		double score[] = new double [5];
		//第二种动态分配方式
		//
		//double score[]; 									//数组声明，还未分配空间
		//score = new double[5];							//分配了内存
		for(int i = 0;i < score.length;i++){
			System.out.println("请输入第"+ (i+1) +"个成绩");
			score[i] = myscanner.nextDouble();
		}

		//输出。遍历数组
		for(int j = 0;j < score.length;j++){
			System.out.println(score[j]);
		}
	}
}