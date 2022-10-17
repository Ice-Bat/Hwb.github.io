import java.util.Scanner;
/**
 * 统计3各班的情况，每个班有5明学生，求个各班的平均成绩和3个班的平均成绩
 * 统计三个班的及格人数
 */


public class MulForExercise { 

	//编写一个main方法
	public static void main(String[] args) {

		int classroom = 0;
		int student = 0;
		int count = 0;
		double average1 = 0;
		double average2 = 0;
		double sum1 = 0;
		double sum2 = 0;
		Scanner myscanner = new Scanner(System.in);
		

		for(classroom = 0;classroom <3 ;classroom++){  //三个班级
			System.out.println("请输入" + (classroom + 1) + "班5位学生的成绩");		
			for(student = 0;student <5 ;student++){  //五名学生
				double score = myscanner.nextDouble();  //输入5次成绩
				if(score >= 60){  
					count++;  //统计及格数
				}
				sum1 += score;	//改班级总分
			}
			average1 = sum1 / 5;  //该班级平均分
			System.out.println("第" + (classroom + 1) + "班级的平均分为 = " + average1); 			
			sum2 +=average1;  //三个班级平均分总和
			sum1 = 0;  //该班级结束，下一个班级
		}
		average2 = sum2 / 3;  //三个班级平均分
		System.out.println("三个班级的平均分为 = " + average2);
		System.out.println("三个班级及格人数 = " + count);
	}


	}
