import java.util.Scanner;
public class SeqSearch { 

	//��дһ��main����
	public static void main(String[] args) {
		String name[] = {"��üӥ��","��ëʨ��","��������","��������"};
		System.out.println("����������");
		Scanner myscanner = new Scanner(System.in);
		String str = myscanner.next();
		int i = 0;

		for(i = 0;i < name.length;i++){
			if(name[i].equals(str)){
				System.out.println(i);
				break;
			} 
		}
		if(i == name.length){
			System.out.println("δ�ҵ���Ӧ����");	
		}
		
	}	
}