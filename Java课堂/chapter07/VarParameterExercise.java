
public class VarParameterExercise{
	public static void main(String[] args){

		Method m = new Method();
		System.out.println(m.showScore("�ƻ�",60,90.5));
		System.out.println(m.showScore("����",65.5,78,87));
		System.out.println(m.showScore("�ư�",60,95,67.5,45,89));
	}
}

class Method{
	//���������� �ֱ�ʵ�ַ��������������γ̳ɼ�
	//�������������γ̳ɼ� ����������5�γ̳ɼ�
	//
	//��������ΪString
	public String showScore(String name,double...scores){
		double sum = 0;
		for(int i = 0;i < scores.length;i++){
			sum += scores[i];
		}
		return name + "��" + scores.length + "�ſεĳɼ�Ϊ" + sum;
	}
}