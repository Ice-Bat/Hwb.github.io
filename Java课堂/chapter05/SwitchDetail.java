
public class SwitchDetail{
	public static void main(String[] args){

		//ϸ��1.���ʽ��������Ӧ��case������������һ��
		//���߿����Զ�ת���ɿ����໥�Ƚϵ����ͱ���������ַ�����������int
		//
		//ϸ��2.switch�����ʽ���б��ʽ�ķ���ֵ�����ǣ�
		//��byte,shaot,int,char,enum,String��
		//
		//ϸ��3.case�Ӿ��е�ֵ�����ǳ����������ʽ���������Ǳ���
		//
		//ϸ��4.default�Ӿ��ѡ��Ҳ�ɲ�ѡ
		//
		//ϸ��5.break�������ִ����һ��case��֧�������������switch���
		//���û��break�������ִ�е�switch��β,��������break��
		//
		char c1 = 'a';
		switch(c1){
			case 'a':
				System.out.println("ok1");
				//break;
			case 20 :
				System.out.println("ok2");
				break;
			case 2 :
				System.out.println("ok3");		
				break;
		}
	}
}