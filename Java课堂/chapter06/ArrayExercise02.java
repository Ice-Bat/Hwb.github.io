
public class ArrayExercise02 { 

	//编写一个main方法
	public static void main(String[] args) {

		int num[] = {4,-1,9,10,23};
		int i = 0;
		int max = num[0];
		int maxIndex = 0;
		for(i = 0;i <num.length;i++){
			if(num[i] >= max){
				max = num[i];
				maxIndex = i;
			}
		}
		System.out.print(max + " " +maxIndex);
	}
}