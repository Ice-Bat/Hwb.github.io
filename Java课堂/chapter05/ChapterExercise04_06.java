//4.�ж�һ�����Ǹ���Ϊˮ�ɻ���
//6.���1-100֮�䲻�ܱ�5����������û5��һ��
import java.util.Scanner;
public class ChapterExercise04_06 { 

	//��дһ��main����
    public static void main(String[] args){

    	Scanner myscanner = new Scanner(System.in);

    	System.out.println("������һ����λ������");
    	int num1 = myscanner.nextInt();
        int num2 = 0;
        int num3 = num1;  //���num1��ֵ�������Ա�
    	int sum = 0;
        int temp = 0;

    	for(int i = 1;i <= 3;i++){
    		num2 = num1 % 10;
    		num1 /= 10;
            temp = num2;
    		for(int j = 1;j <= 2;j++){
                
    			num2 = num2*temp;                			
    		}
            sum += num2;
            if(sum == num3){
                System.out.println("������ˮ�ɻ��� sum = " + sum);
            }

    	}	
//6.
        int count = 0;
        for(int k = 1;k <= 100;k++){
            if(k % 5 != 0){
                System.out.print("k = " + k);
                count++;                
            }
            if(count == 5){
                System.out.println();
                count = 0; 
            }
            
        }
    }

}

//5.
class Demo{
    public static void main (String[] args){

        int m = 0,n = 3;
        if(m > 0){
            if(n > 2)
                System.out.println("ok1");
            else
                System.out.println("ok2");
        }
    }
}

