
import java.util.Scanner;
public class BubbleSore { 

	//��дһ��main����
	public static void main(String[] args) {

		int bubble[] = {1,2,3,4,5,6};
		int temp = 0;
		int count = 0;							//�����Ż�

		for(int j = 0;j < bubble.length-1;j++){	//����Ƚ��ܳ��ȡ�1��
			for(int i = 0;i < 4-j;i++){  //ÿ�αȽ�������һ�����Ѿ�����Ҫ�ڱȽϣ�������һ��
				if(bubble[i] > bubble[i+1]){	//���ǰһ�����ں�һ�������и���
					temp = bubble[i];
					bubble[i] = bubble[i+1];
					bubble[i+1] = temp;
					count++;						
				}				
			}
			if(count == 0){   				//count == 0;��ʾ����һ��û�н�����ֱ���˳�
				break;
			}
			
		}
		System.out.println(count);
		for(int k = 0;k < bubble.length;k++){
			System.out.println(bubble[k]);
		}

	}
}
