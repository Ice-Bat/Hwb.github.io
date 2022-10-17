import java.util.Scanner;
public class BreakExercise { 

	//编写一个main方法
    public static void main(String[] args){
    	int sum = 0;
    	for(int i = 1;i <= 100;i++){
    		sum +=i;
    		if(sum >= 20){
    			System.out.println("i = " + i);
    			break;
    		}
    	} 
    Scanner myscanner = new Scanner(System.in);

    System.out.println("请输入用户名");
    int j = 3;
    String user = myscanner.next();

    //字符串比较 使用方法 equals()
    //"黄大头".equals(user); //[推荐] 可以避免空指针
    //user.equals("黄大头");
    if("黄大头".equals(user)){
       for(j = 3;j >= 1;j--){
           System.out.println("请输入密码"); 
           String password = myscanner.next();
            if("666".equals(password)){
                System.out.println("密码正确");
                break;
            } else {
                System.out.println("密码错误");
            }
        } 
    }   
        if(j == 0){
          System.out.println("输入次数失效");  
        }
	    
    }
}