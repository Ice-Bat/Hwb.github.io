/**
 * ���һ����������
 */

//����Ϊ��
//1.
//���һ������5 * 5
//*****
//*****
//*****
//*****
//*****
//�����
//   *     1  2*i-1  
//  ***    3  2*i-1
// *****   5  2*i-1
//  ***    3  2*(i-1)-1
//   *     1  2*(i-1)-1

// public class Rhombus { 

// 	//��дһ��main����
//     public static void main(String[] args){
//     	int temp = 1;
//     	for(int i = 1;i <= 5;i++){
//     		if(i <= 3){
//     			for(int j = 1;j <=(5/2+1)-i;j++){
//     				System.out.print(" ");
//     			}	
//     				for(int k = 1;k <= 2*i-1;k++){
//     					System.out.print("*");
//     				}
//     			} else {
//     				for(int m = 1;m <= i-(5/2+1);m++){
//     					System.out.print(" ");
//     				}
//     				for(int n = 1;n <= 2*(i-2*temp) -1;n++){
//     					System.out.print("*");
//     				}
//     				temp++;	
//     			}   			
//     		System.out.println();
//     	}

//     }
// }

//�����
//   *    0 
//  * *   1
// *   *  3
//  * *   1
//   *    0
//    public class Rhombus { 

// 	//��дһ��main����
//     public static void main(String[] args){
//     	int temp = 1;
//     	for(int i = 1;i <= 5;i++){
//     		if(i <= 3){
//     			for(int j = 1;j <=(5/2+1)-i;j++){
//     				System.out.print(" ");
//     			}	
//     				for(int k = 1;k <= 2*i-1;k++){
//     					if(k == 1 || k == 2*i-1){
//     						System.out.print("*");
//     					} else {
//     						System.out.print(" ");
//     					}
    					
//     				}
//     			} else {
//     				for(int m = 1;m <= i-(5/2+1);m++){
//     					System.out.print(" ");
//     				}
//     				for(int n = 1;n <= 2*(i-2*temp) -1;n++){
//     					if(n == 1 || n == 2*(i-2*temp) -1){
//     						System.out.print("*");
//     					} else {
//     						System.out.print(" ");
//     					} 
    					
//     				}
//     				temp++;	
//     			}   			
//     		System.out.println();
//     	}

//     }
// }

//����Ϊ��
//1.�� ���� ��Ϊ totalLevel

import java.util.Scanner;

   public class Rhombus { 

	//��дһ��main����
    public static void main(String[] args){
    	Scanner myscanner = new Scanner(System.in);
    	System.out.println("�������ܲ�����");
    	int totalLevel = myscanner.nextInt();  
    	int temp = 1;

    	for(int i = 1;i <= totalLevel;i++){                        //�ܲ�
    		if(i <= totalLevel/2+1){                               //�ϰ�� +1
    			for(int j = 1;j <=(totalLevel/2+1)-i;j++){         //�ò�����ո�ĸ���
    				System.out.print(" ");
    			}	
    				for(int k = 1;k <= 2*i-1;k++){                 //��ͷ��β���* ����������ո�
    					if(k == 1 || k == 2*i-1){
    						System.out.print("*");
    					} else {
    						System.out.print(" ");
    					}
    					
    				}
    			} else {                                          //�°��
    				for(int m = 1;m <= i-(totalLevel/2+1);m++){   //�ò�����ո�ĸ���
    					System.out.print(" ");
    				}
    				for(int n = 1;n <= 2*(i-2*temp) -1;n++){      
    					if(n == 1 || n == 2*(i-2*temp) -1){       //��ͷ��β���* ����������ո�
    						System.out.print("*");
    					} else {
    						System.out.print(" ");
    					} 
    					
    				}
    				temp++;	                                    //ȷ���°�����*������ȷ
    			}   			
    		System.out.println();                               //����
    	}

    }
}

//�ó���ֻ��ʵ����������