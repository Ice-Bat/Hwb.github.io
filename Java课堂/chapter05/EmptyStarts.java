import java.util.Scanner;

public class EmptyStarts { 

	//编写一个main方法
    public static void main(String[] args){

    	Scanner myscanner = new Scanner(System.in);
    	System.out.print("请输入金字塔层数：");
    	int totalLevel = myscanner.nextInt();

    	// for(int i = 1;i <totalLevel;i++){           //金字塔总层数
    	// 	for(int j = 1;j <= totalLevel-i;j++){      //空格数 为总层数—该层
    	// 		System.out.print(" ");
    	// 	}
     //        if(totalLevel >=0 && totalLevel <= 2){
     //            for(int k = 1;k <= 2*i-1;k++){       //* 的个数 为 该层两倍数-1
     //                System.out.print("*");
     //            }
     //        } else {
     //            for(int m = 1;m <= 2*i-1;m++){       //输出个数* 和空格总数
     //                System.out.print("*");

     //                for(int n = 1;n <= 2*(i-1)-1;n++){
     //                    System.out.print(" ");
     //                    m++;                         //以空格数代替*
     //                }
     //            }
                    
     //        }

    	// 	System.out.println();
    	// }
     //    for(int t = 1;t <=2*totalLevel-1;t++){       //最后一行输出*
     //        System.out.print("*");
            for(int i = 1;i <= totalLevel;i++){         //表示层数
              for(int k = 1;k <= totalLevel-i;k++){   //开头输出空格
                 System.out.print(" ");
              }
              for(int j = 1;j <=2*i-1;j++){           //输出*的范围
                  if(j == 1 || j == 2*i-1 || i == totalLevel){  //在头和尾和最后一行输出*
                      System.out.print("*");
                  }else{
                      System.out.print(" ");          //其余输出空格
                  }
                  
              }  
              System.out.println();  
          }
        }
    }
        /**
         * 代码优化
         * for(int i = 1;i <= totalLevel;i++){         //表示层数
         *     for(int k = 1;k <= totalLevel-1;k++){   //开头输出空格
         *         System.out.print(" ");
         *     }
         *     for(int j = 1;j <=2*i-1;j++){           //输出*的范围
         *         if(j == 1 || j == 2*i-1 || i == totalLevel){  //在头和尾和最后一行输出*
         *             System.out.print("*");
         *         }else{
         *             System.out.print(" ");          //其余输出空格
         *         }
         *         
         *     } 
         *        System.out.println(); 
         * }  
         */
        