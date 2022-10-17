import java.util.Scanner;
public class Homework08{
	public static void main(String[] args){
		Music mus = new Music("我害怕",500);
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
		System.out.println(this.name + "音乐开始播放持续" + this.times);
	}
	public String getInfo(){
		return "音乐名"+ this.name+"时长"+this.times;
	}
}
