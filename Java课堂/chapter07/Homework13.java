import java.util.Scanner;
import java.util.Random;

public class Homework13{
	public static void main(String[] args){

		Scanner myscanner = new Scanner(System.in);
		System.out.println("��������Ҫ����Զ�ս�Ĵ���");
		int times = myscanner.nextInt();
		Tom t = new Tom(times);          //���ù���������times����

		for(int i = 1;i <= times;i++){
			System.out.println("���������" + i + "��Ҫ�µ�ȭ(ʯͷ-0,����-1,��-2)");
			int game = myscanner.nextInt();   //gameΪ�ҳ���ȭ
			int res = t.random();			  //����random�����������0-2
			t.judg(game,res);				  //ͨ������t���÷���judg�ж���Ӯ	
		}
		System.out.println("��Ӯ�˵Ĵ���" + t.winCount);  //�����ʤ����
	}
}
class Tom{
	int times;
	int winCount;
	//������
	public Tom(int times){
		this.times = times;
	}
	//�������0-2�ķ���
	public int random(){  //�������0-2����
		Random r = new Random();                                                                                                                                                                                                
        return r.nextInt(3); // ���� ���� 0-2�������
        //System.out.println((int)Math.random()*10%3);   һֱΪ0
        //return (int)Math.random()*10%3;
	}
	//�ж���Ӯ	
	public void judg(int game,int res){  
		System.out.println("======================================");
		System.out.println("��ҳ�ȭ\t���Գ�ȭ\t�Ծֽ��");
		System.out.print(game + "\t\t" + res+"\t\t");
		if(game == 0 && res == 1){
			this.winCount++;		
			System.out.println("��Ӯ��");
		} else if(game == 1 && res == 2){
			this.winCount++;
			System.out.println("��Ӯ��");
		} else if(game == 2 && res == 0){
			this.winCount++;
			System.out.println("��Ӯ��");
		} else if(game == res){
			System.out.println("ƽ��");
		} else{
			System.out.println("������");
		}
		System.out.println("======================================");	
	}
}
