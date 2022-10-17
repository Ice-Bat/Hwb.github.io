
public class VarParameterExercise{
	public static void main(String[] args){

		Method m = new Method();
		System.out.println(m.showScore("黄花",60,90.5));
		System.out.println(m.showScore("黄六",65.5,78,87));
		System.out.println(m.showScore("黄霸",60,95,67.5,45,89));
	}
}

class Method{
	//有三个方法 分别实现返回姓名和两名课程成绩
	//返回姓名和三课程成绩 返回姓名和5课程成绩
	//
	//返回类型为String
	public String showScore(String name,double...scores){
		double sum = 0;
		for(int i = 0;i < scores.length;i++){
			sum += scores[i];
		}
		return name + "有" + scores.length + "门课的成绩为" + sum;
	}
}