/**
 * 输出一个空心菱形
 */

//化繁为简：
//1.
//输出一个矩形5 * 5
//*****
//*****
//*****
//*****
//*****
//在输出
//   *     1  2*i-1  
//  ***    3  2*i-1
// *****   5  2*i-1
//  ***    3  2*(i-1)-1
//   *     1  2*(i-1)-1

// public class Rhombus { 

// 	//编写一个main方法
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

//在输出
//   *    0 
//  * *   1
// *   *  3
//  * *   1
//   *    0
//    public class Rhombus { 

// 	//编写一个main方法
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

//化繁为简
//1.将 层数 变为 totalLevel

import java.util.Scanner;

   public class Rhombus { 

	//编写一个main方法
    public static void main(String[] args){
    	Scanner myscanner = new Scanner(System.in);
    	System.out.println("请输入总层数：");
    	int totalLevel = myscanner.nextInt();  
    	int temp = 1;

    	for(int i = 1;i <= totalLevel;i++){                        //总层
    		if(i <= totalLevel/2+1){                               //上半层 +1
    			for(int j = 1;j <=(totalLevel/2+1)-i;j++){         //该层输出空格的个数
    				System.out.print(" ");
    			}	
    				for(int k = 1;k <= 2*i-1;k++){                 //在头和尾输出* ，其余输出空格
    					if(k == 1 || k == 2*i-1){
    						System.out.print("*");
    					} else {
    						System.out.print(" ");
    					}
    					
    				}
    			} else {                                          //下半层
    				for(int m = 1;m <= i-(totalLevel/2+1);m++){   //该层输出空格的个数
    					System.out.print(" ");
    				}
    				for(int n = 1;n <= 2*(i-2*temp) -1;n++){      
    					if(n == 1 || n == 2*(i-2*temp) -1){       //在头和尾输出* ，其余输出空格
    						System.out.print("*");
    					} else {
    						System.out.print(" ");
    					} 
    					
    				}
    				temp++;	                                    //确保下半层输出*个数正确
    			}   			
    		System.out.println();                               //换行
    	}

    }
}

//该程序只能实现奇数菱形