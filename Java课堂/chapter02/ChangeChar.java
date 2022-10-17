//显示转义字符的使用
public class ChangeChar{
	public static void main (String[] args){
        //      \t :一个制表位，实现对齐的功能
		System.out.println ("黄\t 伟\t 彬");
		//      \n :换行符
		System.out.println ("是\t 帅\t 哥");
		//      \\ :一个\
		System.out.println ("6\\3\\\\0");
		//      \" :一个"
		System.out.println ("\"我爱你\"");
		//      \' :一个' 
		System.out.println ("\'每天打卡学Java\'");
		//      \r :一个回车 
		//      解读：先输出 ‘我真的是我’，在将‘爱你’前提覆盖‘我真’
		System.out.println ("我真的是我\r爱你\r");
		//作业练习
		System.out.println ("书名\t作者\t价格\t销量\t\n三国\t罗贯中\t120\t1000\t");
	}
}

