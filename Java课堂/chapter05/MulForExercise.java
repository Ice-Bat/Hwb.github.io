import java.util.Scanner;
/**
 * ͳ��3����������ÿ������5��ѧ������������ƽ���ɼ���3�����ƽ���ɼ�
 * ͳ��������ļ�������
 */


public class MulForExercise { 

	//��дһ��main����
	public static void main(String[] args) {

		int classroom = 0;
		int student = 0;
		int count = 0;
		double average1 = 0;
		double average2 = 0;
		double sum1 = 0;
		double sum2 = 0;
		Scanner myscanner = new Scanner(System.in);
		

		for(classroom = 0;classroom <3 ;classroom++){  //�����༶
			System.out.println("������" + (classroom + 1) + "��5λѧ���ĳɼ�");		
			for(student = 0;student <5 ;student++){  //����ѧ��
				double score = myscanner.nextDouble();  //����5�γɼ�
				if(score >= 60){  
					count++;  //ͳ�Ƽ�����
				}
				sum1 += score;	//�İ༶�ܷ�
			}
			average1 = sum1 / 5;  //�ð༶ƽ����
			System.out.println("��" + (classroom + 1) + "�༶��ƽ����Ϊ = " + average1); 			
			sum2 +=average1;  //�����༶ƽ�����ܺ�
			sum1 = 0;  //�ð༶��������һ���༶
		}
		average2 = sum2 / 3;  //�����༶ƽ����
		System.out.println("�����༶��ƽ����Ϊ = " + average2);
		System.out.println("�����༶�������� = " + count);
	}


	}
