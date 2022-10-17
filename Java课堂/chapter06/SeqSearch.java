import java.util.Scanner;
public class SeqSearch { 

	//编写一个main方法
	public static void main(String[] args) {
		String name[] = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
		System.out.println("请输入人名");
		Scanner myscanner = new Scanner(System.in);
		String str = myscanner.next();
		int i = 0;

		for(i = 0;i < name.length;i++){
			if(name[i].equals(str)){
				System.out.println(i);
				break;
			} 
		}
		if(i == name.length){
			System.out.println("未找到对应人名");	
		}
		
	}	
}