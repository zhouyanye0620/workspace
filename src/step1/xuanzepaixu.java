package step1;

import java.util.Arrays;
import java.util.Scanner;

public class xuanzepaixu {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //动态创建数组
        int[] arr = new int[sc.nextInt()];
        for(int i = 0 ; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        /********** Begin **********/
        for (int i = 0; i < arr.length - 1; i++) {
            int k = i;
            for (int j = k + 1; j < arr.length; j++) {
                if (arr[j] > arr[k]) {
                    k = j;
                }
            }
            if (i != k) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));







        /********** End **********/
    }
}
