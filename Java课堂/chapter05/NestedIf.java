
import java.util.Scanner;  //��Ҫ�ֺ�

public class NestedIf{
	public static void main(String[] args){
		Scanner myscanner = new Scanner(System.in);
		System.out.println("��������ֵĳɼ���");
		double score = myscanner.nextDouble();

		System.out.println("��������ֵ��Ա�");
		char gender = myscanner.next().charAt(0);//��ͨ��myscanner���һ���ַ������ڻ�ȡ��0λ
		if(score > 8.0){
			System.out.println("ͨ��");
			if(gender == 'Ů'){
				System.out.println("ѡ�ֽ���Ů����");
			} else {
				System.out.println("ѡ�ֽ���������");
			}
			
		} else {
			System.out.println("��̭");
		}
		
	}
}