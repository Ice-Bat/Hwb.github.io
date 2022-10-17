import java.util.Scanner;
import java.util.Random;

public class Homework13{
	public static void main(String[] args){

		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入你要与电脑对战的次数");
		int times = myscanner.nextInt();
		Tom t = new Tom(times);          //调用构造器，将times传入

		for(int i = 1;i <= times;i++){
			System.out.println("请输入你第" + i + "轮要猜的拳(石头-0,剪刀-1,布-2)");
			int game = myscanner.nextInt();   //game为我出的拳
			int res = t.random();			  //调用random方法随机生成0-2
			t.judg(game,res);				  //通过对象t调用方法judg判断输赢	
		}
		System.out.println("你赢了的次数" + t.winCount);  //输出获胜次数
	}
}
class Tom{
	int times;
	int winCount;
	//构造器
	public Tom(int times){
		this.times = times;
	}
	//随机生成0-2的方法
	public int random(){  //随机生成0-2的数
		Random r = new Random();                                                                                                                                                                                                
        return r.nextInt(3); // 方法 返回 0-2的随机数
        //System.out.println((int)Math.random()*10%3);   一直为0
        //return (int)Math.random()*10%3;
	}
	//判断输赢	
	public void judg(int game,int res){  
		System.out.println("======================================");
		System.out.println("玩家出拳\t电脑出拳\t对局结局");
		System.out.print(game + "\t\t" + res+"\t\t");
		if(game == 0 && res == 1){
			this.winCount++;		
			System.out.println("你赢了");
		} else if(game == 1 && res == 2){
			this.winCount++;
			System.out.println("你赢了");
		} else if(game == 2 && res == 0){
			this.winCount++;
			System.out.println("你赢了");
		} else if(game == res){
			System.out.println("平局");
		} else{
			System.out.println("你输了");
		}
		System.out.println("======================================");	
	}
}
