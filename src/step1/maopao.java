package step1;

import java.util.Arrays;
import java.util.Scanner;

    public class maopao {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //动态创建数组
            int[] arr = new int[sc.nextInt()];
            for(int i = 0 ; i< arr.length ; i++){
                arr[i] = sc.nextInt();
            }
            /********** Begin **********/
for(int i=0;i<arr.length-1;i++){
    for(int j=0; j<arr.length-i-1;j++) {
        if(arr[j]>arr[j+1]){
            int a=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=a;
    }
}
}
System.out.println(Arrays.toString(arr));









            /********** End **********/
        }
    }


