
public class HanoiTower{
	public static void main(String[] args){

		Tower t = new Tower();
		t.move(5,'A','B','C');

	}
}

class Tower{
	//num 层数，a：a柱 b：b柱 c：c柱
	public int move(int num,char a,char b,char c){
		if(num == 1){
			System.out.println(a + "->" + c);
		} else {
			//如果有多个盘，可以把它看成两，最底下一个和上面num-1个
			//先移动上面的盘到b，借助c
			move(num -1,a,c,b);
			//把最下面的盘移动到c
			System.out.println(a + "->" + c);
			//在把下面的num-1个盘从b移动到c
			move(num -1,b,a,c);
		}
	}
}