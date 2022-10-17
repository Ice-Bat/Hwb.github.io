
public class MulForExercise01 { 

	//编写一个main方法

		
    public static void main(String[] args){

    	for(int n1 = 1;n1 <= 9;n1++){
    		for(int n2 = 1;n2 <=n1;n2++){
    			System.out.print(n1 + "*" + n2 + "=" +n1*n1 +'\t');   //print
    		}
    		System.out.println();//换行
    	}
    }
}