import java.util.Scanner;

public class EmptyStarts { 

	//��дһ��main����
    public static void main(String[] args){

    	Scanner myscanner = new Scanner(System.in);
    	System.out.print("�����������������");
    	int totalLevel = myscanner.nextInt();

    	// for(int i = 1;i <totalLevel;i++){           //�������ܲ���
    	// 	for(int j = 1;j <= totalLevel-i;j++){      //�ո��� Ϊ�ܲ������ò�
    	// 		System.out.print(" ");
    	// 	}
     //        if(totalLevel >=0 && totalLevel <= 2){
     //            for(int k = 1;k <= 2*i-1;k++){       //* �ĸ��� Ϊ �ò�������-1
     //                System.out.print("*");
     //            }
     //        } else {
     //            for(int m = 1;m <= 2*i-1;m++){       //�������* �Ϳո�����
     //                System.out.print("*");

     //                for(int n = 1;n <= 2*(i-1)-1;n++){
     //                    System.out.print(" ");
     //                    m++;                         //�Կո�������*
     //                }
     //            }
                    
     //        }

    	// 	System.out.println();
    	// }
     //    for(int t = 1;t <=2*totalLevel-1;t++){       //���һ�����*
     //        System.out.print("*");
            for(int i = 1;i <= totalLevel;i++){         //��ʾ����
              for(int k = 1;k <= totalLevel-i;k++){   //��ͷ����ո�
                 System.out.print(" ");
              }
              for(int j = 1;j <=2*i-1;j++){           //���*�ķ�Χ
                  if(j == 1 || j == 2*i-1 || i == totalLevel){  //��ͷ��β�����һ�����*
                      System.out.print("*");
                  }else{
                      System.out.print(" ");          //��������ո�
                  }
                  
              }  
              System.out.println();  
          }
        }
    }
        /**
         * �����Ż�
         * for(int i = 1;i <= totalLevel;i++){         //��ʾ����
         *     for(int k = 1;k <= totalLevel-1;k++){   //��ͷ����ո�
         *         System.out.print(" ");
         *     }
         *     for(int j = 1;j <=2*i-1;j++){           //���*�ķ�Χ
         *         if(j == 1 || j == 2*i-1 || i == totalLevel){  //��ͷ��β�����һ�����*
         *             System.out.print("*");
         *         }else{
         *             System.out.print(" ");          //��������ո�
         *         }
         *         
         *     } 
         *        System.out.println(); 
         * }  
         */
        