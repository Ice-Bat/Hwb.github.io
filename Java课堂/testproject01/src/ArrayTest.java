import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        MyTools m = new MyTools();
        int arr[] = {-1, 4, 90, 2, 76, 49, 0};
        m.bubble(arr);
        System.out.println("====排序后====");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}

//在idea中 当我们run一个文件时，会先编译陈一个.class，然后运行
class MyTools {
    public void bubble(int[] arr) {
        //冒泡排序
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

