//1.使用char类型，分别保存\n \t \r \\ 1 2 3等字符，并打应输出
//2.保存书名，性别，书价格，用'+'拼接
//3.实现 姓名 年龄 成绩 性别 爱好
//       xx   xx   xx  xx   xx
public class Homework{

	public static void main (String[] args){
		char c1 = '\n';//换行
		char c2 = '\t';//制表位
		char c3 = '\r';//回车
		char c4 = '\\';//输出\
		char c5 = '1';
		char c6 = '2';
		char c7 = '3';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);

		System.out.println("红楼梦 + 三国演义\t" + "男 + 女\t" + "25 + 23");
		String s1 = "红楼梦";
		String s2 = "三国演义";
		char n1 = '男';
		char n2 = '女';
		double price1 = 12.3;
		double price2 = 23.89;
		System.out.println(s1 + s2);//红楼梦三国演义
		System.out.println(n1 + n2);//52906
		System.out.println(price1 + price2);//36.19

		System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n" + "黄哈\t18\t99\t男\t吃屎");

	}
}


