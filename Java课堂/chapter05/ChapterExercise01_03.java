//1.������100000Ԫ������һ·��
//>=50000,��%5��Ǯ
//<50000,��1000һ��
//�ۼƴ�������while-break
//2.ʵ���ж�һ�������������ĸ���Χ >0,<0,=0
//3.�ж�һ������Ƿ�Ϊ����
import java.util.Scanner;
public class ChapterExercise01_03 { 

	//��дһ��main����
    public static void main(String[] args){

    	double money = 100000;
    	int count = 0;
    	while (money > 1000){
    		while(money >= 50000){
    			money -=money*0.05;	
    			count++;
    		}
    		while(money >1000){
    			money -=1000;
    			count++;
    		}
    		break;
    	}
        System.out.println("count = " + count);

    Scanner myscanner = new Scanner(System.in);

    System.out.println("����������");
    int num = myscanner.nextInt();
    if(num > 0){
        System.out.println("������");
    } else if (num == 0){
        System.out.println("������");
    } else{
        System.out.println("С����");
    }

    int year = myscanner.nextInt();
    System.out.println("���������");
    if(year % 4 ==0 && year % 100 !=0 ||year % 400 == 0){
        System.out.println("����");
    }

    }

}


