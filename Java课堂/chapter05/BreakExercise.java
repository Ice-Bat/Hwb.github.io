import java.util.Scanner;
public class BreakExercise { 

	//��дһ��main����
    public static void main(String[] args){
    	int sum = 0;
    	for(int i = 1;i <= 100;i++){
    		sum +=i;
    		if(sum >= 20){
    			System.out.println("i = " + i);
    			break;
    		}
    	} 
    Scanner myscanner = new Scanner(System.in);

    System.out.println("�������û���");
    int j = 3;
    String user = myscanner.next();

    //�ַ����Ƚ� ʹ�÷��� equals()
    //"�ƴ�ͷ".equals(user); //[�Ƽ�] ���Ա����ָ��
    //user.equals("�ƴ�ͷ");
    if("�ƴ�ͷ".equals(user)){
       for(j = 3;j >= 1;j--){
           System.out.println("����������"); 
           String password = myscanner.next();
            if("666".equals(password)){
                System.out.println("������ȷ");
                break;
            } else {
                System.out.println("�������");
            }
        } 
    }   
        if(j == 0){
          System.out.println("�������ʧЧ");  
        }
	    
    }
}