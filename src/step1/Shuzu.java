package step1;
import java.util.Scanner;

public class Shuzu {
    public static void main(String[] args) {
   /*     //动态构建arr1
        int[] arr1 = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i< arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        *//********** Begin **********//*
        //创建数组arr2
        int[] arr2=new int[3];


        //使用for循环将arr1的数据复制给arr2

        for(int i=0;i<arr2.length;i++){
            arr2=arr1;


        //输出arr2

        System.out.println(arr2[i]);}*/



/*        int []num=new int []{12,5,23,6,2};
        for(int num1=0;num1<num.length-2;num1++){
            for(int j=num1+1;j<=num.length-1;j++){
                if (num[num1]<num[j]){
                    int so= num[num1];
                    num[num1] = num[j];
                    num[j] = so;
                }
            }
        }
        for (int num1 = 0; num1 < num.length; num1++) {
            System.out.println(num[num1]);*/


        int arr[][]=new int[12][12];
        for(int num1=0;num1<arr.length;num1++){
            for(int j=0;j<=num1;j++){
                if(j==0||j==num1){
                    arr[num1][j]=1;
                }else {
                    arr[num1][j]=arr[num1-1][j-1]+arr[num1-1][j];}
                System.out.print(arr[num1][j]+" ");
            }
            System.out.println(); }
    }
}

