
public class BreakExercise { 

	//编写一个main方法
    public static void main(String[] args){

    	label1:
    	for(int i = 1;i <= 10 ;i++){
    		label2:
    		for(int j = 1;j <= 10;j++){
    			if(j==2){
    				continue;  //等价于 continue label2
    			}
    			System.out.println("j = " + j);
    		}
    	}
    }
}