import java.util.Scanner;
public class Array02 { 

	//��дһ��main����
	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		//��һ�ֶ�̬���䷽ʽ
		//
		double score[] = new double [5];
		//�ڶ��ֶ�̬���䷽ʽ
		//
		//double score[]; 									//������������δ����ռ�
		//score = new double[5];							//�������ڴ�
		for(int i = 0;i < score.length;i++){
			System.out.println("�������"+ (i+1) +"���ɼ�");
			score[i] = myscanner.nextDouble();
		}

		//�������������
		for(int j = 0;j < score.length;j++){
			System.out.println(score[j]);
		}
	}
}