import java.util.Scanner;

public class Starts { 

	//��дһ��main����
    public static void main(String[] args){

    	Scanner myscanner = new Scanner(System.in);
    	System.out.print("�����������������");
    	int totalLevel = myscanner.nextInt();

    	for(int i = 1;i <= totalLevel;i++){  //�������ܲ���
    		for(int j = 1;j <= totalLevel-i;j++){  //�ո��� Ϊ�ܲ������ò�
    			System.out.print(" ");
    		}
    		for(int k = 1;k <= 2*i-1;k++){       //* �ĸ��� Ϊ �ò�������-1
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
