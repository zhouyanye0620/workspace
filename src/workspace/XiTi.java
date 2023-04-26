package workspace;
public class XiTi {
    public static void main(String[] args) {
       /* int a=0;
        for(int i=1;i<101;i++){
            if(i%3!=0)
                a+=i;
        }
        System.out.println("1-100之间可以被3整除数之和为:"+a);
    }*/
        // 二维数组打印12行的杨辉三角
    int arr[][]=new int[12][12];
     for(int i=0;i<arr.length;i++){
         for(int j=0;j<=i;j++){
             if(j==0||j==i){
                 arr[i][j]=1;
                 }else {
                 arr[i][j]=arr[i-1][j-1]+arr[i-1][j];}
             System.out.print(arr[i][j]+"\t");
         }
         System.out.println(); }}
     }

