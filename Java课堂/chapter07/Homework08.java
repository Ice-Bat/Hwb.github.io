import java.util.Scanner;
public class Homework08{
	public static void main(String[] args){
		Music mus = new Music("�Һ���",500);
		mus.play();
		String res = mus.getInfo();
		System.out.println(res);
	}
}
class Music{
	String name;
	int times;

	public Music(String name,int times){
		this.name = name;
		this.times = times;
	}
	public void play(){
		System.out.println(this.name + "���ֿ�ʼ���ų���" + this.times);
	}
	public String getInfo(){
		return "������"+ this.name+"ʱ��"+this.times;
	}
}
